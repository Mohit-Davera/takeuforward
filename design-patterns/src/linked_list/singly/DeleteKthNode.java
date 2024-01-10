package linked_list.singly;

import linked_list.node.Node;

public class DeleteKthNode {
    public static void main(String[] args) {


    }

//    pos is zero based
    public static Node logic(Node head, int pos){
        if(head == null || head.next == null) return head;
        if(pos == 0) return head.next;

        Node temp = head;
        Node prev = null;
        int count = 0;

        while(temp != null){
            if(count == pos){
                prev.next = prev.next.next;
                break;
            }
            count++;
            prev = temp;
            temp = temp.next;
        }

        return head;
    }
}
