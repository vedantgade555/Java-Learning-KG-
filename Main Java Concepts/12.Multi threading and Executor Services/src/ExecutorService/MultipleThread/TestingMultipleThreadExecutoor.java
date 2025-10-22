package ExecutorService.MultipleThread;

import Multithreading.runnable.PrintTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class TestingMultipleThreadExecutoor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
//        Three Threads are used to complete the task

        for (int i = 0; i < 10; i++) {
            PrintTask task = new PrintTask( (char) i);
            service.submit(task);
        }

        service.shutdown();
        System.out.println(" ************ ");
        if(!service.awaitTermination(10, TimeUnit.SECONDS));
        {
            service.shutdownNow();
        }
    }
}
