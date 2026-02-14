package striver.array.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlapping {
    public static void main(String[] args) {
        System.out.println(optimal(new int[][]{{1, 3}, {8, 10}, {2, 6}, {15, 18}}));
    }


    public static List<List<Integer>> brute(int[][] arr) {

        List<List<Integer>> answers = new ArrayList<>();
        Arrays.sort(arr, Comparator.comparingInt(o -> o[1]));
        for (int i = 0; i < arr.length; i++) {
            int start = arr[i][0];
            int end = arr[i][1];
            if (!answers.isEmpty() && end <= answers.get(answers.size() - 1).get(1))
                continue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j][0] <= end)
                    end = Math.max(arr[j][1], end);
                else break;
            }
            answers.add(Arrays.asList(start, end));
        }

        return answers;
    }

    public static List<List<Integer>> optimal(int[][] arr) {

        List<List<Integer>> answers = new ArrayList<>();
        Arrays.sort(arr, Comparator.comparingInt(o -> o[1]));
        for (int i = 0; i < arr.length; i++) {
            // if the current interval does not
            // lie in the last interval:
            if (answers.isEmpty() || arr[i][0] > answers.get(answers.size() - 1).get(1)) {
                answers.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
            // if the current interval
            // lies in the last interval:
            else {
                List<Integer> lastInterval = answers.get(answers.size() - 1);
                lastInterval.set(1, Math.max(lastInterval.get(1), arr[i][1]));
            }
        }
        return answers;
    }
}
