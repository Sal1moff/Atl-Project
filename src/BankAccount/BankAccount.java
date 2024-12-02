package BankAccount;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double mebleg) {
        if (mebleg > 0) {
            setBalance(balance + mebleg);
            System.out.println(mebleg + " AZN elave edildi" + " Balans:" + balance + "AZN");
        } else {
            System.out.println("0dan böyük mebleg elave edin.");
        }

    }

    public void withdraw(double mebleg) {
        if (mebleg > 0 && mebleg <= balance) {
            setBalance(balance - mebleg);
            System.out.println(mebleg + " AZN cixarildi.Balans: " + balance + " AZN");
        } else if (mebleg > balance) {
            System.out.println("Balansda kifayet qeder vesait yoxdu." + " Balans:" + balance + "AZN");

        } else if (mebleg < 0) {
            System.out.println("mebleg 0dan kicik ola bilmez"+" Balans:"+balance+"AZN");
        } else {
            System.out.println("0dan böyük mebleg daxil edin.");
        }
    }


}
