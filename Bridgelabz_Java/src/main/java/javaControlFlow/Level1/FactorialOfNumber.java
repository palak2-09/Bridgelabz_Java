/*
Write a Program to find the factorial of an integer entered by the user.
Hint =>
For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
Using a while loop, compute the factorial.
Print the factorial at the end.
 */
package javaControlFlow.Level1;
import java.util.Scanner;
public class FactorialOfNumber {
    public static void main(String[] args){
        /*
        here we have to check if the given number is positive or not and then
        we need to find the factorial of that number and print the result
         */
        Scanner sc=new Scanner(System.in);
        //taking input from the user
        System.out.println("Enter a positive number:");
        int n=sc.nextInt();
        //checking if the number entered by the user is positive or not
        if(n<0){
            //if not positive, ask the user to enter again
            System.out.println("Enter a positive number.");
        }
        else{
            //finding the factorial of the given number
            int factorial=1;
            int i=1;
            while(i<=n){
                factorial*=i;
                i++;
            }
            System.out.println("The factorial of "+n+" is: "+factorial);

        }
    }
}
