import java.util.Scanner;

//17. Create a program that determines the greatest of the three numbers.
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter 1st no");
        int a= input.nextInt();
        System.out.println("Enter 2nd no");
        int b= input.nextInt();
        System.out.println("Enter 3rd no");
        int c= input.nextInt();

        if(a>b && a>c){
            System.out.println(a+" is Max");
        }
        else if(b>a && b>c){
            System.out.println(b+" is Max");
        }

        else{
            System.out.println(c+" is Max");

        }

        System.out.println(a&b);
    }
}