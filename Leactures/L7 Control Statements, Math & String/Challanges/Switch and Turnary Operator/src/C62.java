//Create a program using for to display if a number is prime or not.
import java.util.Scanner;

class PrimeFor {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to prime no checker");
        System.out.println("Enter the number");
        int num= input.nextInt();
//        boolean isPrime= isPrime(num);
        System.out.println("Your no is "+ (isPrime(num) ? "Prime" : "Not Prime"));
    }

    public static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i ==0){
                return false;
            }
        }
        return true;
    }
}
