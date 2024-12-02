package BankAPPCheck;

public abstract class BankOperation {


    public abstract void performDeposit(Customer customer, double amount);

    public abstract void performWithdrawal(Customer customer, double amount);
}
