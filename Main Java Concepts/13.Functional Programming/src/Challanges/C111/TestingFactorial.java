package Challanges.C111;

import java.util.stream.IntStream;

public class TestingFactorial {
    public static void main(String[] args) {
        int num=9;
        System.out.println(factorial(5));

        IntStream.rangeClosed(2,num)
                .reduce((a,b)->a*b)
                .ifPresent(System.out::println);
    }

    public static long factorial(int num)
    {
        if(num == 0  || num == 1)
        {
            return 1;
        }
        long fact=1;
        for (int i = 2; i <=num ; i++) {
            fact*=i;
        }
        return fact;
    }
}
