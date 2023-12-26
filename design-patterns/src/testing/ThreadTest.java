package testing;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Thread task = new Task();
        task.start();
        for (int i = 0; i < 11; i++) {
            Thread.sleep(500);
            System.out.println("testing.Main THREAD RUNNING");
        }
        task.start();
    }
}

class Task extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println("THREAD RUNNING");
        }
    }
}
