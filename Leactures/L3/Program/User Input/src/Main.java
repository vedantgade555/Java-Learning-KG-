import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please Enter your name: ");
        String name= input.nextLine();
        System.out.println("Good Morning "+ name);
        System.out.print(name+", Also tell me Your Age");
        int age= input.nextInt();
        System.out.println("Your age is: "+ age);
    }
}