package Polymorphism.MethodAndConstructorOverloading;

public class Overloading {
    public int add(int a, int b){
        return a+b;
    }

    public int sumFourNumbers(int a, int b, int c, int d){
        return a+b+c+d;
    }

    public String add(String a, String b){
        return a+b;
    }

    public static void main(String[] args) {
        Overloading overload = new Overloading();
        System.out.println(overload.add(5,4));
        overload.add("a","b");

    }
}
