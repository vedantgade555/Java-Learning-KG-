import java.util.Scanner;

//.Create a program to input name of the person and
//respond with ”Welcome NAME to KG Coding
public class Main{
    public static void main(String[] args) {
        System.out.print("Please Enter Your Name");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name= input.nextLine();
        System.out.println("Welcome "+ name+ " to Kshtriya Industries" );


    }
}