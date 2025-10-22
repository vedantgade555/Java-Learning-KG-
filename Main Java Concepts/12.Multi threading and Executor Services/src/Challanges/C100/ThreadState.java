package Challanges.C100;

public class ThreadState extends Thread{
    public void run()
    {
       try{
           Thread.sleep(4000);
           System.out.printf("From Inside run %s  ",getState());
       }catch (InterruptedException e){
           throw new RuntimeException(e);
       }
    }
}
