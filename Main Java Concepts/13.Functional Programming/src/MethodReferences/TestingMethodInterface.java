package MethodReferences;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingMethodInterface {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6);

        //        Method Reference
        numbers.stream()
                .filter(num -> num%2==1)
                .forEach(System.out::println);

        numbers.stream()
                .filter(num -> num%2==1)
                .forEach((num -> System.out.println(num)));

        int newSum2 = numbers.stream().reduce(0,(a,b)->a+b);
        System.out.printf("\nSum using reduce and Lambda is %d ",newSum2);

        int newSum = numbers.stream().reduce(0, Integer::sum);
        System.out.printf("\nSum using reduce and Lambda is %d ",newSum);

    }
}
