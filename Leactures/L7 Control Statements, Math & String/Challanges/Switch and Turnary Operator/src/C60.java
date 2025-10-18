import java.util.Scanner;

//Create a program using do-while to implement a number guessing game.
public class C60 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num=5,guess;

        do {
            System.out.println("Please guess the no between 1 to 10");
            guess=input.nextInt();
        }while (num!=guess);
        System.out.println("You have sucessfully guess the number");

    }
}
