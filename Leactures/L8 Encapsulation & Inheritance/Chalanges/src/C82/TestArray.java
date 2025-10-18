package C82;

public class TestArray {
    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[]{1,3,5,7});
        ArrayOperations.Statistic statistic = opr.new Statistic();
        System.out.println(statistic.mean());
    }
}
