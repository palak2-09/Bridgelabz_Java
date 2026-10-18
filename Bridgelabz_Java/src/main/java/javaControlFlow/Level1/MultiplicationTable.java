/*
Create a program to find the multiplication table of a number entered by the user from 6 to 9.
Hint =>
Take integer input and store it in the variable number
Using a for loop, find the multiplication table of number from 6 to 9 and print it in the format number * i = ___
 */
package javaControlFlow.Level1;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        /*
        here, we have to take a number as input from the user and then print
        its multiplication table from 6 to 9(both inclusive)
         */
        Scanner sc=new Scanner(System.in);
        //taking number as input from the user
        System.out.println("Enter a number:");
        int number=sc.nextInt();

        //print multiplication table from 6 to 9
        for(int i=6;i<=9;i++){
            System.out.println(number+" * "+i+" = "+(number*i));
        }
        sc.close();
    }
}
