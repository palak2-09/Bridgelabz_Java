/*
. Online Food Delivery System
Description: Create an online food delivery system:
Define an abstract class FoodItem with fields like itemName, price, and quantity.
Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
Demonstrate encapsulation to restrict modifications to order details and use polymorphism to handle different types of food items in a single order-processing method.

 */
package EncAbsPoly;

import java.util.ArrayList;
import java.util.List;

// Interface
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

// Abstract class
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        setPrice(price);
        setQuantity(quantity);
    }

    // Getters and setters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setItemName(String itemName) {
        if (itemName != null && !itemName.isEmpty()) {
            this.itemName = itemName;
        }
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotalPrice());
    }
}

// Vegetarian item
class VegItem extends FoodItem implements Discountable {

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Vegetarian items have a 10% discount.";
    }
}

// Non-vegetarian item
class NonVegItem extends FoodItem implements Discountable {

    private static final double EXTRA_CHARGE = 50.0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + EXTRA_CHARGE) * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Non-vegetarian items have a 5% discount.";
    }
}

// Main class
public class OnlineFoodDeliverySystem {

    // Polymorphism: process different food items
    public static void processOrder(List<FoodItem> items) {

        double grandTotal = 0;

        for (FoodItem item : items) {

            item.getItemDetails();

            double discount = 0;

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;

                discount = discountable.applyDiscount();

                System.out.println("Discount: " + discount);
                System.out.println(
                        discountable.getDiscountDetails());
            }

            double finalPrice =
                    item.calculateTotalPrice() - discount;

            System.out.println("Final Price: " + finalPrice);
            System.out.println("-------------------------");

            grandTotal += finalPrice;
        }

        System.out.println("Grand Total: " + grandTotal);
    }

    public static void main(String[] args) {

        // Creating food items
        FoodItem item1 = new VegItem("Paneer Pizza", 200, 2);
        FoodItem item2 = new NonVegItem("Chicken Burger", 150, 2);

        // Creating an order
        List<FoodItem> order = new ArrayList<>();

        order.add(item1);
        order.add(item2);

        // Processing the order
        processOrder(order);
    }
}