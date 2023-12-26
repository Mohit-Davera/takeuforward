package aditya_stack;

import java.util.Stack;

public class HistogramTUFSuperOp {

    public static void main(String[] args) {
        System.out.println(largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
    }

    public static int largestRectangleArea(int[] heights) {

        int n = heights.length;
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= n; i++) {
            int h = i == n ? 0 : heights[i];

            while (!stack.isEmpty() && (i == n || heights[stack.peek()] >= h)) {
                int height = heights[stack.pop()];
                int width;
                if (stack.isEmpty()) width = i;
                else width = i - stack.peek() - 1;
                ans = Math.max(ans, height * width);
            }
            stack.add(i);
        }
        return ans;
    }
}
