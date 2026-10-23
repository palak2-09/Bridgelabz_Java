/*
Sample Program 6: Vehicle Registration System
Create a Vehicle class with the following features:
Static:
A static variable registrationFee common for all vehicles.
A static method updateRegistrationFee() to modify the fee.
This:
Use this to initialize ownerName, vehicleType, and registrationNumber in the constructor.
Final:
Use a final variable registrationNumber to uniquely identify each vehicle.
Instanceof:
Check if an object belongs to the Vehicle class before displaying its registration details.

 */
package ThisStaticFinal;

public class Vehicle {

    // Static variable shared by all vehicles
    static double registrationFee = 5000.0;

    // Instance variables
    String ownerName;
    String vehicleType;
    final String registrationNumber;

    // Constructor
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration Fee Updated: Rs. " + registrationFee);
    }

    // Display vehicle registration details
    public void displayDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: Rs. " + registrationFee);
    }

    public static void main(String[] args) {

        // Creating Vehicle objects
        Vehicle vehicle1 = new Vehicle("Rahul", "Car", "UP32AB1234");
        Vehicle vehicle2 = new Vehicle("Priya", "Bike", "UP32CD5678");

        // Checking instanceof before displaying details
        if (vehicle1 instanceof Vehicle) {
            System.out.println("Vehicle 1 Details:");
            vehicle1.displayDetails();
        }

        System.out.println();

        if (vehicle2 instanceof Vehicle) {
            System.out.println("Vehicle 2 Details:");
            vehicle2.displayDetails();
        }

        System.out.println();

        // Updating registration fee
        Vehicle.updateRegistrationFee(7000.0);

        System.out.println("\nVehicle 1 After Fee Update:");

        if (vehicle1 instanceof Vehicle) {
            vehicle1.displayDetails();
        }

        System.out.println("\nVehicle 2 After Fee Update:");

        if (vehicle2 instanceof Vehicle) {
            vehicle2.displayDetails();
        }
    }
}