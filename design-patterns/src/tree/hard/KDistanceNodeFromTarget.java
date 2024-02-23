package tree.hard;

import java.util.*;

public class KDistanceNodeFromTarget {
    public static void main(String[] args) {

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode, TreeNode> parentMap = new HashMap<>();
        findParents(root, parentMap);

        HashMap<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);
        visited.put(target, true);
        int distance = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            if (distance == k) break;
            distance++;
            for (int i = 0; i < size; i++) {
                TreeNode poll = q.poll();
                if (poll.left != null && !visited.containsKey(poll.left)) {
                    q.add(poll.left);
                    visited.put(poll.left, true);
                }
                if (poll.right != null && !visited.containsKey(poll.right)) {
                    q.add(poll.right);
                    visited.put(poll.right, true);
                }
                if (parentMap.get(poll) != null && !visited.containsKey(parentMap.get(poll))) {
                    q.add(parentMap.get(poll));
                    visited.put(parentMap.get(poll), true);
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        while (!q.isEmpty()) {
            ans.add(q.poll().val);
        }
        return ans;
    }

    public void findParents(TreeNode root, Map<TreeNode, TreeNode> parentMap) {
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node.left != null) {
                parentMap.put(node.left, node);
                q.add(node.left);
            }
            if (node.right != null) {
                parentMap.put(node.right, node);
                q.add(node.right);
            }
        }
    }
}
