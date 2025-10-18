//Create a program to do sum and average of all elements in a 2-D array
public class C49 {
    public static void main(String[] args) {
        int[][] arr= ArrayUtility.input2DArray();
        long sum= sum(arr);
        double avg= average(arr);

        System.out.println("Sum is"+ sum);
        System.out.println("Average is"+ avg);
    }

    public static int long sum(int[][] arr){
        if(arr.length==0){
            return 0;
        }
        int rows= arr.length;
        int col= arr[0].length;
        double size= rows*col;
        return sum(arr)/size;
    }

    public static double average(int[][] arr){
        long sum=0;
        int i=0;
        while (i<arr.length){
            int j=0;
            while (j<arr[i].length){
                sum+= arr[i][j];
                j++;

            }
            i++;
        }


    }
}
