package linked_list.singly;

import linked_list.node.Node;

public class PalindromeLinked {
    public static void main(String[] args) {
/*        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);*/

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(1);

        LinkedListPrinter.print(head);
        System.out.println(isPalindrome(head));
        LinkedListPrinter.print(head);
    }

    public static boolean isPalindrome(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        fast = head;
        slow = reverse(slow.next);
        Node newHead = slow;
        while(slow!=null){
            if(slow.data != fast.data){
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        reverse(newHead);
        return true;
    }

    public static Node reverse(Node head) {
        Node pre = null;
        while(head != null){
            Node next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;

    }
}
