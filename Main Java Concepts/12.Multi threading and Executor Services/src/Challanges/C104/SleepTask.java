package Challanges.C104;

public class SleepTask implements Runnable {
    public void run()
    {
        String current = Thread.currentThread().getName();
        System.out.printf("Started Thread : %s\n",current);
        try {
            Thread.sleep(getRandom()*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("Ended Thread : %s\n",current);
    }

    private int getRandom()
    {
        double random = Math.random()*5+1;
        return (int) random;
    }
}
