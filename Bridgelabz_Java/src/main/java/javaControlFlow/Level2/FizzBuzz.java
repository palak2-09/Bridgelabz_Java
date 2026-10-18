/*
Write a program FizzBuzz, take a number as user input, and if it is a positive integer loop
from 0 to the number and print the number, but for multiples of 3 print "Fizz" instead of the
number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".
Hint =>
a. Write the program and use for loop

 */
package javaControlFlow.Level2;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //taking number as input from the user
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        //if number is less than 0 then ask to enter a positive number
        if(number<0){
            System.out.println("Please enter a positive number.");
        }
        else{
            for(int i=0;i<=number;i++){
                if(i%3==0 && i%5==0){
                    System.out.println("FizzBuzz");
                }
                else if(i%3==0){
                    System.out.println("Fizz");
                }
                else if(i%5==0){
                    System.out.println("Buzz");
                }
                else{
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
