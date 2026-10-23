/*
Program to Handle Book Details
Problem Statement: Write a program to create a Book class with attributes title, author, and price. Add a method to display the book details.
 */
package ObjectOrientedFundamental.Level1;

import java.util.Scanner;

public class Book {
    String title;
    String author;
    double price;

    //display the title,author nd price
    void display(){
        System.out.println("The title is: "+title);
        System.out.println("The author is: "+author);
        System.out.println("The price is: "+price);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //create an object of book class
        Book b=new Book();

        System.out.println("Enter the title of the book:");
        b.title=sc.nextLine();


        System.out.println("Enter the author of the book:");
        b.author=sc.nextLine();


        System.out.println("Enter the price of the book:");
        b.price=sc.nextDouble();

        //display the result
        b.display();
        sc.close();
    }
}
