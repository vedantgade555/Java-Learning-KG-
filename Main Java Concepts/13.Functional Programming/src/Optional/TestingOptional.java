package Optional;

import java.util.List;
import java.util.Optional;

public class TestingOptional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6);

        Optional<Integer> newsum2 = numbers.stream().reduce((a,b)->a+b);

        if(newsum2.isPresent()){
            System.out.println(newsum2.get());
        }else{
            System.out.println("List is empty");
        }
    }
}
