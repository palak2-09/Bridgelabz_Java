/*
Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights. Use default, parameterized, and copy constructors to initialize bookings.
 */
package Constructors.Level1;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    public HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        // Using default constructor
        HotelBooking booking1 = new HotelBooking();

        // Using parameterized constructor
        HotelBooking booking2 = new HotelBooking("Rahul", "Deluxe", 3);

        // Using copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);

        System.out.println("Default Booking:");
        booking1.display();

        System.out.println("Parameterized Booking:");
        booking2.display();

        System.out.println("Copied Booking:");
        booking3.display();
    }
}