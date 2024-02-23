package array.slidingwindow;

import java.util.*;

public class MaximumOfAllSubArraysSizeK {
    static List<Integer> logic(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) {
            return new ArrayList<>();
        }
        int index = 0;
        int[] result = new int[n - k + 1];
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if(!q.isEmpty() && q.peek() == i - k){
                q.poll();
            }
            while(!q.isEmpty() && nums[q.peekLast()] <= nums[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i >= k - 1){
                result[index++] = nums[q.peek()];
            }
        }
        return Arrays.stream(result).boxed().toList();
    }

    public static void main(String[] args) {
        int k = 3;
        List<Integer> answers = logic(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, k);

        answers.stream().mapToInt(integer -> integer).toArray();
        System.out.println(answers);

    }
}
