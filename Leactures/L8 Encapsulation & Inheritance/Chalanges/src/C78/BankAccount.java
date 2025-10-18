package C78;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public void depsositeMoney(double money){
        if(money<= 0){
            System.out.println("Invalid Deposite");
        }
       else{
            balance += money;
        }
    }

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public double withdrawMoney(double money){
        if(balance>= money){
            balance-=money;
        }
        else if(money<=0){
            System.out.println("Invalid Withdraw");
        }
        else {
            money=balance;
            balance=0;
        }
        return money;
    }
}
