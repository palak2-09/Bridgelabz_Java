/*
Single Inheritance
Sample Problem 1: Library Management with Books and Authors
Description: Model a Book system where Book is the superclass, and Author is a subclass.
Tasks:
Define a superclass Book with attributes like title and publicationYear.
Define a subclass Author with additional attributes like name and bio.
Create a method displayInfo() to show details of the book and its author.
Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.

 */
package Inheritance;

// Superclass
class Book {
    String title;
    int publicationYear;

    // Parameterized constructor
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Display book details
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass
class Author extends Book {
    String name;
    String bio;

    // Parameterized constructor
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Display book and author details
    @Override
    public void displayInfo() {
        System.out.println("--- Book and Author Details ---");
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Main class
public class LibraryManagement {
    public static void main(String[] args) {

        Author author = new Author(
                "The Alchemist",
                1988,
                "Paulo Coelho",
                "A Brazilian novelist known for inspirational stories."
        );

        author.displayInfo();
    }
}
