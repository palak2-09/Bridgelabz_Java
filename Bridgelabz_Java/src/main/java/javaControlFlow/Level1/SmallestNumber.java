/*
Write a program to check if the first is the smallest of the 3 numbers.
I/P => number1, number2, number3
O/P => Is the first number the smallest? ____

*/
package javaControlFlow.Level1;
import java.util.Scanner;
public class SmallestNumber {
    public static void main(String[] args){
        //here we have to take three numbers as input and check if first number is the smallest

        //create a scanner object to take input from the user
        Scanner sc=new Scanner(System.in);

        //take first number as input
        System.out.println("Enter the first number:");
        int number1=sc.nextInt();

        //take second number as input
        System.out.println("Enter the second number:");
        int number2=sc.nextInt();

        //take third number as input
        System.out.println("Enter the third number:");
        int number3=sc.nextInt();

        //check if the first number is smaller than both the other numbers
        if(number1<number2 && number1<number3){
            //display true if first number is the smallest
            System.out.println("Is the first number the smallest? true");
        }
        else{
            //display false if first number is not the smallest
            System.out.println("Is the first number the smallest? false");
        }
        sc.close();

    }
}
