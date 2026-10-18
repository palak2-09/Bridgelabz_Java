/*
Create a program to find the bonus of employees based on their years of service.
Hint =>
Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
Take salary and year of service in the year as input.
Print the bonus amount.
 */
package javaControlFlow.Level1;
import java.util.Scanner;
public class BonusOfEmployees {
    public static void main(String[] args){
        /*
        here we have to take salary and years of service as input from the user
        if the years of service is greater than 5 years then we need to give 5% bonus on salary
        and output will be the bonus amount given to the employee
         */
        Scanner sc=new Scanner(System.in);

        //ask the user to enter their salary
        System.out.println("Enter the salary:");
        double salary=sc.nextDouble();

        //ask the user to enter their service period
        System.out.println("Enter the years of service:");
        int yearOfService=sc.nextInt();

        double bonus=0;
        //calculate 5% bonus if service is more than 5 years
        if(yearOfService>5){
            bonus=(5.0/100.0)*salary;
        }
        //displaying the bonus amount
        System.out.println("The bonus amount is: "+bonus);
    }
}
