package Challanges.C96;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Printing All the days of the week");

        for(Day day: Day.values()){
            System.out.println(day);
        }
    }
}
