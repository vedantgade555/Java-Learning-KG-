package Multithreading.ThreadClass;

public class ExtendingThreadClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        FIirstTask t1 = new FIirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();
//
        System.out.println("Starting First Thread");
        t1.start();
        System.out.println("Starting Second Thread");
        t2.start();
        System.out.println("Starting Third Thread");
        t3.start();

        long endTime = System.currentTimeMillis();
        System.out.println("Total Time Taken "+(endTime-startTime));


    }
}
