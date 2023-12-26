package aditya_stack;

import heap_aditya.Pair;

import java.util.Stack;

public class MaximumAreaHistogram {
    public static void main(String[] args) {
        int solution = solution(new int[]{2,4});
        System.out.println(solution);
    }

    public static int solution(int[] nums) {
        int n = nums.length;
        int[] left = nearestSmallestIndexLeft(nums);
        int[] right = nearestSmallestIndexRight(nums);
        int max =Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, (right[i] - left[i] - 1) * nums[i]);
        }
        return max;
    }

    public static int[] nearestSmallestIndexLeft(int[] nums) {
        int n = nums.length;
        int[] ans = new int[nums.length];
        Stack<Pair<Integer, Integer>> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else if (stack.peek().getKey() < nums[i]) {
                ans[i] = stack.peek().getValue();
            } else {
                while (!stack.isEmpty() && stack.peek().getKey() >= nums[i]) {
                    stack.pop();
                }
                if (stack.isEmpty())
                    ans[i] = -1;
                else {
                    ans[i] = stack.peek().getValue();
                }
            }
            stack.add(new Pair<>(nums[i], i));
        }
        return ans;
    }

    public static int[] nearestSmallestIndexRight(int[] nums) {
        int n = nums.length;
        int[] ans = new int[nums.length];
        Stack<Pair<Integer, Integer>> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                ans[i] = n;
            } else if (stack.peek().getKey() < nums[i]) {
                ans[i] = stack.peek().getValue();
            } else {
                while (!stack.isEmpty() && stack.peek().getKey() >= nums[i]) {
                    stack.pop();
                }
                if (stack.isEmpty())
                    ans[i] = n;
                else {
                    ans[i] = stack.peek().getValue();
                }
            }
            stack.add(new Pair<>(nums[i], i));
        }
        return ans;
    }
}
