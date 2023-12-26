package testing.threadprac.newway_to_resume_suspend;

public class MyThread implements Runnable {
    boolean isSuspend = false;
    String name;
    Thread t;

    public synchronized void resume() {
        isSuspend = false;
        notify();
        System.out.println("RESUMED");
    }

    public void suspend() {
        isSuspend = true;
        System.out.println("SUSPENDED");
    }

    public MyThread(String threadName) {
        name = threadName;
        t = new Thread(this, threadName);
        System.out.println("New thread: " + t);
        isSuspend = false;
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " " + i);
            try {
                Thread.sleep(200);
                synchronized (this) {
                    while (isSuspend)
                        wait();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
