/*
Problem 3: Vehicle Registration
Create a Vehicle class to manage the details of vehicles:
Instance Variables: ownerName, vehicleType.
Class Variable: registrationFee (fixed for all vehicles).
Methods:
An instance method displayVehicleDetails() to display owner and vehicle details.
A class method updateRegistrationFee() to change the registration fee.
 */
package Constructors.Level2;

public class Vehicle {

    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable
    static double registrationFee = 1500.0;

    // Parameterized constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: Rs. " + registrationFee);
        System.out.println("----------------------");
    }

    // Class method
    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {

        // Creating vehicle objects
        Vehicle vehicle1 = new Vehicle("Rahul", "Car");
        Vehicle vehicle2 = new Vehicle("Priya", "Bike");

        System.out.println("Before Updating Registration Fee:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        // Updating registration fee
        Vehicle.updateRegistrationFee(2000.0);

        System.out.println("After Updating Registration Fee:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
