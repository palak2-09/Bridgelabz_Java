/*
Create a program to print the greatest factor of a number beside itself using a loop.
Hint =>
a. Get an integer input and assign it to the number variable. As well as define a
greatestFactor variable and assign it to 1
b. Create a for loop that runs from last but one till 1 as in i = number - 1 to i = 1.
c. Inside the loop, check if the number is perfectly divisible by i then assign i to
greatestFactor variable and break the loop.
d. Display the greatestFactor variable outside the loop
 */
package javaControlFlow.Level2;

import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        here we will take a number and find its greatest factor except the number itself
         */

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int greatestFactor = 1;

        // Find the greatest factor excluding the number itself
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("The greatest factor of " + number + " is " + greatestFactor);

        sc.close();
    }
}