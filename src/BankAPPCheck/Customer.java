package BankAPPCheck;

public class Customer {
    private String name;
    private double balance;
    private final String customerId;

    public Customer(String name, double balance, String customerId) {
        this.name = name;
        this.customerId = customerId;
        this.balance = balance;

    }

    public double checkBalance() {
        return this.balance;
    }

    public void addBalance(double amount) {
        this.balance += amount;
    }

    public void deleteBalance(double amount) {
        this.balance -= amount;
    }

    public String getCustomerId() {
        return customerId;
    }
    public  double update( double amount){
        return balance+=amount;
    }
}
