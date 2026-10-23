/*
Library Book System: Create a Book class with attributes title, author, price, and availability. Implement a method to borrow a book
 */
package Constructors.Level1;

public class Book1 {
    String title;
    String author;
    double price;
    boolean availability;

    // Parameterized constructor
    public Book1(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Sorry, the book is not available.");
        }
    }

    // Method to display book details
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + availability);
    }

    public static void main(String[] args) {
        Book1 book1 = new Book1("Java Programming", "James Gosling", 500.0);

        book1.display();

        System.out.println("\nBorrowing the book:");
        book1.borrowBook();

        System.out.println("\nBook details after borrowing:");
        book1.display();

        System.out.println("\nTrying to borrow again:");
        book1.borrowBook();
    }
}