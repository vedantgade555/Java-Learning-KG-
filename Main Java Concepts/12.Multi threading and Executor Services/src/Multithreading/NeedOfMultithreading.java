package Multithreading;

public class NeedOfMultithreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

//        First Task
        for (int i = 0; i <=1000 ; i++) {
            System.out.printf(" %d* ",i);
        }
        System.out.println("\n * task Complete");

//        Second Task
        for (int i = 0; i <=1000 ; i++) {
            System.out.printf(" %d# ",i);
        }
        System.out.println("\n # task Complete");

//        Third Task

        for (int i = 0; i <=1000 ; i++) {
            System.out.printf(" %d$ ",i);
        }
        System.out.println("\n $ task Complete");

        long endTime = System.currentTimeMillis();

        System.out.println("Total Time Taken "+(endTime-startTime));
    }
}
