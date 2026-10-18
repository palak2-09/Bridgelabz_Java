/*
Write a program to create a calculator using switch...case.
Hint =>
Create two double variables named first and second and a String variable named op.
Get input values for all variables.
The input for the operator can only be one of the four values: "+", "-", "*" or "/".
Run a for loop from i = 1 to i < number.
Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
If op is neither of those 4 values, print Invalid Operator.


 */
package javaControlFlow.Level3;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        /*
        This program creates a simple calculator using switch-case.
        It takes two numbers and an operator as input from the user.
        Based on the operator (+, -, *, /), it performs the corresponding arithmetic operation.
        It checks for division by zero and displays an error if the second number is zero.
        If the operator is invalid, it displays "Invalid operator".
        */

        //taking first number from the user
        System.out.println("Enter the first number:");
        double first=sc.nextDouble();
        //taking second number from the user
        System.out.println("Enter the second number:");
        double second=sc.nextDouble();
        //asking the user to enter the operation ie needed to be performed
        System.out.println("Enter an operator (+,-,*,/)");
        String op=sc.next();
        //perform the operation using switch
        switch(op){
            case "+":
                System.out.println("Result: "+(first+second));
                break;
            case "-":
                System.out.println("Result: "+(first-second));
                break;
            case "*":
                System.out.println("Result: "+(first*second));
                break;
            case "/":
                if(second!=0){
                    System.out.println("Result: "+(first/second));
                }
                else{
                    System.out.println("Cannot divide by 0");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
}
