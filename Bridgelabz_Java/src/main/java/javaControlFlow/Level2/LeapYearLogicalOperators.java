/*
Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators
 */
package javaControlFlow.Level2;
import java.util.Scanner;
public class LeapYearLogicalOperators {
    public static void main(String[] args){
        /*
        here we have to take year as input from the user and apply certain conditions
        to check whether the year entered by the user is leap year or not
         */
        Scanner sc=new Scanner(System.in);
        //taking year as input from the user
        System.out.println("Enter the year:");
        int year=sc.nextInt();

        //check leap year using a single if condition
        if(year>=1582 && (year%400==0 || (year%4==0 && year%100!=0))){
            System.out.println("Leap Year");
        }
        else if(year<1582){
            System.out.println("Enter a year greater than or equal to 1582");
        }
        else{
            System.out.println("Not a leap year");
        }

        sc.close();
    }
}
