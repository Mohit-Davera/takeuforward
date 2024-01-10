package threading.prod_cons;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    private int cap;

    private Queue<Integer> queue;

    TestQueue(int cap) {
        this.cap = cap;
        queue = new LinkedList<>();
    }

    public boolean add(int item) {
        synchronized (queue) {
            if (queue.size() == cap) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    System.err.println("RED");
                }
            }
            queue.notifyAll();
            return queue.add(item);
        }
    }

    public int remove() {
        synchronized (queue) {
            if (queue.isEmpty()) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    System.err.println("RED");
                }
            }
            queue.notifyAll();
            return queue.poll();
        }
    }
}
