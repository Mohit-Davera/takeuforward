package striver.tree.hard;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class InfectTreeBurnTree {
    public static void main(String[] args) {

    }

    public static int amountOfTime(TreeNode root, int start) {
        HashMap<TreeNode, TreeNode> parentGraph = new HashMap<>();
        TreeNode target = parentGraph(root, parentGraph, start);
        Queue<TreeNode> q = new LinkedList<>();

        HashMap<TreeNode, Boolean> isInfected = new HashMap<>();
        int min = 0;
        q.add(target);
        isInfected.put(target, true);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = q.poll();

                if (poll.left != null && !isInfected.containsKey(poll.left)) {
                    q.add(poll.left);
                    isInfected.put(poll.left, true);
                }
                if (poll.right != null && !isInfected.containsKey(poll.right)) {
                    q.add(poll.right);
                    isInfected.put(poll.right, true);
                }
                if (parentGraph.get(poll) != null && !isInfected.containsKey(parentGraph.get(poll))) {
                    q.add(parentGraph.get(poll));
                    isInfected.put(parentGraph.get(poll), true);
                }
            }
            if (!q.isEmpty()) min++;
        }
        return min;
    }

    public static TreeNode parentGraph(TreeNode root, HashMap<TreeNode, TreeNode> parentGraph, int start) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode target = null;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = q.poll();
                if (poll.val == start) target = poll;
                if (poll.left != null) {
                    q.add(poll.left);
                    parentGraph.put(poll.left, poll);
                }

                if (poll.right != null) {
                    q.add(poll.right);
                    parentGraph.put(poll.right, poll);
                }
            }
        }
        return target;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
