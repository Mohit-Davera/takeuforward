package interview;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(1);
        st.push(20);
        st.push(220);
        st.push(2);

        for (int i : st) System.out.print(i+ " ");
        System.out.println();
        while (!st.isEmpty()) {
            System.out.print(st.pop()+ " ");
        }
    }
}
