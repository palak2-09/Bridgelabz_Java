/*
Rewrite the program 5 FizzBuzz using while loop
 */
package javaControlFlow.Level2;
import java.util.Scanner;
public class FizzBuzzWhileLoop {
    public static void main(String[] args){
        /*Print numbers from 0 to the given positive integer using a
        while loop, replacing multiples of 3 with Fizz, multiples of 5 with Buzz,
        and multiples of both with FizzBuzz.
         */
        Scanner sc=new Scanner(System.in);
        //taking number as input from the user
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        //if number is less than 0 then ask to enter a positive number
        if(number<=0){
            System.out.println("Please enter a positive number.");
        }
        else{
            int i=0;
            while(i<=number){
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
                i++;
            }
        }
        sc.close();
    }
}

