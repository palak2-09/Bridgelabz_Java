/*
Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
Hint =>
Create a variable counter to take user inputted value for the countdown.
Use the while loop to check if the counter is 1
Inside a while loop, print the value of the counter and decrement the counter.

 */
package javaControlFlow.Level1;
import java.util.Scanner;
public class RocketLaunch {
    public static void main(String[] args){
        /*take counter for countdown as input from the user and decrement it until it
        is greater than or equal to 1*/
        Scanner sc=new Scanner(System.in);

        //taking the strating value of the countdown from the user
        System.out.println("Enter the value of counter:");
        int counter=sc.nextInt();

        //continue the countdown until the counter is greater than or equal to 1
        while(counter>=1){
            System.out.println(counter);
            //decrement the counter
            counter--;
        }
        sc.close();
    }
}
