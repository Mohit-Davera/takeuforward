package aditya_stack;

import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String input = "(p+q)*(c-d)";
        char[] i = input.toCharArray();
        reverse(i);
        String inputReversed = new String(i);
        System.out.println("Reversed : "  + inputReversed);

        //output side
        String output = infixToPrefix(inputReversed);
        char[] o = output.toCharArray();
        reverse(o);
        System.out.println("Output : " + new String(o));
    }
    static String infixToPrefix(String exp) {
        // initializing empty String for result
        String result = "";

        // initializing empty stack
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            // If the scanned character is an
            // operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;

                // If the scanned character is an '(',
                // push it to the stack.
            else if (c == '(')
                stack.push(c);

                // If the scanned character is an ')',
                // pop and output from the stack
                // until an '(' is encountered.
            else if (c == ')') {
                while (!stack.isEmpty() &&
                        stack.peek() != '(')
                    result += stack.pop();

                stack.pop();
            } else // an operator is encountered
            {
                while (!stack.isEmpty() && prec(c) <
                        prec(stack.peek())) {

                    result += stack.pop();
                }
                stack.push(c);
            }

        }

        // pop all the operators from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
        }
        return result;
    }
    static int prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    public static void reverse(char[] s){
        int i = 0;
        int j = s.length - 1;

        while(i<j){
            if (s[i] != '(' && s[i] != ')') {
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
            }
            i++;
            j--;
        }


    }
}
