/*
Rewrite program 14 using for loop
Hint =>
Take the integer input, check for natural number and determine the factorial using for loop and finally print the result.
 */
package javaControlFlow.Level1;
import java.util.Scanner;
public class FactorialOfNumberForLoop {
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
            for(int i=1;i<=n;i++){
                factorial=factorial*i;
            }
            System.out.println("The factorial of "+n+" is: "+factorial);

        }
    }
}
