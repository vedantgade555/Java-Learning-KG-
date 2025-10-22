package Challanges.C105;

import java.util.concurrent.Callable;

public class FactorialCalc implements Callable<Integer> {
    private final int number;

    public FactorialCalc(int number) {
        this.number = number;
    }

    public Integer call() throws Exception{
        Thread.sleep(2000);
        if(number<=1)
        {
           return 1;
        }
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *=i;
        }
        return result;
    }
}
