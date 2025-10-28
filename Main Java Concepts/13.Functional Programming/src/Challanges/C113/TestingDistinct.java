package Challanges.C113;

import java.util.List;
import java.util.stream.Collectors;

public class TestingDistinct {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,4,5,6,2,1,3,2,2);
        List<Integer> distinctNo = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctNo);
    }
}
