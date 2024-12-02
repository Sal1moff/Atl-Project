package BankAPPCheck;

public class BankCustomer extends BankOperation {

    public BankCustomer(Customer customer) {
        this.customer = customer;
    }

    private Customer customer;


    @Override
    public void performDeposit(Customer customer, double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Mebleg 0 ola bilmez");

        }
        customer.addBalance(amount);
    }

    @Override
    public void performWithdrawal(Customer customer, double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Mebleg 0dan böyük olmalidir");
        }
        if (amount > customer.checkBalance()) {
            throw new InsufficientFundsException("Balans yetersiz");
        }
        customer.deleteBalance(amount);
    }
}
