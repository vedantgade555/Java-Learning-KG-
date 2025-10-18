import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int size= input.nextInt();
        int[] arr= new int[size];
        int i=0;
        while (i<size){
            System.out.println("Plese Enter element no"+(i+1)+":");
            arr[i]= input.nextInt();
            i++;
        }
        return arr;
    }

    public static void displayArray(int[] numArr){
        int i=0;
        while (i<numArr.length){
            System.out.println(numArr[i]+ " ");
            i++;
        }
    }
}
