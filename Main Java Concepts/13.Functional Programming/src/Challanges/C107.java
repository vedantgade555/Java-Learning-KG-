package Challanges;

import java.util.List;

class StreamTest {
    public static void main(String[] args) {
        List<String> names = List.of("Vedant","Rohan","Pramod");
        names.stream()
                .forEach(name-> System.out.println(name));
    }
}
