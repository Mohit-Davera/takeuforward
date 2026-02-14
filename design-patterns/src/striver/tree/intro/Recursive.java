package striver.tree.intro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Recursive {
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

        //PreOrder
        System.out.print("Pre Order : ");
        preOrder(root);
        System.out.println();

        //InOrder
        System.out.print("InOrder : ");
        inOrder(root);
        System.out.println();

        System.out.print("PostOrder : ");
        postOrder(root);
        System.out.println();

        System.out.print("BFS Level Order  : ");
        List<List<Integer>> lists = levelOrder(root);
        System.out.println(lists);

    }

    private static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> levels = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0;i<size;i++){
                Node poll = q.poll();
                level.add(poll.data);
                if(poll.left != null) q.add(poll.left);
                if(poll.right != null) q.add(poll.right);
            }
            levels.add(level);
        }
        return levels;

    }


    public static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}
