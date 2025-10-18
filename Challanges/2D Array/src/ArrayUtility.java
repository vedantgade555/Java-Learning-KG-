import java.util.Scanner;

public class ArrayUtility {
    public static void main(String[] args) {
        input2DArray();
    }

    public static int[][] input2DArray(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the size of rows: ");
        int rows= input.nextInt();
        System.out.println("Enter the size of columns: ");
        int columns= input.nextInt();

        int[][] numArray= new int[rows][columns];

        int i=0;
        while (i<rows){
            int j=0;
            while (j<columns){
                System.out.println("Please Enter the elements of rows: "+(i+1)+", column: "+ (j+1)+" :");
                numArray[i][j]=input.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }
}

