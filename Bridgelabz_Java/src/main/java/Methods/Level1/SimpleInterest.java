/*
Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint =>
Simple Interest = Principal * Rate * Time / 100
Take user input for principal, rate, time
Write a method to calculate the simple interest given principle, rate and time as parameters
Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”
 */
package Methods.Level1;
import java.util.Scanner;
public class SimpleInterest {
    //method to calculate the simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time){

        //calculate the SI using the formula
        double simpleInterest=(principal*rate*time)/100;

        //return the calculated simple interest
        return simpleInterest;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);//create scanner object to take user input
        //take principal input
        System.out.println("Enter Principal: ");
        double principal=sc.nextDouble();

        //take rate input
        System.out.println("Enter Rate:");
        double rate=sc.nextDouble();

        //take time input
        System.out.println("Enter time:");
        double time=sc.nextDouble();

        //call the method and store the returned result
        double simpleInterest=calculateSimpleInterest(principal,rate,time);
        //display the result
        System.out.println("The Simple Interest is "+simpleInterest+
                " for Principal "+principal+" , Rate of Interest "+rate+
                " and Time "+time);

        sc.close();

    }
}
