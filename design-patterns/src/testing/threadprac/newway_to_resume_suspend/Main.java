package testing.threadprac.newway_to_resume_suspend;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread a = new MyThread("a");

        Thread.sleep(1000);
        a.suspend();
        Thread.sleep(500);
        a.resume();


        Thread.sleep(1000);
    }
}
