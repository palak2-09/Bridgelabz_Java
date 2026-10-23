/*
Sample Program 2: Library Management System
Create a Book class to manage library books with the following features:
Static:
A static variable libraryName shared across all books.
A static method displayLibraryName() to print the library name.
This:
Use this to initialize title, author, and isbn in the constructor.
Final:
Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
Instanceof:
Verify if an object is an instance of the Book class before displaying its details.

 */
package ThisStaticFinal;

public class Book {

    // Static variable shared by all books
    static String libraryName = "Central Library";

    // Instance variables
    String title;
    String author;
    final String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Display book details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {

        // Creating Book objects
        Book book1 = new Book("Java Programming", "James Gosling", "ISBN101");
        Book book2 = new Book("Python Basics", "Guido van Rossum", "ISBN102");

        // Calling static method
        Book.displayLibraryName();

        System.out.println();

        // Checking instanceof before displaying details
        if (book1 instanceof Book) {
            System.out.println("Book 1 Details:");
            book1.displayDetails();
        }

        System.out.println();

        if (book2 instanceof Book) {
            System.out.println("Book 2 Details:");
            book2.displayDetails();
        }
    }
}