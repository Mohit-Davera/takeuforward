package tree.intro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

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
}
