//Create a program to find the minimum of two numbers
import java.util.Scanner;

public class C53 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter first number");
        int a=input.nextInt();
        System.out.println("Enter second number");
        int b= input.nextInt();

        C53 ternary= new C53();
        int min= ternary.min(a,b);
        System.out.println("Minimum no is "+ min);
    }

    public int min(int a,int b){
       return a<b?a:b;
    }
}