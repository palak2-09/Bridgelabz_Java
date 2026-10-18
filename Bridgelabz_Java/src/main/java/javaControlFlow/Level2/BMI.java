/*
Create a program to find the BMI of a person
Hint =>
a. Take user input in double for the weight (in kg) of the person and height (in cm) for the
person and store it in the corresponding variable.
b. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm
to meter
c. Use the table to determine the weight status of the person
 */
package javaControlFlow.Level2;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        /*
        in this question we are taking height and weight as input from the user
        and then calculating the bmi and telling them the remarks as per their bmi
         */
        //taking weight as input from the user
        System.out.println("Enter the weight of the person in kgs:");
        double weight=sc.nextDouble();

        System.out.println("Enter the height of the person in cms:");
        double height=sc.nextDouble();

        //converting height from centimeters into meters
        double heightConversion=height/100;

        //calculating the bmi
        double bmi=weight/(heightConversion*heightConversion);

        System.out.println("BMI: "+bmi);

        //determining th weight status
        if(bmi<=18.4){
            System.out.println("Underweight");
        }
        else if(bmi>=18.5 && bmi<=24.9){
            System.out.println("Normal");
        }
        else if(bmi>=25.0 && bmi<=39.9){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }
    }
}
