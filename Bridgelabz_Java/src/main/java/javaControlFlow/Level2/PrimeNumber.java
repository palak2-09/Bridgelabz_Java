/*
Write a Program to check if the given number is a prime number or not
Hint =>
a. A number that can be divided exactly only by itself and 1 are Prime Numbers,
b. Prime Numbers checks are done for numbers greater than 1
c. Loop through all the numbers from 2 to the user input number and check if the reminder
is zero. If the reminder is zero break out from the loop as the number is divisible by some
other number and is not a prime number.
d. Use isPrime boolean variable to store the result
 */
package javaControlFlow.Level2;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        /*
        here we have to check whether the number entered by the user is a prime number or not
         */
        Scanner sc=new Scanner(System.in);
        //taking a number as input from the user
        System.out.println("Enter the number:");
        int number=sc.nextInt();

        boolean isPrime=true;
        if(number<=1){
            isPrime=false;
        }
        else{
            for(int i=2;i*i<number;i++){
                if(number%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        //displaying the result
        if(isPrime){
            System.out.println(number+" is a Prime number.");
        }
        else{
            System.out.println(number+" is not a Prime number.");
        }
        sc.close();
    }
}
