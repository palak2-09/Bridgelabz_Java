package Constructors.Level1;

public class Book {
    String title;
    String author;
    double price;

    //default constructor
    public Book(){
        title="Unknown";
        author="Unknown";
        price=0.0;
    }
    //parameterized constructor
    public Book(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    //method to display the book details
    public void displayDetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
    public static void main(String[] args){
        //object using default constructor
        Book book1=new Book();

        //object using parameterised constructor
        Book book2=new Book("Java Programming","James Gosling",599.0);

        System.out.println("Book 1 Details:");
        book1.displayDetails();

        System.out.println("\nBook 2 Details:");
        book2.displayDetails();

    }
}
