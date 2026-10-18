/*
Create a program to check if a number is an Abundant Number.
Hint =>
An abundant number is an integer in which the sum of all the divisors of the number is greater than the number itself. For example,
Divisor of 12: 1, 2, 3, 4, 6
Sum of divisor: 1 + 2 + 3 + 4 + 6 = 16 > 12
Get an integer input for the number variable.
Create an integer variable sum with initial value 0.
Run a for loop from i = 1 to i < number.
Inside the loop, check if number is divisible by i.
If true, add i to sum.
Outside the loop Check if sum is greater than number.
If the sum is greater than the number, print Abundant Number. Otherwise, print Not an Abundant Number.

 */
package javaControlFlow.Level3;
import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        /*
        In this question, we need to find all the divisors of the given number except the number itself
        then we need to add all the divisors
        if the sum is greater than the number then, it is an abundant number
        otherwise it is not an abundant number
         */
        //taking number as input from the user
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        //initialising a sum variable equal to 0
        int sum=0;
        //finding all the divisors and adding to sum
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        //if sum is greater than the number then it is abundant otherwise, its not
        if(sum>number){
            System.out.println("Abundant Number");
        }
        else{
            System.out.println("Not an Abundant Number");
        }
        sc.close();
    }
}
