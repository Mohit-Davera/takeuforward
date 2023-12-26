package aditya_stack;

import java.util.Stack;

public class NextSmallestElementRight {
    public static void main(String[] args) {
        solution(new int[]{4,5,2,10,8});
    }

    public static int[] solution(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] ans = new int[nums.length];
        for (int i = 0; i < n ; i++) {
            if (stack.empty()) {
                ans[i] = -1;
            } else if (!stack.isEmpty() && stack.peek() < nums[i]) {
                ans[i] = stack.peek();
            } else {
                while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                    stack.pop();
                }
                if (stack.empty()) ans[i] = -1;
                else ans[i] = stack.peek();
            }

            stack.add(nums[i]);
        }

        print(ans);
        //reverse
        int i = 0;
        while (i <= n / 2) {
            int temp = ans[i];
            ans[i] = ans[n - i - 1];
            ans[n - i - 1] = temp;
            i++;
        }

        return ans;


    }

    static void print(int[] nums){
        for (int i :
                nums) {
            System.out.print(i+" ");
        }
    }
}
