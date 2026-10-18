/*
Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
Hint =>
Spring Season is from March 20 to June 20

 */
package javaControlFlow.Level1;
import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args){
        //here we need to take month and day as input and then check whether the season is spring or not
        Scanner sc=new Scanner(System.in);

        //take month and day as input
        System.out.println("Enter the month (1-12):");
        int month=sc.nextInt();

        System.out.println("Enter the day:");
        int day=sc.nextInt();

        //checking whether the date falls within the spring season
        if((month==3 && day>=20 && day<=31)||
                (month==4 && day>=1 && day<=30)||
                (month==5 && day>=1 && day<=31)||
                (month==6 && day>=1 && day<=20)){
            System.out.println("Its a Spring Season");
        }
        else{
            System.out.println("Not a Spring Season");
        }


    }
}
