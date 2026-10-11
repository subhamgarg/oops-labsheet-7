class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException("Built-in Error: Withdrawal amount cannot be negative!");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Custom Error: Insufficient funds! Available balance: " + balance);
        }
        balance -= amount;
        System.out.println("Successfully withdrew: " + amount + " | Remaining Balance: " + balance);
    }
}

public class Q10_BankingSystem {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(500.0);
        
        System.out.println("--- Test 1: Negative Amount ---");
        try {
            acc.withdraw(-50);
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("\n--- Test 2: Overdraft Amount ---");
        try {
            acc.withdraw(1000);
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
