/*
Create a program to find the power of a number.
Hint =>
a. Get integer input for two variables named number and power.
b. Create a result variable with an initial value of 1.
c. Run a for loop from i = 1 to i <= power.
d. In each iteration of the loop, multiply the result with the number and assign the value to
the result.
e. Finally, print the result

 */
package javaControlFlow.Level2;
import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // Take the number as input
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        // Take the power as input
        System.out.println("Enter power:");
        int power=sc.nextInt();
        // Initialize result to 1
        int result=1;
        // Calculate power using a for loop
        for(int i=1;i<=power;i++){
            result=result*number;
        }
        //display the result
        System.out.println("The result is: "+result);
        sc.close();
    }
}
