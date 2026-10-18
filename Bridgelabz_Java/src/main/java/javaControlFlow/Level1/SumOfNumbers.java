/*
Write a program to find the sum of numbers until the user enters 0
Hint =>
Create a variable total of type double initialize to 0.0. Also, create a variable to store the double value the user enters
Use the while loop to check if the user entered is 0
If the user entered value is not 0 then inside the while block add user entered value to the total and ask the user to input again
The loop will continue till the user enters zero and outside the loop display the total value

 */
package javaControlFlow.Level1;
import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args){
        /*here we have to take a number as input from the user and initialise a double
        variable named sum=0.0
        if the number entered by the user is not equal to 0 then add that number in the sum
        and ask the user to enter another number
        continue until the user enters 0
         */
        Scanner sc=new Scanner(System.in);

        //initialise a variable sum as 0
        double sum=0.0;

        //take input from the user
        System.out.println("Enter the number:");
        double number=sc.nextDouble();

        //while the number is not equal to 0 add it in the sum else enter another number
        while(number!=0){
            sum+=number;
            System.out.println("Enter another number:");
            number=sc.nextDouble();

        }
        //enter the final value of the sum
        System.out.println("The total value is: "+sum);
    }
}
