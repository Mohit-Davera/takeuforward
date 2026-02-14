package striver.recursion.one;

import java.util.Stack;

public class SortStackUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(5);
        stack.add(4);
        stack.add(3);
        stack.add(2);
        stack.add(1);


//        insert(stack,0);
        recursion(stack);
        System.out.println(stack);
    }

    private static void recursion(Stack<Integer> stack) {
        if (stack.size() == 1) return;
        int top = stack.pop();
        recursion(stack);
        insert(stack, top);
    }

    private static void insert(Stack<Integer> stack, int top) {
        if (stack.empty() || stack.peek() <= top) {
            stack.push(top);
            return;
        }
        int temp = stack.pop();
        insert(stack, top);
        stack.add(temp);
    }


}
