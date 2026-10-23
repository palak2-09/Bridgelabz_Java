/*
Program to Model a Movie Ticket Booking System

This program allows the user to book a movie ticket
and display the ticket details.
*/

package ObjectOrientedFundamental.Level2;

import java.util.Scanner;

public class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    // Method to book a ticket
    void bookTicket(String seat, double ticketPrice) {
        seatNumber = seat;
        price = ticketPrice;

        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    void displayDetails() {
        System.out.println("\n--- Movie Ticket Details ---");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an object of MovieTicket
        MovieTicket obj = new MovieTicket();

        // Take movie name as input
        System.out.print("Enter movie name: ");
        obj.movieName = sc.nextLine();

        // Take seat number and ticket price
        System.out.print("Enter seat number: ");
        String seat = sc.nextLine();

        System.out.print("Enter ticket price: ");
        double ticketPrice = sc.nextDouble();

        // Book the ticket
        obj.bookTicket(seat, ticketPrice);

        // Display ticket details
        obj.displayDetails();

        sc.close();
    }
}