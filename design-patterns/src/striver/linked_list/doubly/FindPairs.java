package striver.linked_list.doubly;

import striver.linked_list.node.Node;

import java.util.ArrayList;
import java.util.List;

public class FindPairs {

    public static void main(String[] args) {

    }
    public List<Pair> findPair(Node head, int k) {
        List<Pair> pairs = new ArrayList<>();
        Node tail = head;

        while(tail.next != null) tail = tail.next;

        while(head != tail){
            int total = head.data + tail.data;
            if(total == k){
                pairs.add(new Pair(head,tail));
                head = head.next;
                tail = tail.prev;
            }
            else if(total > k){
                tail = tail.prev;
            }
            else{
                head = head.next;
            }
        }

        return pairs;
    }

    class Pair{
        Node first;
        Node last;
        Pair(Node first,Node last){
            this.first = first;
            this.last = last;
        }
    }
}
