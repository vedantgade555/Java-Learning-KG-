import java.util.Scanner;

//Create a program to calculate the absolute value of a given integer.
// The absolute value of 45=45 and -97=97
public class C55 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter first number");
        int a=input.nextInt();

        int result= a>0? a:-a;
        System.out.println("Absolute value is "+result);
    }
}
