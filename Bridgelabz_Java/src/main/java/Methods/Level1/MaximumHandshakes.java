/*
Create a program to find the maximum number of handshakes among N number of students.
Hint =>
Get integer input for number of students
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes
 */
package Methods.Level1;

import java.util.Scanner;

public class MaximumHandshakes {
    //method to calculate the maximum number of handshakes
    public static int maximumNoOfHandshakes(int number){
        //formula to calculate the maximum number of handshakes
        int combination=(number*(number-1))/2;
        //return the calculated maximum number of handshakes
        return combination;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //ask the user to enter the number of students
        System.out.println("Enter the number of students:");
        int number=sc.nextInt();

        //call the method to calculate the max no of handshakes
        int maximumHandshakes=maximumNoOfHandshakes(number);
        System.out.println("The maximum number of handshakes possible are: "+maximumHandshakes);
        sc.close();
    }
}
