/*
Problem 3: Bank Account Management
Create a BankAccount class with:
accountNumber (public).
accountHolder (protected).
balance (private).
Write methods to:
Access and modify balance using public methods.
Create a subclass SavingsAccount to demonstrate access to accountNumber and accountHolder.

 */
package Constructors.Level2;

public class BankAccount {

    // Public variable
    public String accountNumber;

    // Protected variable
    protected String accountHolder;

    // Private variable
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter to access balance
    public double getBalance() {
        return balance;
    }

    // Setter to modify balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}