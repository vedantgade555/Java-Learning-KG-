import java.util.Scanner;

//10.Create a program to calculate Perimeter of a rectangle.
//Perimeter of rectangle ABCD = A+B+C+D
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter first Edge");
        int a= input.nextInt();
        System.out.println("Enter second Edge");
        int b= input.nextInt();
        System.out.println("Enter Third Edge");
        int c= input.nextInt();
        System.out.println("Enter fourth Edge");
        int d=input.nextInt();

        int perimeter= a+b+c+d;
        System.out.println("Perimeter of the rectangle is "+ perimeter);
    }
}