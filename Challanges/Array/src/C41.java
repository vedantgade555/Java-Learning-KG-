import java.util.Scanner;

//. Create a program to find number of occurrences of an element in an array
public class C41 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Enter the no to find");
        int num= input.nextInt();
        int occurance= numOfOccurence(numArr,num);
        System.out.println("Your element is founs "+ occurance+ " Times in the array");
    }

    public static int numOfOccurence(int[] numArr,int num){
        int occ=0;
        int i=0;
        while (i<numArr.length){
            if(numArr[i]==num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
