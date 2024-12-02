package BankAPPCheck;

public class BankAppMain {
    public static void main(String[] args) {

        Customer customer = new Customer("Xanbala Salimov", 500, "AZ09347362");
        BankCustomer operation1 = new BankCustomer(customer);
        try{
            operation1.performDeposit(customer,200);
            operation1.performWithdrawal(customer,1000);
            System.out.println("balans:"+customer.checkBalance());
        }
        catch (InsufficientFundsException | InvalidAmountException e){
            System.out.println(e);
            System.out.println(customer.checkBalance());
        }
    }
}
