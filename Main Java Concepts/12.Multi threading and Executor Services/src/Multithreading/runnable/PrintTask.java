package Multithreading.runnable;

public class PrintTask implements Runnable{
    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }

    @Override
    public void run()
    {
        for (int i = 0; i <=100 ; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf(" %d%c ",i,targetChar);
        }
        System.out.printf("\n %c task Complete",targetChar);
        System.out.printf("\n %s %c task completed ",Thread.currentThread().getName(),targetChar);
    }

    private final char targetChar;
}
