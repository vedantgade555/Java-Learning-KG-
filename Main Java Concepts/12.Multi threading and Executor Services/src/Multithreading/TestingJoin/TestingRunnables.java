package Multithreading.TestingJoin;

import Multithreading.runnable.PrintTask;

class TestJoin  {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('#');
        PrintTask p3 = new PrintTask('$');

        Thread t1 = new Thread(p1);
        t1.start();
        System.out.println("\n Thread 1 Started");
        t1.join();
        Thread t2 = new Thread(p2);
        t2.start();
        System.out.println("\n Thread 2 Started");
        t2.join();
        t1.join(); // t3 will wait until thread 1 complete its execution
        Thread t3 = new Thread(p3);
        t3.start();
        System.out.println("\n Thread 3 Started");


        long endTime = System.currentTimeMillis();
        System.out.println("Total Time Taken "+(endTime-startTime));
    }
}
