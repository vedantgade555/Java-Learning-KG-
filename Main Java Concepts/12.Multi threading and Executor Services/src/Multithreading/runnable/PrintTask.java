package Multithreading.runnable;

public class PrintTask implements Runnable{
    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }

    @Override
    public void run()
    {
        for (int i = 0; i <=1000 ; i++) {
            System.out.printf(" %d%c ",i,targetChar);
        }
        System.out.printf("\n %c task Complete",targetChar);
        System.out.printf("\n %s %c task completed ",Thread.currentThread().getName(),targetChar);
    }

    private final char targetChar;
}
