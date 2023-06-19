package array.old.easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class MaximumOfAllSubArraysSizeK {
    static List<Integer> logic(int[] arr, int k) {
        List<Integer> answers = new ArrayList<>();
        int start = 0;
        int end = 0;
        int len = arr.length;
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        while (end < len) {
            while (!arrayDeque.isEmpty() && arrayDeque.peekLast() < arr[end]) {
                arrayDeque.pollLast();
            }
            arrayDeque.addLast(arr[end]);
            if (end - start + 1 < k) {
                end++;
            } else {
                Integer first = arrayDeque.peek();
                answers.add(first);
                if (first != null && arr[start] == first)
                    arrayDeque.poll();
                start++;
                end++;
            }
        }
        return answers;
    }

    public static void main(String[] args) {
        int k = 3;
        List<Integer> answers = logic(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, k);
        System.out.println(answers);

    }
}
