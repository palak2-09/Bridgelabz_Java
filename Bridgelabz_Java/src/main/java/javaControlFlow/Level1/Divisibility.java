/*
Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5? ___
*/
package javaControlFlow.Level1;
import java.util.Scanner;
public class Divisibility {
    public static void main(String[] args){
        //here we have to take a number as input and check if it is divisible by 5 or not
        //create a scanner object to take input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();

        //check whether the number is divisible by 5
        if(number%5==0){
            //display true if divisible by 5
            System.out.println("Is the number "+number+
                    " divisible by 5? true");
        }
        else{
            //display false if not divisible by 5
            System.out.println("Is the number "+number+
                    " divisible by 5? false");
        }
        //close the scanner object
        sc.close();
    }
}
