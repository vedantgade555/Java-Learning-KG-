package Multithreading.ThreadClass;

public class FIirstTask extends Thread {
    @Override
   public void run()
   {
       for (int i = 0; i <=1000 ; i++) {
           System.out.printf(" %d* ",i);
       }
       System.out.println("\n * task Complete");
       System.out.printf("\n %s * task completed ",Thread.currentThread().getName());
   }
}
