//Create a program using continue to print only even numbers using continue for
//odd numbers
class PrintEvenUsingContinue {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            if(i%2==1){
                continue;
            }
            System.out.println(i);
        }
    }
}
