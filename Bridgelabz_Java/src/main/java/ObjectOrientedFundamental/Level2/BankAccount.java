/*
Program to Simulate an ATM
Problem Statement: Create a BankAccount class with attributes accountHolder, accountNumber, and balance. Add methods for:
Depositing money.
Withdrawing money (only if sufficient balance exists).
Displaying the current balance.
Explanation: The BankAccount class stores bank account details as attributes. The methods allow interaction with these attributes to modify and view the account's state
 */
package ObjectOrientedFundamental.Level2;
import java.util.Scanner;
public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    //method to deposit money
    double depositMoney(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Amount deposited:"+amount);
        }
        else{
            System.out.println("Invalid amount deposited");
        }

        return balance;
    }

    double withdrawMoney(double amountToWithdraw){
        if (amountToWithdraw <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (balance >= amountToWithdraw) {
            balance -= amountToWithdraw;
            System.out.println("Amount withdrawn: " + amountToWithdraw);
        } else {
            System.out.println("Insufficient balance!");
        }

        return balance;
    }
    //display the current balance
    void displayBalance(){
        System.out.println("The balance is: "+balance);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //create an object for class
        BankAccount obj=new BankAccount();

        System.out.println("Enter the account holder name:");
        obj.accountHolder=sc.nextLine();

        System.out.println("Enter the account number:");
        obj.accountNumber=sc.nextInt();

        System.out.println("Enter the account balance:");
        obj.balance=sc.nextDouble();

        //deposit money
        System.out.println("Enter the amount to deposit:");
        double deposit=sc.nextDouble();
        obj.depositMoney(deposit);

        //withdraw money
        System.out.println("Enter the amount to withdraw:");
        double withdrawal=sc.nextDouble();
        obj.withdrawMoney(withdrawal);

        //display the final balance
        obj.displayBalance();

        sc.close();

    }

}
