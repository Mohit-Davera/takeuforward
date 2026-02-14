package testing;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        SharedResource obj = new SharedResource();
        Runnable r1 = () -> {
            for(int i = 0;i<100000;i++){
                obj.increment();
                obj.incrementAtomic();
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        Runnable r2 = () -> {
            for(int j = 0;j<100000;j++){
                obj.increment();
                obj.incrementAtomic();
            }
        };
        Thread t2 = new Thread(r2);
        t2.start();

        t1.join();
        t2.join();
        System.out.println(obj.count);
        System.out.println(obj.get());
    }
}

class SharedResource extends Thread{
    boolean flag = false;
    AtomicInteger atomicC = new AtomicInteger(0);
    int count = 0;

    public synchronized void increment(){
        this.count++;
    }

    public void incrementAtomic(){
        this.atomicC.incrementAndGet();
    }

    public int get(){
        return this.atomicC.get();
    }
}
