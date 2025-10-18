import java.util.Scanner;

/*  Create a program to Based on a student's score, categorize as
"High", "Moderate", or "Low" using the ternary operator
(e.g., High for scores > 80, Moderate for 50-80, Low for < 50). */
public class C56 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks=input.nextInt();
        String category= marks>80 ? "High": (marks>50?"Moderate":"Low");
        System.out.println("Your category is "+ category);

    }
}
