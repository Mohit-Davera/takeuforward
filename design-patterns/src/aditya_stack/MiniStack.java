package aditya_stack;

import java.util.Objects;
import java.util.Stack;

public class MiniStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> ss = new Stack<>();

    void push(int i) {
        stack.push(i);
        if (ss.isEmpty() || ss.peek() >= i) {
            ss.push(i);
        }
    }

    int pop() {
        if (!stack.isEmpty()) {
            Integer pop = stack.pop();
            if (!ss.isEmpty() && Objects.equals(pop, ss.peek())) {
                ss.pop();
            }
            return pop;
        }
        return -1;
    }

    int getMin() {
        if(ss.isEmpty()) return -1;
        return ss.peek();
    }
}

class MiniRunner {
    public static void main(String[] args) {
        MiniStack miniStack = new MiniStack();
        miniStack.push(18);
        miniStack.push(19);
        System.out.println(miniStack.getMin());
        miniStack.pop();
        miniStack.pop();
        System.out.println(miniStack.getMin());
        miniStack.push(24);
        miniStack.push(15);
        System.out.println(miniStack.getMin());
        miniStack.push(16);

    }
}
