/*
Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. Add constructors to initialize the rental details and calculate total cost.
 */
package Constructors.Level1;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    // Cost per day
    double costPerDay = 2000.0;

    // Default constructor
    public CarRental() {
        customerName = "Unknown";
        carModel = "Not Selected";
        rentalDays = 0;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // Method to display rental details
    public void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: Rs. " + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Using default constructor
        CarRental rental1 = new CarRental();

        // Using parameterized constructor
        CarRental rental2 = new CarRental("Rahul", "Hyundai Creta", 3);

        System.out.println("Default Rental Details:");
        rental1.display();

        System.out.println("\nCustomer Rental Details:");
        rental2.display();
    }
}