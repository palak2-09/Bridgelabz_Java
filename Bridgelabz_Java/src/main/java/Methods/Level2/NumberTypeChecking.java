/*
Write a program to take user input for 5 numbers and check whether a number is positive or negative. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less
Hint =>
Write a Method to Check whether the number is positive or negative
Write a Method to check whether the number is even or odd
Write a Method to compare two numbers and return 1 if number1 > number2 or 0 if both are equal or -1 if number1 < number2
In the main program, Loop through the array using the length call the method isPositive() and if positive call method isEven() and print accordingly
If the number is negative, print negative.
Finally compare the first and last element of the array by calling the method compare() and display if they are equal, greater, or less
 */
package Methods.Level2;

import java.util.Scanner;
public class NumberTypeChecking {
    //method to check whether a number is positive or not
    public static boolean isPositive(int number){
        return number >= 0;
    }
    //method to check whether a number is even
    public static boolean isEven(int number){
        return number%2==0;
    }
    /*
    method to compare 2 numbers
    if number1>number2 return 1
    if number1<number2 return -1
    if both equal return 0
     */
    public static int compare(int number1, int number2){
        if(number1>number2){
            return 1;
        }
        else if(number1==number2){
            return 0;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //create an array to store 5 elements
        int[] numbers=new int[5];

        //take input from the user
        for(int i=0;i<5;i++){
            System.out.println("Enter number "+(i+1)+" :");
            numbers[i]=sc.nextInt();
        }

        //check each number
        for(int i=0;i<numbers.length;i++){
            if(isPositive(numbers[i])){
                System.out.println(numbers[i]+" is positive.");
                if(isEven(numbers[i])){
                    System.out.println(numbers[i]+" is even.");
                }
                else{
                    System.out.println(numbers[i]+" is odd.");
                }
            }
            else if(numbers[i]<0){
                System.out.println(numbers[i]+" is negative.");
            }
            else{
                System.out.println(numbers[i]+" is zero.");
            }
        }
        int result=compare(numbers[0],numbers[numbers.length-1]);
        if (result == 1) {
            System.out.println("First element is greater than the last element.");
        } else if (result == 0) {
            System.out.println("First and last elements are equal.");
        } else {
            System.out.println("First element is less than the last element.");
        }

        sc.close();
    }
}
