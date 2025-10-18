//Create a program to check is the array is palindrome or not.
public class C46 {
    public static void main(String[] args) {
        int[] numArr= ArrayUtility.inputArray();
        boolean isPal= isPalingdrome(numArr);
        if(isPal){
            System.out.println("Your Array is Palingdrome");
        }
        else {
            System.out.println("Array not pallingdrome");
        }
    }

    public static boolean isPalingdrome(int[] numArr){
        int i=0;
        int j= numArr.length-1;

        while (i<numArr.length/2){
            if(numArr[i]==numArr[j])
            {
                return true;
            }
            i++;
            j--;
        }
        return false;
    }
}
