package striver.linked_list.singly;


import striver.linked_list.node.Node;

public class ReverseALinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
//        head.next.next.next.next.next = new Node(6);
        printLinkedList(head);
        Node reverse = reverse(head);
        printLinkedList(reverse);
    }

    public static void printLinkedList(Node head){
        while(head != null){
            System.out.println(head.data + " ");
            head = head.next;
        }
    }

    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
