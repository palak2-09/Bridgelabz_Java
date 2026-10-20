/*
Write a program to take 2 numbers and print their quotient and reminder
Hint =>
Take user input as integer
Use division operator (/) for quotient and moduli operator (%) for reminder
Write Method to find the reminder and the quotient of a number
public static int[] findRemainderAndQuotient(int number, int divisor)
 */
package Methods.Level1;
import java.util.Scanner;
public class Division {
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int remainder=number%divisor;
        int quotient=number/divisor;

        return new int[]{remainder,quotient};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //take input from the user
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        System.out.println("Enter the divisor:");
        int divisor=sc.nextInt();
        //storing the results
        int[] results=findRemainderAndQuotient(number,divisor);
        //displaying the results
        System.out.println("The Remainder is:"+results[0]);
        System.out.println("The Quotient is:"+results[1]);

        sc.close();
    }
}
