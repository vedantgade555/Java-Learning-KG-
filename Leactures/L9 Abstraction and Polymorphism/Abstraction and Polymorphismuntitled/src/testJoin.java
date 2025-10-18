package MultiThrading.Join;

public class testJoin {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        printTask p1 = new printTask('*');
        printTask p2 = new printTask('$');
        printTask p3 = new printTask('#');


        Thread t1 = new Thread(p1);
        t1.start();
        System.out.printf("\nThread 1 started");
        t1.join();
        Thread t2 = new Thread(p2);
        t2.start();
        t2.join();
        System.out.printf("\nThread 2 Started");
        t1.join();
        Thread t3 = new Thread(p3);
        t3.start();
        System.out.printf("\nThread 3 Started");



        long endTime=System.currentTimeMillis();

        System.out.printf("%sTotal time taken : %d ms",
                Thread.currentThread().getName() ,(endTime-startTime));


    }
}
