import java.util.Scanner;

class occrForEach {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] nums= ArrayUtility.inputArray();
        System.out.println("Enter the no to be search");
        int element= input.nextInt();
        int occ= countOccurance(nums,element);
        System.out.println("Your element was found "+ occ+ " times");
    }

    public static int countOccurance(int[] nums,int element){
        int occ=0;
        for (int num: nums){
            if(num== element){
                occ++;
            }
        }
        return occ;
    }
}
