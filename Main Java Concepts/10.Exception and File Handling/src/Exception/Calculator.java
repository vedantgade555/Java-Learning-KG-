package Exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       try{
           Scanner input = new Scanner(System.in);
           System.out.println("Welcome to Division Calculator");
           System.out.println("Enter Two Number");
           int first = input.nextInt();
           int second = input.nextInt();

           int result = first/second;
           System.out.printf("Result is %d",result);
       }catch (ArithmeticException e){
           System.out.println("Divide by zero please enter valid values");
       }
    }
}
