package Polymorphism.PassBy;

public class testPassByValue {
    public static void main(String[] args) {
        int x=5;
        int y=10;
        int sum = add(x,y);
        System.out.println(sum);
    }

    public static int add(int a,int b){
        a+=b;
        return a;
    }
}
