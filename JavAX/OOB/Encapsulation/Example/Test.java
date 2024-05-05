package JavAX.Jav125Emcapsulation.Example;

public class Test {

    public static void main(String[] args) {

        BankAccount obj = new BankAccount(123456, 50, "zed");        
        obj.getCurrentAccountInfo();
        obj.deposit(20002);
        // System.err.println("");
        obj.getCurrentAccountInfo();
        
    }
}
