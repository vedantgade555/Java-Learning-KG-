import java.util.Scanner;

//.Create a program to add two numbers
public class Sum{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter first no");
        int no1= input.nextInt();
        System.out.print("Enter second no");
        int no2= input.nextInt();
        int sum= no1 + no2;
        System.out.println("The sum of no is "+sum);

    }
}
