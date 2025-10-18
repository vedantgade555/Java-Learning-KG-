import java.util.Scanner;

/* Create a program using do-while to find password checker until a valid
password is entered */
public class C59 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Set Your Passward");
        boolean isValid;
        String passward;
        do {
            System.out.println("Please Enter your passward");
            passward= input.next();
        }while (!isValidPassward(passward));

        System.out.println("Thanks for entering valid passward");
    }

    public static boolean isValidPassward(String passward){
        return passward.length()>6;
    }
}
