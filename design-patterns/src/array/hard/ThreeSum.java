package array.hard;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(hashingApproach(new int[]{-1, 0, 1, 0}, 0));
    }

    public static List<List<Integer>> hashingApproach(int[] arr, int target) {
        Set<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            Set<Integer> integers = new HashSet<>();
            for (int j = i + 1; j < arr.length; j++) {
                int remaining = target - (arr[i] + arr[j]);
                if (integers.contains(remaining)) {
                    List<Integer> list = Arrays.asList(arr[i], arr[j], remaining);
                    Collections.sort(list);
                    ans.add(list);
                }
                integers.add(arr[j]);
            }
        }
        return new ArrayList<>(ans);
    }

    public static List<List<Integer>> threeSumApproach(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == target) {
                    ans.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1])
                        j++;
                    while (j < k && arr[k] == arr[k + 1])
                        k--;

                } else if (sum > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return ans;
    }
}
