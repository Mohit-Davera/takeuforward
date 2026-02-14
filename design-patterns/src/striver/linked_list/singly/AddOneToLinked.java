package striver.linked_list.singly;

import striver.linked_list.node.Node;

public class AddOneToLinked {
    public static void main(String[] args) {
        Node head = new Node(9);
        head.next = new Node(9);
        head.next.next = new Node(9);
        head.next.next.next = new Node(9);

        int i = recursiveSolution(head);
        if(i != 0){
            Node newHead = new Node(i);
            newHead.next = head;
            LinkedListPrinter.print(newHead);
        }
        else LinkedListPrinter.print(head);
    }

    public static int recursiveSolution(Node head){
        if(head == null)
            return 1;
        int carry = recursiveSolution(head.next);
        head.data += carry;
        carry = head.data / 10;
        head.data = head.data%10;
        return carry;
    }
}
