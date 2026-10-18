/*
Create a program to print odd and even numbers between 1 to the number entered by the user.
Hint =>
Get an integer input from the user, assign to a variable number and check for Natural Number
Using a for loop, iterate from 1 to the number
In each iteration of the loop, print the number is odd or even number
 */
package javaControlFlow.Level1;
import java.util.Scanner;
public class OddEvenNumberRange {
    public static void main(String[] args){
        /*
        here, we have to take a natural number as input from the user
        then we need to check from 1 till the number that it is odd or even
         */
        Scanner sc=new Scanner(System.in);
        //taking input from the user
        System.out.println("Enter a natural number:");
        int n=sc.nextInt();

        //checking if the number entered by the user is natural or not
        if(n<=0){
            //since number is not natural, asking user to enter again
            System.out.println("Please enter a natural number:");
        }
        else{
            for(int i=1;i<=n;i++){
                //check if the number between 1 to n is odd or even
                if(i%2==0){
                    //if the number is even, print it as even number
                    System.out.println(i+" is even number.");
                }
                else{
                    //if the number is odd, print it as an odd number
                    System.out.println(i+" is odd number.");
                }
            }
        }
        sc.close();
    }
}
