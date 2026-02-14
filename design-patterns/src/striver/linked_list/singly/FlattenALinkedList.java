package striver.linked_list.singly;

public class FlattenALinkedList {

    private static class Node {
        int data;
        Node next;
        Node child;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.child = new Node(7);
        head.child.child = new Node(11);
        head.child.child.child = new Node(12);


        Node second = new Node(4);
        second.child = new Node(9);


        Node last = new Node(5);
        last.child = new Node(6);
        last.child.child = new Node(8);

        head.next = second;
        second.next = last;
        Node recursion = recursion(head);
        Node temp = recursion;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.child;
        }
    }


    public static Node recursion(Node head) {
        if (head.next == null) return head;
        Node second = recursion(head.next);
        return merge(head, second);
    }

    public static Node merge(Node first, Node second) {

        Node ans = new Node(-1);
        Node ansHead = ans;
        first.next = null;
        while (first != null && second != null) {
            if (first.data <= second.data) {
                ans.child = first;
                ans = ans.child;
                first = first.child;
            } else {
                ans.child = second;
                ans = ans.child;
                second = second.child;
            }
        }
        while (first != null) {
            ans.child = first;
            ans = ans.child;
            first = first.child;
        }
        while (second != null) {
            ans.child = second;
            ans = ans.child;
            second = second.child;
        }

        return ansHead.child;

    }
}
