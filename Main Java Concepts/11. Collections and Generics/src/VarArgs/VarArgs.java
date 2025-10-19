package VarArgs;

public class VarArgs {
    public static void main(String[] args) {
//        System.out.println(4,5);
        System.out.println(sum(4,5));
        System.out.println(sum(4,5,6));
        System.out.println(sum(4,5,7));
        System.out.println(sum1(4,5,7));

    }

//    You can pass infinite no of arguments
    public static int sum(int ...a)
    {
        int sum=0;
        for (int i : a) {
            sum+=i;
        }
        return sum;
    }
//    We need to pass minimum 2 arguments
    public static int sum1(int first,int second,int ...a)
    {
        int sum=0;
        for (int i : a) {
            sum+=i;
        }
        return sum;
    }
}
