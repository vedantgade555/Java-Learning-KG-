import java.sql.SQLOutput;
import java.util.Scanner;

//.Create a program to calculate Compound interest.
//        Compound Interest = P(1 + R/100)t.
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your principle Amount");
        int principle= input.nextInt();
        System.out.println("Enter Rate of Interest");
        float rate= input.nextFloat();
        System.out.println("Enter Duration or Time Period");
        float years= input.nextFloat();

        double CompInt= principle* Math.pow((1+rate/100),years);

        System.out.println("Your Compound Interest is Rs:"+CompInt);
    }
}