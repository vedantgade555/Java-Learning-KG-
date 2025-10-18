//Create a program to find the sum and average of all elements in an array
import java.util.Scanner;

public class C40 {
    public static void main(String[] args) {
      int[] numArray= ArrayUtility.inputArray();
      long sum= sum(numArray);
      int avg= average(numArray);

        System.out.println("Sum of the no is "+ sum);
        System.out.println("Average of the no is "+ avg);

    }

    public static long sum(int[] numArray){
        long sum=0;
        int i=0;
        while (i < numArray.length){
            sum+= numArray[i];
            i++;
        }
        return sum;
    }

    public static int average(int[] numArray){
        long sum= sum(numArray);
        return (int)(sum/numArray.length);
    }
}