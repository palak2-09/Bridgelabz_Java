/*
Write a program to check if the first, second, or third number is the largest of the three.
I/P => number1, number2, number3
O/P =>
Is the first number the largest? ____
Is the second number the largest? ___
Is the third number the largest? ___
 */
package javaControlFlow.Level1;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args){
        //here we have to take 3 numbers as input and check which number is the largest

        //scanner object to take input from the user
        Scanner sc=new Scanner(System.in);

        //take three numbers as input
        System.out.println("Enter the first number:");
        int number1=sc.nextInt();
        System.out.println("Enter the second number:");
        int number2=sc.nextInt();
        System.out.println("Enter the third number:");
        int number3=sc.nextInt();

        //check if first number is the largest
        if(number1>number2 &&  number1>number3){
            System.out.println("Is the first number the largest? true");
        }
        else{
            System.out.println("Is the first number the largest? false");
        }

        //check if second number is the largest
        if(number2>number1 && number2>number3){
            System.out.println("Is the second number the largest? true");
        }
        else{
            System.out.println("Is the second number the largest? false");
        }

        //check if third number is the largest
        if(number3>number1 && number3>number2){
            System.out.println("Is the third number the largest? true");
        }
        else{
            System.out.println("Is the third number the largest? false");
        }

        sc.close();
    }
}

