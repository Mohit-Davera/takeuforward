package aditya_stack;

import java.util.Stack;

public class HistogramTUFSuperOp {

    public static void main(String[] args) {
        System.out.println(largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }

    public static int largestRectangleArea(int[] heights) {

        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) stack.pop();
            if (stack.isEmpty()) left[i] = 0;
            else left[i] = stack.peek() + 1;
            stack.add(i);
        }

        stack.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) stack.pop();
            if (stack.isEmpty()) right[i] = n - 1;
            else right[i] = stack.peek() - 1;
            stack.add(i);
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, heights[i] * (right[i] - left[i] + 1));
        }
        return res;
    }
}
