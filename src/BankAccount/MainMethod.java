package BankAccount;

public class MainMethod {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("A234B54C", 500.0);


        System.out.println("Hesab nomresi: " + account.getAccountNumber());
        System.out.println("Balans: " + account.getBalance() + " AZN");


        account.deposit(100);
        System.out.println("*************************************");
        account.withdraw(0);
        System.out.println("****************************************");
        account.withdraw(700);
        System.out.println("*****************************************");
        account.withdraw(-150);
        System.out.println("********************************************");

    }
}

