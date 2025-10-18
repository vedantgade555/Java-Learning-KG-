import java.util.Scanner;

//Create a program using for loop multiplication table for a number
public class C61 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the no");
        int num=input.nextInt();

        for (int i=1;i<=10;i++){
            System.out.println(num + " X "+ i + " = "+ (num*i));
        }

    }
}
