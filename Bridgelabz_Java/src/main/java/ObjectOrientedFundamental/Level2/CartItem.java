/*
Program to Simulate a Shopping Cart
Problem Statement: Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
Add an item to the cart.
Remove an item from the cart.
Display the total cost.
Explanation: The CartItem class models a shopping cart item. The methods handle cart operations like adding or removing items and calculating the total cost.
 */
package ObjectOrientedFundamental.Level2;
import java.util.Scanner;
public class CartItem {
    String itemName;
    double price;
    int quantity;

    //method to add an item to cart
    void addItem(int quantityToAdd){
        if(quantityToAdd>0){
            quantity+=quantityToAdd;
            System.out.println("Item added successfully");
        }
        else{
            System.out.println("Invalid quantity");
        }
    }
    //method to remove items from the cart
    void removeItem(int quantityToRemove){
        if(quantityToRemove<=0){
            System.out.println("Invalid quantity!");
        }
        else if(quantityToRemove<=quantity){
            quantity-=quantityToRemove;
            System.out.println("Item removed successfully");
        }
        else{
            System.out.println("Not enough items in the cart!");
        }
    }
    // Method to display the total cost
    void displayTotalCost() {
        double totalCost = price * quantity;

        System.out.println("\n--- Shopping Cart Details ---");
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // Create a CartItem object
        CartItem obj = new CartItem();

        // Take item details from the user
        System.out.print("Enter item name: ");
        obj.itemName = sc.nextLine();

        System.out.print("Enter price per item: ");
        obj.price = sc.nextDouble();

        System.out.print("Enter initial quantity: ");
        int initialQuantity = sc.nextInt();

        // Add the initial quantity
        obj.addItem(initialQuantity);

        // Remove items if required
        System.out.print("Enter quantity to remove: ");
        int quantityToRemove = sc.nextInt();

        obj.removeItem(quantityToRemove);

        // Display the final cart details
        obj.displayTotalCost();

        sc.close();
    }

}
