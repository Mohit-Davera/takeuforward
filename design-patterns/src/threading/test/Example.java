package threading.test;

public class Example {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("MAIN START");
        Thread t1 = new Thread(() -> {
            System.out.println("Hello From "+ Thread.currentThread().getName() );
        },"New Thead");


        t1.start();
        t1.join();
        System.out.println("MAIN END");
    }
}
