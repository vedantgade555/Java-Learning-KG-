package Challanges.C97;

public class EnumTest {
    public static void main(String[] args) {
        for(Day day : Day.values())
        {
            System.out.printf("%s : %s ",day,day.getType());
        }
    }
}
