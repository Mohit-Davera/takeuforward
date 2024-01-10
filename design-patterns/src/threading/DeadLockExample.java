package threading;

public class DeadLockExample {
    public static void main(String[] args) {
        String lock1 = "Lock1";
        String lock2 = "Lock2";

        Thread t1 = new Thread(() -> {

            System.out.println(Thread.currentThread().getName() + " trying to get LOCK1 ");
            synchronized (lock1){
                System.out.println(Thread.currentThread().getName() + " got LOCK1 ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() +  " trying to get LOCK2 ");
                synchronized (lock2){
                    System.out.println(Thread.currentThread().getName() + " Got Lock1 And Lock2 Task Completed");
                }
            }


        },"Thread 1");

        Thread t2 = new Thread(() -> {

            System.out.println(Thread.currentThread().getName() + " trying to get LOCK2 ");
            synchronized (lock2){
                System.out.println(Thread.currentThread().getName() + " got LOCK2 ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " trying to get LOCK1 ");
                synchronized (lock1){
                    System.out.println(Thread.currentThread().getName() + " Got Lock1 And Lock2 Task Completed");
                }
            }


        }, "Thread 2");
        t1.start();
        t2.start();
    }
}
