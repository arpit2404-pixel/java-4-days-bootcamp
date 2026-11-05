package bootcamp;

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: Rs. " + amount);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance for " + accountHolder + ".");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful: Rs. " + amount);
        }
    }

    public void displayDetails() {
        System.out.println("Account holder: " + accountHolder);
        System.out.println("Account number: " + accountNumber);
        System.out.printf("Balance: Rs. %.2f%n", balance);
        System.out.println("------------------------------");
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Arjun", "1001", 5000.00);
        BankAccount account2 = new BankAccount("Meera", "1002", 8000.00);

        account1.deposit(1500.00);
        account2.deposit(2000.00);

        account1.withdraw(1000.00);

        System.out.println("\\nUpdated account details:");
        account1.displayDetails();
        account2.displayDetails();
    }
}
