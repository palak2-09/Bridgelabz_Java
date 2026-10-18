/*
 Create a program to find the factors of a number taken as user input.
Hint =>
a. Get the input value for a variable named number.
b. Run a for loop from i = 1 to i < number.
c. In each iteration of the loop, check if number is perfectly divisible by i.
d. If true, print the value of i.
 */
package javaControlFlow.Level2;
import java.util.Scanner;
public class FactorsOfaNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        if(number<=0){
            System.out.println("Please enter a positive integer.");
        }
        else{
            //find factors of a nhumber
            for(int i=1;i<number;i++){
                if(number%i==0){
                    System.out.println(i);
                }
            }
        }

    }
}
