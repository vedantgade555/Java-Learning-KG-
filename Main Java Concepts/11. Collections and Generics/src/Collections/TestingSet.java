package Collections;
import java.util.*;
public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Vedant"));
        System.out.println(names.add("Gade"));
        System.out.println(names.add("Kshtriya"));
        System.out.println(names.size());

        names.contains("Vedant");
        Utility.print(names);


    }
}
