/*
Create a program to check if a number taken from the user is a Harshad Number.
Hint =>
A Harshad number is an integer which is divisible by the sum of its digits.
For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).
Get an integer input for the number variable.
Create an integer variable sum with initial value 0.
Create a while loop to access each digit of the number.
Inside the loop, add each digit of the number to sum.
Check if the number is perfectly divisible by the sum.
If the number is divisible by the sum, print Harshad Number. Otherwise, print Not a Harshad Number.
 */
package javaControlFlow.Level3;
import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        /*
        1. Take an integer input from the user.
        2. Store the original number for the final comparison.
        3. Use a while loop to extract each digit and calculate their sum.
        4. Check whether the original number is divisible by the sum of its digits.
        5. If divisible, print "Harshad Number"; otherwise, print "Not a Harshad Number".
        */
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        //storing the original
        int originalNumber=number;
        //initialize sum to 0
        int sum=0;
        //extract each digit and calculate the sum
        while(number>0){
            int digits=number%10;
            sum+=digits;
            number=number/10;
        }
        //check whether the original number is divisible by the sum
        if(sum>0 && originalNumber%sum==0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not a harshad number");
        }
    }
}
