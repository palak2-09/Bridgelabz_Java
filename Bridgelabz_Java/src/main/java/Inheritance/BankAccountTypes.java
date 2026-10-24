/*
Hierarchical Inheritance
Sample Problem 1: Bank Account Types
Description: Model a banking system with different account types using hierarchical inheritance. BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
Tasks:
Define a base class BankAccount with attributes like accountNumber and balance.
Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
Implement a method displayAccountType() in each subclass to specify the account type.
Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while inheriting from a shared superclass

 */
package Inheritance;

// Superclass
class BankAccount {
    String accountNumber;
    double balance;

    // Parameterized constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Display common account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }

    public void displayAccountType() {
        System.out.println("Account Type: General Bank Account");
    }
}

// Subclass 1
class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass 2
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayDetails();
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}

// Subclass 3
class FixedDepositAccount extends BankAccount {
    int depositPeriod;

    public FixedDepositAccount(String accountNumber, double balance, int depositPeriod) {
        super(accountNumber, balance);
        this.depositPeriod = depositPeriod;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayDetails();
        System.out.println("Deposit Period: " + depositPeriod + " years");
    }
}

// Main class
public class BankAccountTypes {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount("SA101", 50000, 4.5);
        CheckingAccount checking = new CheckingAccount("CA102", 30000, 10000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD103", 100000, 3);

        savings.displayAccountType();

        System.out.println();

        checking.displayAccountType();

        System.out.println();

        fixedDeposit.displayAccountType();
    }
}