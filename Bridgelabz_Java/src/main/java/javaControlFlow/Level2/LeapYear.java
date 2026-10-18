/*
Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
Hint =>
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. So ensure to check for the same.
Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400. E.g. 1800 is not a Leap Year and 2000 is a Leap Year.
Write code having multiple if else statements based on conditions provided above and a second part having only one if statement and multiple logical
 */
package javaControlFlow.Level2;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        /*
        here we have to take year as input from the user and apply certain conditions
        to check whether the year entered by the user is leap year or not
         */
        Scanner sc=new Scanner(System.in);
        //taking year as input from the user
        System.out.println("Enter the year:");
        int year=sc.nextInt();

        if(year<1582){
            System.out.println("Enter the year greater than or equal to 1582");
        }
        //Approach 1: using multiple if else statements
        else{
            if(year%400==0){
                System.out.println("Leap Year (Using if-else)");
            }
            else if(year%100==0){
                System.out.println("Not a leap year(Using if-else)");
            }
            else if(year%4==0){
                System.out.println("Leap year (Using if-else)");
            }
            else{
                System.out.println("Not a leap year (Using if-else)");
            }

            //Approach 2: using a single if statement
            if((year%400==0) || (year%4==0 && year%100!=0)) {
                System.out.println("Leap year (Using logical operators)");
            }
            else{
                System.out.println("Not a leap year (Using logical operators)");
            }
        }
        sc.close();

    }

}
