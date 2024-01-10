package threading.prod_cons;

public class Tester {

    static volatile boolean isStopped = false;
    public static void main(String[] args) throws InterruptedException {

        TestQueue queue = new TestQueue(10);

        Thread producer = new Thread(() -> {
            int i = 1;
            while (!isStopped) {
                queue.add(i++);
                System.out.print("Added this : " + (i - 1));
            }
        });

        Thread consumer = new Thread(() -> {
            while (!isStopped) {
                int remove = queue.remove();
                System.out.println("Got this : " + remove);
            }
        });

        producer.start();
        consumer.start();

        Thread.sleep(100);
        isStopped = true;
    }
}
