package aditya_stack;


import heap_aditya.Pair;

import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};

//        int[] price = {10, 4, 5, 90, 120, 80};
        solution(price);
    }

    public static int[] solution(int[] price) {
        Stack<Pair<Integer, Integer>> stack = new Stack<>();
        int n = price.length;
        int[] ans = new int[price.length];
        for (int i = 0; i < n; i++) {
            if (stack.empty()) {
                ans[i] = 1;
            } else if (!stack.isEmpty() && stack.peek().getKey() > price[i]) {
                ans[i] = i - stack.peek().getValue();
            } else {
                while (!stack.isEmpty() && stack.peek().getKey() <= price[i]) {
                    stack.pop();
                }
                if (stack.empty()) ans[i] = i+1;
                else ans[i] = i - stack.peek().getValue();
            }

            stack.add(new Pair<>(price[i], i));
        }

        print(ans);
        return ans;
    }

    static void print(int[] nums) {
        for (int i :
                nums) {
            System.out.print(i + " ");
        }
    }
}
