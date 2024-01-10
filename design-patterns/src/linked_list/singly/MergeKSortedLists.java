package linked_list.singly;

import heap_aditya.Pair;
import linked_list.node.Node;

import java.util.PriorityQueue;

public class MergeKSortedLists {
    public static void main(String[] args) {

    }

    public static Node logic(Node[] nodes){
        PriorityQueue<Pair<Integer,Node>> pq = new PriorityQueue<>();

        Node ansHead = new Node(-1);
        Node ans = ansHead;

        for(Node n : nodes){
            pq.add(new Pair<>(n.data,n));
        }
        while(!pq.isEmpty()){
            Node value = pq.poll().getValue();
            ans.next = value;
            ans = ans.next;
            value = value.next;
            pq.add(new Pair<>(value.data,value));
        }
        return ansHead.next;
    }
}
