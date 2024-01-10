package linked_list.singly;

import linked_list.node.Node;

public class LinkedListPrinter {
    public static void print(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
