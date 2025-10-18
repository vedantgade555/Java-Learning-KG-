//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        greeting();
        PrintFirstPatern();
    }

    public static void greeting(){
        System.out.println("Welcome to Kshtriya Industries");
    }

//    *
//    * *
//    * * *
//    * * * *
//    * * * * *

   public static void PrintFirstPatern(){
       int rows=0;
       while(rows<5)
       {
           System.out.print("*");
           int i=0;
           while (i<rows){
               System.out.println(" *");
               i++;
           }
           rows++;

       }
   }

}