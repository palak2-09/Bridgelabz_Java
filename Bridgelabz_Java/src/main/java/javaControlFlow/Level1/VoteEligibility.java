/*
Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.
Hint =>
Get integer input from the user and store it in the age variable.
If the person is 18 or older, print "The person can vote." Otherwise, print "The person cannot vote."
I/P => age
O/P => If the person's age is greater or equal to 18 then the output is
The person's age is ___ and can vote.
Otherwise
The person's age is ___ and cannot vote.

 */
package javaControlFlow.Level1;
import java.util.Scanner;
public class VoteEligibility {
    public static void main(String[] args){
        /*takes age as input from the user and checks if the age is greater than 18 then the
        user can vote, otherwise the user cannot vote.*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of the person:");
        int age=sc.nextInt();

        //checking if age is greater than or equal to 18, then eligible to vote
        if(age>=18){
            System.out.println("The person's age is "+age+" and can vote.");
        }
        //if age is less than 18 then, not eligible to vote
        else{
            System.out.println("The person's age is "+age+" and cannot vote.");
        }
        sc.close();
    }
}
