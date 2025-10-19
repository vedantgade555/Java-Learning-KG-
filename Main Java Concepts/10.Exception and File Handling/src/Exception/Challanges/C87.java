package Exception.Challanges;

import java.util.Scanner;

public class C87{
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
            if(e.getMessage().equals("/by zero"))
            {
                System.out.println("Divide By Zero Occured");
            }else{
                throw e;
            }
        }
    }
}
