package ExecutorService.SingleThread;

import Multithreading.runnable.PrintTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TestingSingleThreadExecutoor {
    public static void main(String[] args) {
//       ExecutorService service = Executors.newSingleThreadExecutor();
        ExecutorService service = Executors.newFixedThreadPool(3);
//        Three Threads are used to complete the task

        PrintTask task1 = new PrintTask('*');
        PrintTask task2 = new PrintTask('#');
        PrintTask task3 = new PrintTask('$');


        service.submit(task1);
        service.submit(task2);
        service.submit(task3);

        service.shutdown();
    }
}
