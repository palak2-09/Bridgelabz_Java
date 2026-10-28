/*
2. E-Commerce Platform
Description: Develop a simplified e-commerce platform:
Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
Extend it into concrete classes: Electronics, Clothing, and Groceries.
Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
Use encapsulation to protect product details, allowing updates only through setter methods.
Showcase polymorphism by creating a method that calculates and prints the final price (price + tax - discount) for a list of Product.

 */
package EncAbsPoly;

import java.util.ArrayList;
import java.util.List;

// Interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract class
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        setPrice(price);
    }

    // Getters and setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        if (productId > 0) {
            this.productId = productId;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    // Abstract method
    public abstract double calculateDiscount();

    // Calculate and display final price
    public void displayFinalPrice() {
        double discount = calculateDiscount();
        double tax = 0;

        if (this instanceof Taxable) {
            tax = ((Taxable) this).calculateTax();
        }

        double finalPrice = getPrice() + tax - discount;

        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Original Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + finalPrice);

        if (this instanceof Taxable) {
            System.out.println(
                    ((Taxable) this).getTaxDetails());
        }

        System.out.println("-------------------------");
    }
}

// Electronics class
class Electronics extends Product implements Taxable {

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% tax
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 18%";
    }
}

// Clothing class
class Clothing extends Product implements Taxable {

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15; // 15% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% tax
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 5%";
    }
}

// Groceries class
class Groceries extends Product {

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

// Main class
public class ECommercePlatform {

    // Polymorphism
    public static void displayProducts(List<Product> products) {
        for (Product product : products) {
            product.displayFinalPrice();
        }
    }

    public static void main(String[] args) {

        // Creating products
        Product p1 = new Electronics(101, "Laptop", 50000);
        Product p2 = new Clothing(102, "T-Shirt", 1000);
        Product p3 = new Groceries(103, "Rice", 500);

        // Updating product price using setter
        p1.setPrice(45000);

        // Adding products to a list
        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);

        // Displaying final prices
        displayProducts(products);
    }
}