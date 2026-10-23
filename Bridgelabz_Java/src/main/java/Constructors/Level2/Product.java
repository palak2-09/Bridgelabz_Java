/*
1. Instance vs. Class Variables and Methods
Problem 1: Product Inventory
Create a Product class with:
Instance Variables: productName, price.
Class Variable: totalProducts (shared among all products).
Methods:
An instance method displayProductDetails() to display the details of a product.
A class method displayTotalProducts() to show the total number of products created.

 */
package Constructors.Level2;

public class Product {

    // Instance variables
    String productName;
    double price;

    // Class variable (shared by all objects)
    static int totalProducts = 0;

    // Parameterized constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs. " + price);
    }

    // Class method
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {

        Product product1 = new Product("Laptop", 50000);
        Product product2 = new Product("Mobile", 20000);
        Product product3 = new Product("Headphones", 1500);

        System.out.println("Product 1 Details:");
        product1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        product2.displayProductDetails();

        System.out.println("\nProduct 3 Details:");
        product3.displayProductDetails();

        System.out.println();
        Product.displayTotalProducts();
    }
}