package LinkedList.DoublyLinkedList;
import java.util.Scanner;

class BookNode {
    String title;
    String author;
    String genre;
    int bookId;
    boolean available;

    BookNode next;
    BookNode prev;

    BookNode(String title, String author, String genre,
             int bookId, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.available = available;
        this.next = null;
        this.prev = null;
    }
}

public class LibraryManagement {

    BookNode head;
    BookNode tail;

    Scanner sc = new Scanner(System.in);

    // 1. Add book at beginning
    void addAtBeginning(String title, String author, String genre,
                        int id, boolean available) {

        BookNode newNode = new BookNode(
                title, author, genre, id, available);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        System.out.println("Book added at beginning.");
    }

    // 2. Add book at end
    void addAtEnd(String title, String author, String genre,
                  int id, boolean available) {

        BookNode newNode = new BookNode(
                title, author, genre, id, available);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        System.out.println("Book added at end.");
    }

    // 3. Add book at a specific position (1-based)
    void addAtPosition(String title, String author, String genre,
                       int id, boolean available, int position) {

        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 1) {
            addAtBeginning(title, author, genre, id, available);
            return;
        }

        BookNode temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position.");
            return;
        }

        if (temp == tail) {
            addAtEnd(title, author, genre, id, available);
            return;
        }

        BookNode newNode = new BookNode(
                title, author, genre, id, available);

        newNode.next = temp.next;
        newNode.prev = temp;

        temp.next.prev = newNode;
        temp.next = newNode;

        System.out.println("Book added at position " + position + ".");
    }

    // 4. Remove book using Book ID
    void removeBook(int id) {

        BookNode temp = head;

        while (temp != null && temp.bookId != id) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found.");
            return;
        }

        // Update previous node or head
        if (temp.prev == null) {
            head = temp.next;
        } else {
            temp.prev.next = temp.next;
        }

        // Update next node or tail
        if (temp.next == null) {
            tail = temp.prev;
        } else {
            temp.next.prev = temp.prev;
        }

        System.out.println("Book removed successfully.");
    }

    // 5. Search book by title
    void searchByTitle(String title) {

        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displayBook(temp);
                found = true;
            }

            temp = temp.next;
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    // 6. Search book by author
    void searchByAuthor(String author) {

        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                found = true;
            }

            temp = temp.next;
        }

        if (!found) {
            System.out.println("No books found for this author.");
        }
    }

    // 7. Update availability status
    void updateAvailability(int id, boolean status) {

        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                temp.available = status;
                System.out.println("Availability updated.");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Book not found.");
    }

    // 8. Display one book
    void displayBook(BookNode book) {

        System.out.println("Book ID: " + book.bookId);
        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Genre: " + book.genre);
        System.out.println("Availability: "
                + (book.available ? "Available" : "Not Available"));
        System.out.println("----------------------------");
    }

    // 9. Display books in forward order
    void displayForward() {

        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        BookNode temp = head;

        System.out.println("\n--- Books in Forward Order ---");

        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    // 10. Display books in reverse order
    void displayReverse() {

        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }

        BookNode temp = tail;

        System.out.println("\n--- Books in Reverse Order ---");

        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // 11. Count total books
    void countBooks() {

        int count = 0;
        BookNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total number of books: " + count);
    }

    // Check whether a Book ID already exists
    boolean isIdPresent(int id) {

        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    // Main method
    public static void main(String[] args) {

        LibraryManagement library = new LibraryManagement();
        Scanner sc = library.sc;

        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT =====");
            System.out.println("1. Add book at beginning");
            System.out.println("2. Add book at end");
            System.out.println("3. Add book at position");
            System.out.println("4. Remove book by ID");
            System.out.println("5. Search book by title");
            System.out.println("6. Search book by author");
            System.out.println("7. Update availability");
            System.out.println("8. Display forward");
            System.out.println("9. Display reverse");
            System.out.println("10. Count books");
            System.out.println("11. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                case 2:
                case 3: {
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    if (id <= 0) {
                        System.out.println("Book ID must be positive.");
                        break;
                    }

                    if (library.isIdPresent(id)) {
                        System.out.println("Book ID already exists.");
                        break;
                    }

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Is the book available? (true/false): ");
                    boolean available = sc.nextBoolean();
                    sc.nextLine();

                    if (choice == 1) {
                        library.addAtBeginning(
                                title, author, genre, id, available);
                    } else if (choice == 2) {
                        library.addAtEnd(
                                title, author, genre, id, available);
                    } else {
                        System.out.print("Enter position: ");
                        int position = sc.nextInt();
                        sc.nextLine();

                        library.addAtPosition(
                                title, author, genre, id,
                                available, position);
                    }

                    break;
                }

                case 4:
                    System.out.print("Enter Book ID to remove: ");
                    library.removeBook(sc.nextInt());
                    sc.nextLine();
                    break;

                case 5:
                    System.out.print("Enter Book Title: ");
                    library.searchByTitle(sc.nextLine());
                    break;

                case 6:
                    System.out.print("Enter Author Name: ");
                    library.searchByAuthor(sc.nextLine());
                    break;

                case 7:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();

                    System.out.print(
                            "Enter availability (true/false): ");
                    boolean status = sc.nextBoolean();
                    sc.nextLine();

                    library.updateAvailability(id, status);
                    break;

                case 8:
                    library.displayForward();
                    break;

                case 9:
                    library.displayReverse();
                    break;

                case 10:
                    library.countBooks();
                    break;

                case 11:
                    System.out.println("Exiting Library Management.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 11);

        sc.close();
    }
}