package FilterAndReduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestReduce {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,2,3,4,5,6);

        number.stream()
                .reduce(0, BinaryOperator<Integer>(){
                    public Integer apply(Integer integer,Integer integer2){
                        return integer+integer2;
            }
        })
    }
}
