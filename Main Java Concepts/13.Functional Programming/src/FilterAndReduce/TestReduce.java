package FilterAndReduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6);

       int newSum =  numbers.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer+integer2;
                    }
                });

        System.out.printf("Sum using reduce is %d ",newSum);

        int newSum2 = numbers.stream().reduce(0,(a,b)->a+b);
        System.out.printf("\nSum using reduce and Lambda is %d ",newSum);

        int newMax = numbers.stream()
                .reduce(Integer.MIN_VALUE,(a,b)-> a>b ? a:b);
        System.out.printf("\nMax using reduce is %d ",newMax);

    }
}
