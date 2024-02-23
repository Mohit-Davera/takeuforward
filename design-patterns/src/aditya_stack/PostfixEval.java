package aditya_stack;

import java.util.Stack;

public class PostfixEval {
    public static void main(String[] args) {
        String prefix = "934*8+4/-";
        double evaluate = evaluate(prefix);
        System.out.println(evaluate);
    }

    public static double evaluate(String prefix) {
        Stack<Integer> stack = new Stack<>();

        for (char c : prefix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                stack.push(c - '0');
            } else {
                stack.push((int)evalOnOp(stack,c));
            }
        }
        return stack.pop();
    }

    public static double evalOnOp(Stack<Integer> stack, char op) {
        int val2 = stack.pop();
        int val1 = stack.pop();
        switch (op) {
            case '+':
                return val1 + val2;
            case '-':
                return val1 - val2;
            case '/':
                return val1 / val2;
            case '*':
                return val1 * val2;
            case '^':
                return Math.pow(val1,val2);
            default: return 0;
        }
    }
}
