/*
Write a program to check whether a number is positive, negative, or zero.
Hint =>
Get integer input from the user and store it in the number variable.
If the number is positive, print positive.
If the number is negative, print negative.
If the number is zero, print zero.
 */
package javaControlFlow.Level1;
import java.util.Scanner;
public class NumberTypeChecking {
    public static void main(String[] args){
        //take input from user and check if the number is zero, negative or positive

        Scanner sc=new Scanner(System.in);

        //taking input from the user
        System.out.println("Enter the number:");
        int number=sc.nextInt();

        //if number=0 print zero
        if(number==0){
            System.out.println("Zero");
        }
        //when number is greater than 0 then print positive
        else if(number>0){
            System.out.println("Positive");
        }
        //if the number is less than 0 then print negative
        else{
            System.out.println("Negative");
        }

        sc.close();
    }
}
