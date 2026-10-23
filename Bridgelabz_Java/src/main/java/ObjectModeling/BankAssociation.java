/*
Problem 2: Bank and Account Holders (Association)
Description: Model a relationship where a Bank has Customer objects associated with it. A Customer can have multiple bank accounts, and each account is linked to a Bank.
Tasks:
Define a Bank class and a Customer class.
Use an association relationship to show that each customer has an account in a bank.
Implement methods that enable communication, such as openAccount() in the Bank class and viewBalance() in the Customer class.
Goal: Illustrate association by setting up a relationship between customers and the bank.

 */

package ObjectModeling;
/*
    This program demonstrates association between Bank, Customer, and Account classes.
    A bank can have multiple customers, and a customer can have multiple accounts.
    Each account is linked to a bank.
*/
import java.util.ArrayList;
import java.util.List;

class Account {
    int accountNumber;
    double balance;
    Bank bank;

    Account(int accountNumber, double balance, Bank bank) {
        // Initialize account details and associate it with a bank
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }
}

class Customer {
    String name;
    List<Account> accounts;

    Customer(String name) {
        // Initialize customer details and create an empty account list
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Add an account to the customer
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // View all account balances of the customer
    public void viewBalance() {
        System.out.println("Customer Name: " + name);
        System.out.println("Account Details:");

        for (Account account : accounts) {
            System.out.println("Bank Name: " + account.bank.bankName);
            System.out.println("Account Number: " + account.accountNumber);
            System.out.println("Balance: Rs. " + account.balance);
            System.out.println();
        }
    }
}

class Bank {
    String bankName;
    List<Customer> customers;

    Bank(String bankName) {
        // Initialize bank details and create an empty customer list
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Open an account for a customer
    public void openAccount(Customer customer, int accountNumber, double initialBalance) {
        // Create an account associated with this bank
        Account account = new Account(accountNumber, initialBalance, this);

        // Add account to the customer
        customer.addAccount(account);

        // Add customer to the bank if not already associated
        if (!customers.contains(customer)) {
            customers.add(customer);
        }

        System.out.println("Account opened successfully for " + customer.name);
    }

    // Display all customers associated with the bank
    public void displayCustomers() {
        System.out.println("\nBank Name: " + bankName);
        System.out.println("Customers:");

        for (Customer customer : customers) {
            System.out.println("Customer Name: " + customer.name);
        }
    }
}

public class BankAssociation {
    public static void main(String[] args) {

        // Create two banks
        Bank bank1 = new Bank("HDFC Bank");
        Bank bank2 = new Bank("SBI Bank");

        // Create customers
        Customer customer1 = new Customer("Akhil");
        Customer customer2 = new Customer("Charan");

        // Open multiple accounts for customers
        bank1.openAccount(customer1, 1001, 50000);
        bank1.openAccount(customer1, 1002, 25000);

        bank1.openAccount(customer2, 1003, 30000);

        // Associate the same customer with another bank
        bank2.openAccount(customer1, 2001, 40000);

        System.out.println();

        // View account balances
        customer1.viewBalance();

        customer2.viewBalance();

        // Display customers of each bank
        bank1.displayCustomers();
        bank2.displayCustomers();
    }
}