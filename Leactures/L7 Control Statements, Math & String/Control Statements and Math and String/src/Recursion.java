import java.util.Scanner;

// Find a factorial
public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no");
        int num= input.nextInt();
//        long fact= factorialIterative(num);
        long fact=factorial(num);
        System.out.println("Factorial is "+ fact);
    }
    public static long factorialIterative(int num){
        long result=1;
        for(int i=1;i<=num;i++){
            result *= i;
        }
        return result;
    }

    public static long factorial(int num){
        System.out.println("Func call for"+ num);
        if(num==1){
            return 1;
        }
        return num* factorial(num-1);
    }
}
