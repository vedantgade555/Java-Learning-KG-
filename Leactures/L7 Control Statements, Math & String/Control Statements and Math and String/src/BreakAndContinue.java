public class BreakAndContinue {
    public static void main(String[] args) {
//       breakStatement();
       continueStatement();
    }
    public static void breakStatement(){
        System.out.println("Before Loop");
        for (int i=1;i<1000;i++){
            if(i==101){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Out of Loop");
    }

    public static void continueStatement(){
        for (int i=1;i<10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
