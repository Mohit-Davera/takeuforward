package aditya_stack;

import java.util.HashMap;
import java.util.Map;

class LFUCache {
    Map<Integer,DoublyLinkedList> freq;
    Map<Integer,Node> cache;
    int cap;
    int minimumFreq;

    public LFUCache(int capacity) {
        this.cap = capacity;
        cache = new HashMap<>();
        freq = new HashMap<>();
        minimumFreq = 0;
    }

    public int get(int key) {
        Node curr = cache.get(key);
        if(curr == null) return -1;
        updateNode(curr);
        return curr.value;
    }

    public void put(int key, int value) {
        if(cap == 0) return;

        if(cache.containsKey(key)){
            Node curr = cache.get(key);
            curr.value = value;
            updateNode(curr);
        }else{
            if(cache.size() + 1 > cap){
                DoublyLinkedList removeList = freq.get(minimumFreq);
                removeList.remove(removeList.tail.prev);
                cache.remove(removeList.tail.prev.key);
            }

            minimumFreq = 1;
            Node newNode = new Node(key,value);

            DoublyLinkedList firstList = freq.getOrDefault(1, new DoublyLinkedList());
            firstList.add(newNode);
            freq.put(1,firstList);
            cache.put(key,newNode);

        }
    }

    private void updateNode(Node curr){
        int currFreq = curr.freq;
        DoublyLinkedList list = freq.get(currFreq);
        list.remove(curr);

        if(currFreq == minimumFreq && list.size == 0){
            minimumFreq++;
        }

        curr.freq++;
        DoublyLinkedList newList = freq.getOrDefault(curr.freq,new DoublyLinkedList());
        newList.add(curr);
        cache.put(curr.key,curr);
        freq.put(curr.freq,newList);
    }


    class DoublyLinkedList{
        Node head;
        Node tail;
        int size;

        public DoublyLinkedList(){
            head = new Node(0,0);
            tail = new Node(0,0);
            head.next = tail;
            tail.prev = head;
        }

        void add(Node node){
            Node next = head.next;

            head.next = node;
            node.prev = head;

            node.next = next;
            next.prev = node;
            size++;
        }

        void remove(Node remove){
            Node next = remove.next;
            Node prev = remove.prev;

            prev.next =  next;
            next.prev = prev;
            size--;
        }

    }

    class Node{
        Node prev;
        Node next;
        int freq;

        int key;
        int value;

        public Node(int key,int value){
            this.key = key;
            this.value = value;
            this.freq = 1;
        }
    }

    public static void main(String[] args) {
        LFUCache lfuCache = new LFUCache(2);
        lfuCache.put(1,1);
        lfuCache.put(2,2);
        lfuCache.get(1);
        lfuCache.put(3,3);
        lfuCache.get(2);
        lfuCache.get(3);
        lfuCache.put(4,4);
        lfuCache.get(1);
        lfuCache.get(3);
        lfuCache.get(4);
    }
}

