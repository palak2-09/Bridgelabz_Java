/*
Create a program to find all the multiple of a number taken as user input below 100.
Hint =>
a. Get input value for a variable named number.
b. Run a for loop backward: from i = 100 to i = 1.
c. Inside the loop, check if i perfectly divide the number.
d. If true, print the number and continue the loop.

 */
package javaControlFlow.Level2;
import java.util.Scanner;
public class MultipleOfaNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // Ask the user to enter a number
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        // Check whether the number is positive
        if(number<=0){
            System.out.println("Please a positive number");
        }
        else{
            // Loop backward from 100 to 1
            for(int i=100;i>=1;i--){
                // Check whether i is a multiple of the given number
                if(i%number==0){
                    // Print the multiple
                    System.out.println(i);
                }
            }
        }
    }
}
