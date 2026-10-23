/*
Sample Program 1: Bank Account System
Create a BankAccount class with the following features:
Static:
A static variable bankName shared across all accounts.
A static method getTotalAccounts() to display the total number of accounts.
This:
Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
Final:
Use a final variable accountNumber to ensure it cannot be changed once assigned.
Instanceof:
Check if an account object is an instance of the BankAccount class before displaying its details.
 */
package ThisStaticFinal;

public class BankAccount {

    // Static variables
    static String bankName = "State Bank of India";
    static int totalAccounts = 0;

    // Instance variables
    String accountHolderName;
    final String accountNumber;

    // Constructor
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;

        totalAccounts++;
    }

    // Static method
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Display account details
    public void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Rahul", "1001");
        BankAccount account2 = new BankAccount("Priya", "1002");

        // instanceof check
        if (account1 instanceof BankAccount) {
            System.out.println("Account 1 Details:");
            account1.displayDetails();
        }

        System.out.println();

        if (account2 instanceof BankAccount) {
            System.out.println("Account 2 Details:");
            account2.displayDetails();
        }

        System.out.println();

        BankAccount.getTotalAccounts();
    }
}