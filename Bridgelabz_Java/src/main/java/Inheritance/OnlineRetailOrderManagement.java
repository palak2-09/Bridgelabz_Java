/*
Multilevel Inheritance
Sample Problem 1: Online Retail Order Management
Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
Tasks:
Define a base class Order with common attributes like orderId and orderDate.
Create a subclass ShippedOrder with additional attributes like trackingNumber.
Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
Implement a method getOrderStatus() to return the current order status based on the class level.
Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes.

 */
package Inheritance;

// Base class
class Order {
    String orderId;
    String orderDate;

    // Parameterized constructor
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Get order status
    public String getOrderStatus() {
        return "Order Placed";
    }

    // Display order details
    public void displayInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Order Status: " + getOrderStatus());
    }
}

// Subclass of Order
class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Shipped";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

// Subclass of ShippedOrder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate,
                          String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Delivered";
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Delivered Order Details ---");
        super.displayInfo();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

// Main class
public class OnlineRetailOrderManagement {
    public static void main(String[] args) {

        Order order = new Order("ORD101", "20-10-2026");
        ShippedOrder shippedOrder =
                new ShippedOrder("ORD102", "21-10-2026", "TRK12345");
        DeliveredOrder deliveredOrder =
                new DeliveredOrder("ORD103", "22-10-2026",
                        "TRK67890", "24-10-2026");

        System.out.println("--- Order Details ---");
        order.displayInfo();

        System.out.println("\n--- Shipped Order Details ---");
        shippedOrder.displayInfo();

        System.out.println();
        deliveredOrder.displayInfo();
    }
}