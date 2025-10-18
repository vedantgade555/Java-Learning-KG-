/* Create a program to create a simple calculator that uses aswitch statement
to perform basic arithmetic operationslike
addition, subtraction, multiplication, and division. */

import java.util.Scanner;

public class C58 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter first number");
        int num1= input.nextInt();
        System.out.println("Enter second Number");
       int num2= input.nextInt();
        System.out.println("Enter the operation");
        String operation= input.next();

        int result = switch (operation){
            case "+" -> num1+num2;
            case "-"-> num1-num2;
            case "*"-> num1*num2;
            case "/"-> num1/num2;
            default -> -1;
        };

        System.out.println("Your Answer is "+result);
    }
}
