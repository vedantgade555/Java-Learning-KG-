import java.util.Scanner;

//Create a program to find if the given number is even or odd.
public class C54 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter first number");
        int a=input.nextInt();

        String result= a%2==0 ? "Even":"Odd";
        System.out.println("Your Number is "+result);


    }
}
