package striver.tree.intro;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Iterative {
    public static void main(String[] args) {
        Node root = new Node(10);

        // Creating left subtree
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.left.right = new Node(12);

        // Creating right subtree
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        // Adding another level with leaves
        root.left.left.left = new Node(5);
        root.left.left.right = new Node(4);
        root.right.right.left = new Node(6);
        root.right.right.right = new Node(3);

        System.out.println("""
                EXPECTED
                Pre Order : 10 11 7 5 4 12 9 15 8 6 3\s
                InOrder : 5 7 4 11 12 10 15 9 6 8 3\s
                PostOrder : 5 4 7 12 11 15 6 3 8 9 10\s
                """);

        System.out.println(preorder(root));
        System.out.println(inOrder(root));
        System.out.println(postOrder(root));
    }

    public static List<Integer> preorder(Node root) {
        Stack<Node> s = new Stack<>();
        List<Integer> ans = new ArrayList<>();

        s.add(root);
        while (!s.isEmpty()) {
            Node pop = s.pop();
            if (pop.right != null) s.add(pop.right);
            if (pop.left != null) s.add(pop.left);
            ans.add(pop.data);
        }
        return ans;
    }

    public static List<Integer> inOrder(Node root) {
        Stack<Node> s = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        Node node = root;
        while (true) {
            if (node != null) {
                s.add(node);
                node = node.left;
            } else {
                if (s.isEmpty()) break;
                node = s.pop();
                ans.add(node.data);
                node = node.right;
            }
        }
        return ans;
    }

    public static List<Integer> postOrder(Node root){
        Stack<Node> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        st1.add(root);
        while (!st1.isEmpty()) {
            Node node = st1.pop();
            st2.add(node.data);
            if(node.left != null) st1.add(node.left);
            if(node.right != null) st1.add(node.right);
        }
        while (!st2.isEmpty()) ans.add(st2.pop());
        return ans;
    }
}
