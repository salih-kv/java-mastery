// Encapsulation Example

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
