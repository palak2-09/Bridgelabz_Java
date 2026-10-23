/*
Program to Track Inventory of Items
Problem Statement: Create an Item class with attributes itemCode, itemName, and price. Add a method to display item details and calculate the total cost for a given quantity
 */
package ObjectOrientedFundamental.Level1;
import java.util.Scanner;
public class Item {
    int itemCode;
    String itemName;
    double price;

    //method to display the item details
    void displayDetails(){
        System.out.println("Code: "+itemCode);
        System.out.println("Item Name: "+itemName);
        System.out.println("Price: "+price);
    }
    //method to calculate total cost
    void calculateTotalCost(int quantity){
        double totalCost=price*quantity;
        System.out.println("Quantity: "+quantity);
        System.out.println("Total Cost: "+totalCost);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //create an item object
        Item obj=new Item();

        // Take item details from the user
        System.out.print("Enter item code: ");
        obj.itemCode = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter item name: ");
        obj.itemName = sc.nextLine();

        System.out.print("Enter item price: ");
        obj.price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        // Display item details
        obj.displayDetails();

        // Calculate and display total cost
        obj.calculateTotalCost(quantity);

        sc.close();
    }
}
