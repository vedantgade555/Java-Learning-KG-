//. Create a program to reverse an array
public class C45 {
    public static void main(String[] args) {
        int[] numArr=ArrayUtility.inputArray();
        reverse(numArr);
        System.out.println("Reverse Array is");
        ArrayUtility.displayArray(numArr);
    }

    public static void reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while (i<arr.length/2){
            int swap= arr[i];
            arr[i]= arr[j];
            arr[j]=swap;
            i++;
            j--;
        }
    }

}
