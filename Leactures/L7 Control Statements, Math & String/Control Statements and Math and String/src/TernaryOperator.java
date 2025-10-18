import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter first number");
        int num1= input.nextInt();
        System.out.println("Enter second number");
        int num2= input.nextInt();
//        int greaterNumber;
//        if(num1>num2){
////            System.out.println(num1+" is the Max");
//            greaterNumber=num1;
//        }else {
////            System.out.println(num2+" is Max");
//            greaterNumber=num2;
//        }

       int greaterNumber= num1>num2 ? num1:num2;
        System.out.println(greaterNumber+" is Max");
    }
}