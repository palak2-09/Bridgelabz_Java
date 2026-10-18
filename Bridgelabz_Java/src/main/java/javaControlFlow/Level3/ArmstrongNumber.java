/*
Create a program to check if a number is Armstrong or not. Use the hints to show the steps clearly in the code
Hint =>
Armstrong Number is a number whose Sum of cubes of each digit results in the original number e.g. 153 = 1^3 + 5^3 + 3^3
Get an integer input and store it in the number variable define sum variable, initialize it to zero and originalNumber variable, and assign it to the input number variable
Use the while loop till the originalNumber is not equal to zero
In the while loop find the reminder number by using the modulus operator as in  number % 10. Find the cube of the number and add it to the sum variable
Again in while loop find the quotient of the number and assign it to the original number using number / 10 expression. This romoves the last digit of the original number.
Finally check if the number and the sum are the same, if same its an Armstrong number else not. So display accordingly

 */
package javaControlFlow.Level3;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //taking number as input from the user
        System.out.println("Enter a number:");
        int number=sc.nextInt();

        int originalNumber=number;
        int temp=number;
        int sum=0;
        int count=0;

        //count the number of digits
        while(temp!=0){
            count++;
            temp=temp/10;
        }
        //handle zero as a one digit number
        if(number==0){
            count=1;
        }
        temp=number;
        //calculate the sum of each digit raised to the power of number of digits
        while(temp!=0){
            int digit=temp%10;
            int power=1;

            for(int i=1;i<=count;i++){
                power=power*digit;
            }
            sum+=power;
            temp/=10;
        }
        //check whether the number is an armstrong number
        if(number>=0 && sum==originalNumber){
            System.out.println("Armstrong number.");
        }
        else{
            System.out.println("Not an armstrong number.");
        }
        sc.close();
    }
}
