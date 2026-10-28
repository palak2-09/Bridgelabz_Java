/*
. Banking System
Description: Create a banking system with different account types:
Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
Use encapsulation to secure account details and restrict unauthorized access.
Demonstrate polymorphism by processing different account types and calculating interest dynamically.

 */
package EncAbsPoly;
import java.util.ArrayList;
import java.util.List;

// Interface
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility(double amount);
}

// Abstract class
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName,
                       double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;

        if (balance >= 0) {
            this.balance = balance;
        }
    }

    // Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setHolderName(String holderName) {
        if (holderName != null && !holderName.isEmpty()) {
            this.holderName = holderName;
        }
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Abstract method
    public abstract double calculateInterest();

    // Display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
    }
}

// Savings Account
class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String accountNumber, String holderName,
                          double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04; // 4% interest
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility(amount)) {
            System.out.println("Savings account loan approved.");
        } else {
            System.out.println("Savings account loan rejected.");
        }
    }

    @Override
    public boolean calculateLoanEligibility(double amount) {
        return amount > 0 && getBalance() >= 10000
                && amount <= getBalance() * 2;
    }
}

// Current Account
class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(String accountNumber, String holderName,
                          double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02; // 2% interest
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility(amount)) {
            System.out.println("Current account loan approved.");
        } else {
            System.out.println("Current account loan rejected.");
        }
    }

    @Override
    public boolean calculateLoanEligibility(double amount) {
        return amount > 0 && getBalance() >= 20000
                && amount <= getBalance();
    }
}

// Main class
public class BankingSystem {

    public static void main(String[] args) {

        // Creating accounts
        SavingsAccount savings =
                new SavingsAccount("S101", "Palak", 50000);

        CurrentAccount current =
                new CurrentAccount("C102", "Rahul", 30000);

        // Deposit and withdraw operations
        savings.deposit(5000);
        savings.withdraw(2000);

        current.deposit(3000);
        current.withdraw(1000);

        System.out.println("\n--- Account Details ---");

        // Polymorphism
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(savings);
        accounts.add(current);

        for (BankAccount account : accounts) {
            account.displayDetails();
            System.out.println("-----------------------");
        }

        // Loan operations
        System.out.println("\n--- Loan Applications ---");

        savings.applyForLoan(50000);
        current.applyForLoan(25000);
    }
}