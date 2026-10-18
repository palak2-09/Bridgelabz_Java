/*
Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on
their ages and the tallest among the friends based on their heights
Hint =>
a. Take user input for the age and height of the 3 friends and store it in a variable
b. Find the smallest of the 3 ages to find the youngest friend and display it
c. Find the largest of the 3 heights to find the tallest friend and display it
 */
package javaControlFlow.Level2;
import java.util.Scanner;
public class YoungestFriend {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        /*
        here we will take height and age of 3 friends
        among that we need to find who is the youngest and who is the tallest
         */
        //age of the three friends
        System.out.println("Enter the age of Amar:");
        int amarAge=sc.nextInt();
        System.out.println("Enter the age of Akbar:");
        int akbarAge=sc.nextInt();
        System.out.println("Enter the age of Anthony:");
        int anthonyAge=sc.nextInt();

        //height of the three friends
        System.out.println("Enter the height of Amar:");
        int amarHeight=sc.nextInt();
        System.out.println("Enter the height of Akbar:");
        int akbarHeight=sc.nextInt();
        System.out.println("Enter the height of Anthony:");
        int anthonyHeight=sc.nextInt();

        //comparing the age of 3 friends and displaying the youngest
        if(amarAge<akbarAge && amarAge<anthonyAge){
            System.out.println("Amar is the youngest");
        }
        else if(akbarAge<amarAge && akbarAge<anthonyAge){
            System.out.println("Akbar is the youngest");
        }
        else if (anthonyAge < amarAge && anthonyAge < akbarAge) {
            System.out.println("Anthony is the youngest");
        }
        else {
            System.out.println("Two or more friends have the same minimum age");
        }
        //comparing the height of the 3 friends and displaying the tallest

        if(amarHeight>akbarHeight && amarHeight>anthonyHeight){
            System.out.println("Amar is the tallest");
        }
        else if(akbarHeight>amarHeight && akbarHeight>anthonyHeight){
            System.out.println("Akbar is the tallest");
        }
        else if (anthonyHeight > amarHeight && anthonyHeight > akbarHeight) {
            System.out.println("Anthony is the tallest");
        }
        else {
            System.out.println("Two or more friends have the same maximum height");
        }

        sc.close();


    }
}
