
```java
public class BankAccount {
    private int accountNumber;
    private double balance;
    private String ownerName;
    // - Private Instance Variables: The accountNumber, balance, and ownerName variables are declared as private. This means they can only be accessed within the BankAccount class itself. Other classes cannot directly access or modify these variables, ensuring data integrity and security.

    BankAccount(int accountNumber, double initialBalance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.ownerName = ownerName;
        // - Constructor: The class has a constructor that initializes the BankAccount object with the provided account number, initial balance, and owner name. This allows the creation of BankAccount objects with specified initial values.

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

    public void getCurrentAccountInfo() {
        System.out.println("account number      : " + accountNumber);
        System.out.println("account balance     : " + balance);
        System.out.println("account owner name  : "+ownerName);

    }

    //  Public Methods: The class provides public methods (deposit(), withdraw(), and getBalance()) to interact with the BankAccount object. These methods allow users of the class to perform operations on the account, such as depositing and withdrawing money, and retrieving the current balance.
    
}

```
# why use encapsulation

Data Hiding: Encapsulation allows you to hide the internal state of an object (its data) from the outside world. By declaring data members as private and providing public methods to access and modify them, you control how the data is accessed and manipulated. This helps maintain data integrity and prevents unintended modifications from outside sources, improving the reliability and stability of your code.

Abstraction: Encapsulation allows you to define the behavior of an object without exposing its internal implementation details. Users of the object only need to know how to interact with its public interface, without needing to understand how it works internally. This simplifies the usage of complex systems and promotes code reuse, as users can focus on what the object does rather than how it does it.
Modularity: Encapsulation promotes modularity by encapsulating related data and behavior within a single unit (a class). This makes it easier to organize and maintain large codebases, as each class can be treated as a self-contained unit with its own set of responsibilities. Changes to one class can be made independently of other classes, reducing the risk of unintended side effects and facilitating code maintenance and evolution.

Security: By controlling access to data and behavior through encapsulation, you can enforce security constraints on your system. For example, sensitive data can be kept private and only accessed or modified through controlled methods, reducing the risk of unauthorized access or tampering.
Flexibility and Extensibility: Encapsulation allows you to change the internal implementation of a class without affecting its external interface. This provides flexibility to improve or optimize the class's implementation over time without breaking existing code that depends on it. Additionally, encapsulation facilitates the creation of subclasses that can extend or specialize the behavior of a base class without directly modifying its implementation, promoting code reuse and extensibility.