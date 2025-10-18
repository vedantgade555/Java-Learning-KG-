import java.util.Scanner;

//9. Create a program to calculate product of two floating points numbers.
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter 1st no");
        double a= input.nextDouble();
        System.out.println("Enter 1st no");
        double b=input.nextDouble();

        double mul= a*b;

        System.out.println(mul);
    }
}