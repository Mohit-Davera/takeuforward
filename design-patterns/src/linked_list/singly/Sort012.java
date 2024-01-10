package linked_list.singly;

import linked_list.node.Node;

public class Sort012 {
    public static void main(String[] args) {
        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(0);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next.next = new Node(0);
        head.next.next.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next.next.next = new Node(1);

        Node ans = sortList(head);
        print(ans);
    }

    public static Node sortList(Node head) {
        Node curr = head;

        if (head == null || head.next == null) return head;

        Node zero = new Node(-1);
        Node zeroHead = zero;
        Node one = new Node(-1);
        Node oneHead = one;
        Node two = new Node(-1);
        Node twoHead = two;

        while (curr != null) {
            if (curr.data == 0) {
                zero.next = curr;
                zero = zero.next;
            } else if (curr.data == 1) {
                one.next = curr;
                one = one.next;
            } else {
                two.next = curr;
                two = two.next;
            }
            curr = curr.next;
        }

        zero.next = (oneHead.next != null )? oneHead.next : twoHead.next;
        one.next = twoHead.next;

        two.next = null;
        return zeroHead.next;
    }

    static void print(Node head){
        while(head != null){

            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
