import java.util.Scanner;

//Create a program to return a new array deleting a specific element.
public class C44 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] numArr= ArrayUtility.inputArray();
        System.out.println("Enter the no to be deleted  ");
        int numToDel= input.nextInt();
        int[] newArr= delete(numArr,numToDel);
        System.out.println("New array is");
        ArrayUtility.displayArray(newArr);
    }

    public static int[] delete(int[] numArr, int numToDel){
        int occ=C41.numOfOccurence(numArr,numToDel);
            if(occ==0){
                return numArr;
            }
        int newSize= numArr.length-occ;
        int[] newArr= new int[newSize];

        int i=0, j=0;
        while (i<numArr.length){
            if(numArr[i] != numToDel){
              newArr[j]=numArr[i];
              j++;
            }
            i++;
        }
        return newArr;
    }
}
