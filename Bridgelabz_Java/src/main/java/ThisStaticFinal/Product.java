/*
Sample Program 4: Shopping Cart System
Create a Product class to manage shopping cart items with the following features:
Static:
A static variable discount shared by all products.
A static method updateDiscount() to modify the discount percentage.
This:
Use this to initialize productName, price, and quantity in the constructor.
Final:
Use a final variable productID to ensure each product has a unique identifier that cannot be changed.
Instanceof:
Validate whether an object is an instance of the Product class before processing its details.

 */
package ThisStaticFinal;

public class Product {

    // Static variable shared by all products
    static double discount = 10.0;

    // Instance variables
    String productName;
    double price;
    int quantity;
    final int productID;

    // Constructor
    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    // Calculate final price after discount
    public double calculateFinalPrice() {
        double totalPrice = price * quantity;
        double discountAmount = totalPrice * discount / 100;
        return totalPrice - discountAmount;
    }

    // Display product details
    public void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productID);
        System.out.println("Price: Rs. " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: Rs. " + calculateFinalPrice());
    }

    public static void main(String[] args) {

        // Creating Product objects
        Product product1 = new Product("Laptop", 50000, 1, 101);
        Product product2 = new Product("Headphones", 2000, 2, 102);

        // Checking instanceof before processing details
        if (product1 instanceof Product) {
            System.out.println("Product 1 Details:");
            product1.displayDetails();
        }

        System.out.println();

        if (product2 instanceof Product) {
            System.out.println("Product 2 Details:");
            product2.displayDetails();
        }

        System.out.println("\nUpdating Discount...");
        Product.updateDiscount(20.0);

        System.out.println("\nProduct 1 After Discount Update:");
        product1.displayDetails();

        System.out.println("\nProduct 2 After Discount Update:");
        product2.displayDetails();
    }
}