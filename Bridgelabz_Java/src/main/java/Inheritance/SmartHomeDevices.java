/*
Sample Problem 2: Smart Home Devices
Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
Tasks:
Define a superclass Device with attributes like deviceId and status.
Create a subclass Thermostat with additional attributes like temperatureSetting.
Implement a method displayStatus() to show each device's current settings.
Goal: Understand single inheritance by adding specific attributes to a subclass, keeping the superclass general.

 */
package Inheritance;

// Superclass
class Device {
    String deviceId;
    String status;

    // Parameterized constructor
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Display device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass
class Thermostat extends Device {
    double temperatureSetting;

    // Parameterized constructor
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Display thermostat details
    @Override
    public void displayStatus() {
        System.out.println("--- Smart Thermostat Details ---");
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + " °C");
    }
}

// Main class
public class SmartHomeDevices {
    public static void main(String[] args) {

        Thermostat thermostat = new Thermostat("TH101", "ON", 24.5);

        thermostat.displayStatus();
    }
}