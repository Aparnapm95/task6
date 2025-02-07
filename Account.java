package task6;


public class Account {
    // Data members for account details
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor with parameters to initialize account details
    public Account(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Default constructor
    public Account() {
        this.accountNumber = "0000000000";
        this.accountHolderName = "Unknown";
        this.balance = 0.0;
    }

    // Method to credit money to the account
    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Credited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Amount to credit should be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ". New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Amount to withdraw should be positive.");
        }
    }

    // Getter for balance (optional)
    public double getBalance() {
        return balance;
    }

    // Method to display account details (optional)
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    // Main method to test the Account class
    public static void main(String[] args) {
        // Creating an account using the constructor with parameters
        Account account1 = new Account("1234567890", "John Doe", 1000.0);
        account1.displayAccountDetails();

        // Credit money to account
        account1.credit(500.0);

        // Withdraw money from account
        account1.withdraw(300.0);

        // Trying to withdraw more than the balance
        account1.withdraw(1500.0);

        // Creating an account using the default constructor
        Account account2 = new Account();
        account2.displayAccountDetails();
    }
}
