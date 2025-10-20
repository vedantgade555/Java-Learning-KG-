package Challanges;
import java.util.*;
public class C90 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear","Lion","Ant");
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);
    }

    public static void sortInDescending(List<String> stringList)
    {
        Collections.sort(stringList);
    }
}
