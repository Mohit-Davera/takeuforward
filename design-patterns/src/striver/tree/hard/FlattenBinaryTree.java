package striver.tree.hard;

import striver.tree.intro.Node;

import java.util.Stack;

public class FlattenBinaryTree {
    public static void main(String[] args) {

    }

    public static void stackbased(Node root) {
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            Node pop = stack.pop();

            if (pop.right != null){
                stack.add(pop.right);
            }
            if (pop.left != null){
                stack.add(pop.left);
            }
            if(!stack.isEmpty())
                pop.right = stack.peek();
            pop.left = null;
        }
    }

    private Node prev = null;

    public void flatten(Node root) {
        if (root == null) return;

        flatten(root.right);
        flatten(root.left);

        root.right = prev;
        root.left = null;
        prev = root;
    }

    public void morrison(Node root){
        Node curr = root;

        while(curr != null){
            if(curr.left != null){
                Node prev = curr.left;
                while(prev.right != null){
                    prev = prev.right;
                }
                prev.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }
}
