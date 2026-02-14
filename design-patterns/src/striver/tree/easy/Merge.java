package striver.tree.easy;

import striver.tree.intro.Node;

public class Merge {
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);

        Node ans = mergeTrees(root1, root2);
    }

    public static Node mergeTrees(Node root1, Node root2) {
        return merge(root1, root2);
    }

    private static Node merge(Node root1, Node root2) {
        if (root1 == null && root2 == null) return null;
        if (root1 == null || root2 == null) {
            if (root1 != null) {
                return new Node(root1.data);
            }
            return new Node(root2.data);
        }


        Node ans = new Node(0);
        ans.data = root1.data + root2.data;
        ans.left = merge(root1.left, root2.left);
        ans.right = merge(root1.right, root2.right);
        return ans;
    }
}
