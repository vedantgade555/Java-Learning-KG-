import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter 2 no");
        int a= readNumber();
        int b= readNumber();

        System.out.println(a+b);


    }

    public static int readNumber(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter no");
        int number= input.nextInt();
        return  number;
    }
}