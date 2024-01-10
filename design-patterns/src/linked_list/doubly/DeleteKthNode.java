package linked_list.doubly;


import linked_list.node.Node;

public class DeleteKthNode {
    public static void main(String[] args) {
        Node head = constructDLL(new int[]{4, 2, 5, 1});
        Node node1 = deleteNode(head, 5);
    }

    public static Node deleteNode(Node head, int k) {
        if(head == null || head.next == null) return null;

        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            if(count == k){
                break;
            }
            temp = temp.next;
        }
        if(count<k) return head;
        Node front = temp.next;
        Node back = temp.prev;
        if(front == null && back == null){
            return null;
        }
        else if(back == null){
            temp.next.prev = null;
            return temp.next;
        }
        else if(front == null){
            back.next = null;
            temp.next = null;
        }else{
            back.next = front;
            front.prev = back;
            temp.next = null;
            temp.prev = null;
        }
        return head;
    }

    public static Node constructDLL(int []arr) {
        Node temp = new Node(arr[0]);
        Node head = temp;

        for(int i = 1;i<arr.length;i++){
            Node curr = new Node(arr[i]);
            temp.next = curr;
            curr.prev = temp;
            temp = curr;
        }
        return head;
    }
}
