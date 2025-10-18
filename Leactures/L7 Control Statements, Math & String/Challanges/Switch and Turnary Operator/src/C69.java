import java.util.Scanner;

class isPallingdromeRecursion {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the string to be checked");
        String str= input.next();

        System.out.println("Your String is "+
                ((isPallingdrome(str) ?
                        "Pallingdrome": "Not Pallingdrome")));

    }

    public static boolean isPallingdrome(String str){
        if(str.length()<=1){
            return true;
        }
        int lastPos= str.length()-1;
        if(str.charAt(0) != str.charAt(lastPos)){
            return false;
        }
        String newStr= str.substring(1,lastPos);
        return isPallingdrome(newStr);
    }
}
