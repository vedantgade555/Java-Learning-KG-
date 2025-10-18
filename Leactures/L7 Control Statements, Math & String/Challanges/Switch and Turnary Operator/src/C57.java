import java.util.Scanner;

public class C57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month number");
        int month = input.nextInt();

        String output = switch (month) {
            case 1 -> "Jan";
            case 2 -> "Feb";
            case 3 -> "Mar";
            case 4 -> "Apr";
            case 5 -> "May";
            case 6 -> "Jun";
            case 7 -> "Jul";
            case 8 -> "Aug";
            case 9 -> "Sept";
            case 10 -> "Oct";
            case 11 -> "Nov";
            case 12 -> "Dec";
            default -> "Invalid";
        };
        System.out.println(output);

    }
}