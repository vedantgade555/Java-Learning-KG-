package MultiThrading.Runable;
public class testPriority {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        printTask p1 = new printTask('*');
        printTask p2 = new printTask('$');
        printTask p3 = new printTask('#');


        Thread t1 = new Thread(p1);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.start();
        Thread t3 = new Thread(p3);
//        t3.setPriority(Thread.MAX_PRIORITY);

//        We Can set priority only in the range of 1 to 10
        t3.setPriority(10);

        t3.start();
        long endTime=System.currentTimeMillis();

        System.out.printf("%sTotal time taken : %d ms",
                Thread.currentThread().getName() ,(endTime-startTime));


    }
}
