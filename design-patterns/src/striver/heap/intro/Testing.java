package striver.heap.intro;

import java.util.PriorityQueue;

public class Testing {
    public static void main(String[] args) {
        maxheap();
    }

    public static void characterDemo(){
        PriorityQueue<Character> q = new PriorityQueue<>((t1, t2) -> t2 - t1);

        q.add('c');
        q.add('o');
        q.add('d');
        Character poll = q.poll();
        System.out.println(poll + " " + q);
        q.add('i');
        q.add('n');
        poll = q.poll();
        System.out.println(poll + " " + q);
        q.add('g');
    }

    public static void minHeap()
    {
        PriorityQueue<Integer> q = new PriorityQueue<>();


        q.add(4);
        q.add(0);
        q.add(2);
        q.add(9);
        q.add(8);
        q.add(5);
        q.add(1);

        while(!q.isEmpty()) System.out.print(q.poll() + " ");

    }

    public static void maxheap()
    {
        PriorityQueue<Integer> q = new PriorityQueue<>((t1, t2) -> t2 - t1);


        q.add(4);
        q.add(0);
        q.add(2);
        q.add(9);
        q.add(8);
        q.add(5);
        q.add(1);

        while(!q.isEmpty()) System.out.print(q.poll() + " ");

    }
}
