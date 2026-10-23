/*
Program to Handle Mobile Phone Details
Problem Statement: Create a MobilePhone class with attributes brand, model, and price. Add a method to display all the details of the phone. The MobilePhone class uses attributes to store the phone's characteristics. The method is used to retrieve and display this information for each object.

 */
package ObjectOrientedFundamental.Level1;

import java.util.Scanner;

public class MobilePhone {
    String brand;
    String model;
    double price;
    //method to retrieve and display information
    void display(){
        System.out.println("Brand of the phone: "+brand);
        System.out.println("Model of the phone: "+model);
        System.out.println("Price of the phone: "+price);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //create an object to access class variables
        MobilePhone obj=new MobilePhone();
        System.out.println("Enter the brand of phone:");
        obj.brand=sc.nextLine();

        System.out.println("Enter the model of phone:");
        obj.model=sc.nextLine();

        System.out.println("Enter the price of phone:");
        obj.price=sc.nextDouble();

        //call the function to display
        obj.display();
        sc.close();


    }
}
