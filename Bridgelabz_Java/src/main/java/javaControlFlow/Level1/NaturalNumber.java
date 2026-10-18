/*
Write a program to check for the natural number and write the sum of n natural numbers
Hint =>
A Natural Number is a positive integer (1,2,3, etc) sometimes with the inclusion of 0
A sum of n natural numbers is n * (n+1) / 2
I/P => number
O/P => If the number is a positive integer then the output is
The sum of ___ natural numbers is ___
Otherwise
The number ___ is not a natural number

 */
package javaControlFlow.Level1;
import java.util.Scanner;
public class NaturalNumber {
    public static void main(String[] args){
        /*
        here we have to check whether the given number is a natural number.
        If it is a natural number then calculate the sum of first n natural numbers as per the given number
        else print that given number is not a natural number
        */
        Scanner sc=new Scanner(System.in);

        //take a number as input
        System.out.println("Enter a number:");
        int number=sc.nextInt();

        //check whether the number is a positive integer
        if(number>0){
            //calculate the sum of first n natural numbers
            int sum=number*(number+1)/2;

            //display the sum
            System.out.println("The sum of "+number+"natural numbers is "+sum);
        }
        else{
            //display a message as the number is not a natural number
            System.out.println("The number "+number+" is not a natural number.");
        }

        sc.close();
    }
}

