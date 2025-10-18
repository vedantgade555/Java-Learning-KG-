package Loops;

import java.util.Scanner;

public class  DoWhileLoop {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
//        System.out.println("Please Enter your age");
//        int age= input.nextInt();
//        while (age<0 || age>100){
//            System.out.println("Please Enter your age");
//            age= input.nextInt();
//        }
        int age;
        do {
            System.out.println("Please Enter your age");
             age= input.nextInt();
        }while (age<0 || age >100);
        System.out.println("Your age is: "+age);
    }
}
