/*
. Library Management System
Description: Develop a library management system:
Use an abstract class LibraryItem with fields like itemId, title, and author.
Add an abstract method getLoanDuration() and a concrete method getItemDetails().
Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
Implement an interface Reservable with methods reserveItem() and checkAvailability().
Apply encapsulation to secure details like the borrower’s personal data.
Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.

 */
package EncAbsPoly;

import java.util.ArrayList;
import java.util.List;

// Interface
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Abstract class
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    private boolean available = true;

    // Borrower's personal data is private
    private String borrowerName;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters and setters
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        }
    }

    public void setAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        }
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println("Available: " + available);
    }

    // Reserve an item
    public void reserveItem(String borrowerName) {
        if (available) {
            this.borrowerName = borrowerName;
            available = false;
            System.out.println(title + " reserved successfully.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    // Check availability
    public boolean checkAvailability() {
        return available;
    }
}

// Book class
class Book extends LibraryItem implements Reservable {

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem(String borrowerName) {
        super.reserveItem(borrowerName);
    }

    @Override
    public boolean checkAvailability() {
        return super.checkAvailability();
    }
}

// Magazine class
class Magazine extends LibraryItem implements Reservable {

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem(String borrowerName) {
        super.reserveItem(borrowerName);
    }

    @Override
    public boolean checkAvailability() {
        return super.checkAvailability();
    }
}

// DVD class
class DVD extends LibraryItem implements Reservable {

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }

    @Override
    public void reserveItem(String borrowerName) {
        super.reserveItem(borrowerName);
    }

    @Override
    public boolean checkAvailability() {
        return super.checkAvailability();
    }
}

// Main class
public class LibraryManagementSystem {

    public static void main(String[] args) {

        // Creating library items
        Book book = new Book(101, "Java Programming", "James Gosling");
        Magazine magazine = new Magazine(102, "Tech Today", "John Smith");
        DVD dvd = new DVD(103, "Java Tutorials", "Alex Brown");

        // Polymorphism
        List<LibraryItem> items = new ArrayList<>();

        items.add(book);
        items.add(magazine);
        items.add(dvd);

        // Display details of all items
        System.out.println("=== Library Items ===");

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("-------------------------");
        }

        // Reserving items
        System.out.println("\n=== Reservations ===");

        book.reserveItem("Palak");
        magazine.reserveItem("Rahul");

        // Checking availability
        System.out.println("\n=== Availability ===");

        System.out.println("Book available: "
                + book.checkAvailability());

        System.out.println("Magazine available: "
                + magazine.checkAvailability());

        System.out.println("DVD available: "
                + dvd.checkAvailability());
    }
}