package Challanges;

import java.util.function.BinaryOperator;

class LambdaMultiplication {
    public static void main(String[] args) {
        BinaryOperator<Integer> multi = (a,b) -> a*b;
        int result = multi.apply(4,5);
        System.out.println(result);
    }
}
