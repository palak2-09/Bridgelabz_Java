/*
Create a program to count the number of digits in an integer.
Hint =>
Get an integer input for the number variable.
Create an integer variable count with value 0.
Use a loop to iterate until number is not equal to 0.
Remove the last digit from number in each iteration
Increase count by 1 in each iteration.
Finally display the count to show the number of digits

 */
package javaControlFlow.Level3;
import java.util.Scanner;
public class NumberOfDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //get an integer input from the user
        System.out.println("Enter a number:");
        int number=sc.nextInt();

        //store the absolute value to handle negative integers
        number=Math.abs(number);
        //initialise count to 0
        int count=0;

        //special case : zero is also one digit
        if(number==0){
            count=1;
        }
        else{
            while(number!=0){
                number=number/10;
                count++;
            }

        }
        System.out.println("The total number of digits are: "+count);
        sc.close();
    }
}
