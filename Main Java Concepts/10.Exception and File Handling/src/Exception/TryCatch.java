package Exception;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
       a();
    }
    private static void a()
    {
        b();
    }
    private static void b()
    {
        c();
    }
    private static void c()
    {
        d();
    }
    private static void d()
    {
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
