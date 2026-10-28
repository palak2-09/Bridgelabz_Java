/*
. Ride-Hailing Application
Description: Develop a ride-hailing application:
Define an abstract class Vehicle with fields like vehicleId, driverName, and ratePerKm.
Add abstract methods calculateFare(double distance) and a concrete method getVehicleDetails().
Create subclasses Car, Bike, and Auto, overriding calculateFare() based on type-specific rates.
Use an interface GPS with methods getCurrentLocation() and updateLocation().
Secure driver and vehicle details using encapsulation.
Demonstrate polymorphism by creating a method to calculate fares for different vehicle types dynamically.
 */
package EncAbsPoly;
import java.util.ArrayList;
import java.util.List;

// Interface
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

// Abstract class
abstract class Vehicle {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(int vehicleId, String driverName, double ratePerKm,
                   String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        setRatePerKm(ratePerKm);
        this.currentLocation = currentLocation;
    }

    // Getters and setters
    public int getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setDriverName(String driverName) {
        if (driverName != null && !driverName.isEmpty()) {
            this.driverName = driverName;
        }
    }

    public void setRatePerKm(double ratePerKm) {
        if (ratePerKm >= 0) {
            this.ratePerKm = ratePerKm;
        }
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate Per Km: Rs. " + ratePerKm);
        System.out.println("Current Location: " + getCurrentLocation());
    }

    // GPS methods
    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String location) {
        if (location != null && !location.isEmpty()) {
            currentLocation = location;
        }
    }
}

// Car class
class Car extends Vehicle implements GPS {

    public Car(int vehicleId, String driverName, String location) {
        super(vehicleId, driverName, 15, location);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return super.getCurrentLocation();
    }

    @Override
    public void updateLocation(String location) {
        super.updateLocation(location);
    }
}

// Bike class
class Bike extends Vehicle implements GPS {

    public Bike(int vehicleId, String driverName, String location) {
        super(vehicleId, driverName, 8, location);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return super.getCurrentLocation();
    }

    @Override
    public void updateLocation(String location) {
        super.updateLocation(location);
    }
}

// Auto class
class Auto extends Vehicle implements GPS {

    public Auto(int vehicleId, String driverName, String location) {
        super(vehicleId, driverName, 10, location);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return super.getCurrentLocation();
    }

    @Override
    public void updateLocation(String location) {
        super.updateLocation(location);
    }
}

// Main class
public class RideHailingApplication {

    // Polymorphism: calculate fares for different vehicles
    public static void calculateFares(List<Vehicle> vehicles,
                                      double distance) {
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();

            System.out.println("Distance: " + distance + " km");
            System.out.println("Total Fare: Rs. "
                    + vehicle.calculateFare(distance));

            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) {

        // Create vehicles
        Vehicle car = new Car(101, "Rahul", "Chennai");
        Vehicle bike = new Bike(102, "Amit", "Tambaram");
        Vehicle auto = new Auto(103, "Vijay", "Kattankulathur");

        // Update GPS location
        car.updateLocation("Guindy");

        // Store vehicles in a list
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        // Calculate fares for a 10 km ride
        calculateFares(vehicles, 10);
    }
}