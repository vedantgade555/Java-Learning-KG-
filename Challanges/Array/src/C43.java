//. Create a program to check if the given array is sorted.
public class C43 {
    public static void main(String[] args) {
        int[] numArr=ArrayUtility.inputArray();
        boolean isInc= isIncreasing(numArr);
        boolean isDec= isDecreasing(numArr);

        if(isDec || isInc){
            System.out.println("Your Array is Sorted");
        }else {
            System.out.println("Array is Not sorted");
        }

    }


    public static boolean isIncreasing(int[] numArr){
        int i=0;
        while (i< numArr.length-1){
            if(numArr[i] <= numArr[i+1]){
                return true;
            }
            i++;
        }
        return false;
    }

    public static boolean isDecreasing(int[] numArr){
        int i=0;
        while (i < numArr.length-1){
            if(numArr[i] >= numArr[i+1]){
                return true;
            }
            i++;
        }
        return false;
    }
}
