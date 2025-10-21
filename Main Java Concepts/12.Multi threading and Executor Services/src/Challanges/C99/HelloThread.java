package Challanges.C99;

public class HelloThread extends Thread {
    private final int threadNumber;

    public HelloThread(int threadNumber)
    {
        this.threadNumber=threadNumber;
    }

    public void run()
    {
        for (int i = 0; i < 10; i++) {
            System.out.printf("\n(%d) %s Hello from Thread  %d",i+1,Thread.currentThread().getName(),threadNumber);
        }
    }
}
