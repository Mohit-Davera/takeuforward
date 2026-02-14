package testing;

import java.util.concurrent.*;

public class RunnableAndCallable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executeService = Executors.newFixedThreadPool(2);

        Future<?> helloWorld = executeService.submit(() -> {
            System.out.println("HELLO WORLD");
        });


        CallableImpl call = new CallableImpl();
        Future<String> submit = executeService.submit(call);

        String s = submit.get();
        System.out.println(s);

    }

}


