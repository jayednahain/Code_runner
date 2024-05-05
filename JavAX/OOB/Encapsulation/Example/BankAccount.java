package JavAX.OOB.Encapsulation.Example;


public class BankAccount {
    private int accountNumber;
    private double balance;
    private String ownerName;

    BankAccount(int accountNumber, double initialBalance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.ownerName = ownerName;

    }
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("current balance after deposit: " + balance);
    }

    public void withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            System.out.println("current balance after withdraw: " + balance);
        } else {
            System.out.println("not enough balance");
        }
    }

    void getCurrentAccountInfo() {
        System.out.println("account number      : " + accountNumber);
        System.out.println("account balance     : " + balance);
        System.out.println("account owner name  : "+ownerName);

    }
    
}
