/*
Problem 1: Library and Books (Aggregation)
Description: Create a Library class that contains multiple Book objects. Model the relationship such that a library can have many books, but a book can exist independently (outside of a specific library).
Tasks:
Define a Library class with an ArrayList of Book objects.
Define a Book class with attributes such as title and author.
Demonstrate the aggregation relationship by creating books and adding them to different libraries.
Goal: Understand aggregation by modeling a real-world relationship where the Library aggregates Book objects.
 */

package ObjectModeling;

/*
    This program demonstrates aggregation between Library and Book classes.
    It shows how a library can have multiple books and how the same book
    can be associated with different libraries.
*/
import java.util.ArrayList;
import java.util.List;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        // Initialize book details
        this.title = title;
        this.author = author;
    }
}

class Library {
    String libraryName;
    List<Book> books;

    Library(String libraryName) {
        // Initialize library name and create an empty book list
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books in the library
    public void displayBooks() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Books in Library:");

        for (Book book : books) {
            System.out.println("Book Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println();
        }
    }
}

public class LibraryAggregation {
    public static void main(String[] args) {

        // Create three Book objects independently
        Book book1 = new Book("Java Programming", "James Gosling");
        Book book2 = new Book("Python Basics", "Guido van Rossum");
        Book book3 = new Book("Clean Code", "Robert C. Martin");

        // Create two Library objects
        Library library1 = new Library("Central Library");
        Library library2 = new Library("College Library");

        // Associate books with the first library
        library1.addBook(book1);
        library1.addBook(book2);

        // Associate books with the second library
        library2.addBook(book2);
        library2.addBook(book3);

        // Display books in each library
        library1.displayBooks();

        System.out.println();

        library2.displayBooks();
    }
}