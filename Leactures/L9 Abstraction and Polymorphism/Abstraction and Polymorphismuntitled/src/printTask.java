package MultiThrading.Join;

public class printTask implements Runnable {

    @Override
    public void run() {
        for(int i=1;i<=1000;i++){
            System.out.printf("%d%c ",i,targetChar);
        }
        System.out.printf("\n %s %c task complete\n",Thread.currentThread().getName(),targetChar);
    }

    private char targetChar;

    public printTask(char targetChar) {
        this.targetChar = targetChar;
    }
}
