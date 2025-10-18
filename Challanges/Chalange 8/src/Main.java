import java.util.Scanner;

//8.Create a program that takes two numbers and shows result of all
//arithmetic operators (+,-,*,/,%).
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Print Value of 1st no");
        int a= input.nextInt();
        System.out.println("Print Value of 2nd no");
        int b= input.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

    }
}