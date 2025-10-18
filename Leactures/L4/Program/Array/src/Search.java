import java.util.Scanner;

public class Search {
    public static void main(String[] args){
        int[] arr={3,6,8,55,87,65,4,3,8,5,32,98,38};
        System.out.println("Enter no to search");
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();
        boolean isFound= isFound(arr,num);
        if(isFound){
            System.out.println("No is Found");
        }
        else{
            System.out.println("No not Found");
        }

    }

    public static boolean isFound(int[] arr,int num){
        int index=0;
        while (index<arr.length){
            if(arr[index]==num){
                return true;
            }
            index++;
        }
        return false;
    }
}
