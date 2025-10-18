import java.util.Scanner;

//Create a program to search an element in a 2-D array.
public class C48 {
    public static void main(String[] args) {

        int[][] numArr= ArrayUtility.input2DArray();
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the no to be search");
        int num= input.nextInt();
        boolean isFound= search(numArr,num);

        if(isFound){
            System.out.println("Number  is found");
        }
        else {
            System.out.println("Number not found");
        }
    }

    public static boolean search(int[][] numArr, int num){

        int i=0;
        while (i<numArr.length){
            int j=0;
            while (j< numArr[i].length){
                if(numArr[i][j]== num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}