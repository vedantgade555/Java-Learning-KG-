//Create a program to find the maximum and minimum element in an array.
public class C42 {
    public static void main(String[] args) {
        int[] numArr=ArrayUtility.inputArray();
        int max= max(numArr);
        int min= min(numArr);

        System.out.println("Min Value is "+ min);
        System.out.println("Max Value is "+ max)  ;
    }

    public static int max(int[] numArr){
        if(numArr.length==0){
            return Integer.MAX_VALUE;// Used to show min value in java
        }

        int max=numArr[0];
        int i=1;
        while (i<numArr.length){
            if(max< numArr[i]){
                max=numArr[i];
            }
            i++;
        }
        return max;

    }

    public static int min(int[] numArr){
       int min= Integer.MAX_VALUE;
        int i=0;
        while (i<numArr.length){
            if(min>numArr[i]){
                min=numArr[i];
            }
            i++;
        }
        return min;
    }

}
