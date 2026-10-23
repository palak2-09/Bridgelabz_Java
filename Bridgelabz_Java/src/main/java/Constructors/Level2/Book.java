/*
roblem 2: Book Library System
Design a Book class with:
ISBN (public).
title (protected).
author (private).
Write methods to:
Set and get the author name.
Create a subclass EBook to access ISBN and title and demonstrate access modifiers.

 */
package Constructors.Level2;

public class Book {

    // Public variable
    public String ISBN;

    // Protected variable
    protected String title;

    // Private variable
    private String author;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Setter to set author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter to get author
    public String getAuthor() {
        return author;
    }
}