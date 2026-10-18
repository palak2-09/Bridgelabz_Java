package javaControlFlow.Level1;
import java.util.Scanner;
public class SumOfNumbersBreak {
    public static void main(String[] args){
        /*
         * Program to calculate the sum of positive numbers entered by the user.
         * The program uses an infinite while loop to repeatedly accept numbers.
         * If the user enters 0 or a negative number, the break statement
         * terminates the loop.
         * Finally, the program displays the total sum of the positive numbers.
         */
        Scanner sc=new Scanner(System.in);
        // Initialize the sum to 0.0
        double sum=0.0;
        // Create an infinite while loop
        while(true){
            // Ask the user to enter a number
            System.out.println("Enter the number:");
            double number=sc.nextDouble();

            // Stop the loop if the number is 0 or negative
            if(number<=0){
                break;
            }
            // Add the positive number to the sum
            sum+=number;
        }
        System.out.println("The total sum is: "+sum);
        sc.close();
    }
}
