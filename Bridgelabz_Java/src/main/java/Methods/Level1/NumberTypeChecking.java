/*
Write a program to check whether a number is positive, negative, or zero.
Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero
 */
package Methods.Level1;
import java.util.Scanner;
public class NumberTypeChecking {
    //function to check if the number is +ve, -ve, or zero
    public static int checkNumber(int number){
        if(number>0){
            return 1;
        }
        else if(number<0){
            return -1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //ask the user to input a number
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        //call the method and store the returned value
        int result=checkNumber(number);
        //displaying the result
        if(result==1){
            System.out.println("The number is positive.");
        }
        else if(result==-1){
            System.out.println("The number is negative.");
        }
        else{
            System.out.println("The number is zero.");
        }
        //close the scanner
        sc.close();
    }
}
