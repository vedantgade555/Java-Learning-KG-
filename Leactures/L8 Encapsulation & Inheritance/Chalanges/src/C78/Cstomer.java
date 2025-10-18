package C78;

public class Cstomer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("001","Vedant Gade");
        account.depsositeMoney(100);
        System.out.println(account.withdrawMoney(200));
        account.depsositeMoney(-40);
        account.withdrawMoney(0);
    }
}
