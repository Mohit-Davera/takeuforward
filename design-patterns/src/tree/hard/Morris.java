package tree.hard;

import tree.intro.Node;

import java.util.ArrayList;
import java.util.List;

public class Morris {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.left.right.right = new Node(6);
        List<Integer> integers = inorderTraversal(root);
    }

    public static List<Integer> inorderTraversal(Node root) {
        //morris traversal
        List<Integer> list = new ArrayList<>();

        Node curr = root;

        while (curr != null) {
            if (curr.left == null) {
                list.add(curr.data);
                curr = curr.right;
            } else {
                Node prev = curr.left;

                while (prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }
                if (prev.right == null) {
                    prev.right = curr;
                    curr = curr.left;
                } else {
                    prev.right = null;
                    list.add(curr.data);
                    curr = curr.right;
                }
            }
        }
        return list;

    }

}
