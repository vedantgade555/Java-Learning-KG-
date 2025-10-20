package Challanges;

class VarArgs {
    public static String concatenation(String ...strs)
    {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(concatenation("Vedant"));
        System.out.println(concatenation("Vedant","Gade"));
        System.out.println(concatenation("Vedant","Kshtriya","Industries"));

    }
}
