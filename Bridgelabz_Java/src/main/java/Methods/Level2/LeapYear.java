/*
Write a program that takes a year as input and outputs the Year is a Leap Year or not
Hint =>
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar.
Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
Write a method to check for Leap Year using the conditions a and b
 */
package Methods.Level2;
import java.util.Scanner;
public class LeapYear {
    public static boolean checkLeapYear(int year){
        if(year%4==0 && (year%100!=0 || year%400==0)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //taking input from the user
        System.out.println("Enter a year:");
        int year=sc.nextInt();

        if(year<1582){
            System.out.println("Invalid input! Please enter a year after 1582");
            sc.close();
            return;
        }

        boolean results=checkLeapYear(year);
        if(results){
            System.out.println("It is a leap year.");
        }
        else{
            System.out.println("Not a leap year.");
        }
        sc.close();
    }
}
