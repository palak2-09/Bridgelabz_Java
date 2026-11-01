package LinkedList.CircularLinkedList;
import java.util.Scanner;

class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;
    TicketNode next;

    TicketNode(int ticketId, String customerName, String movieName,
               int seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

public class Main {
    TicketNode head = null;
    TicketNode tail = null;

    Scanner sc = new Scanner(System.in);

    // 1. Add a ticket at the end
    void addTicket() {
        System.out.print("Enter Ticket ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        int seat = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Booking Time: ");
        String time = sc.nextLine();

        TicketNode newNode =
                new TicketNode(id, name, movie, seat, time);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }

        System.out.println("Ticket booked successfully!");
    }

    // 2. Remove a ticket using Ticket ID
    void removeTicket() {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        System.out.print("Enter Ticket ID to remove: ");
        int id = sc.nextInt();

        TicketNode current = head;
        TicketNode previous = tail;

        do {
            if (current.ticketId == id) {

                // Only one node exists
                if (head == tail) {
                    head = null;
                    tail = null;
                }
                // Removing the first node
                else if (current == head) {
                    head = head.next;
                    tail.next = head;
                }
                // Removing the last node
                else if (current == tail) {
                    previous.next = head;
                    tail = previous;
                }
                // Removing a middle node
                else {
                    previous.next = current.next;
                }

                System.out.println("Ticket removed successfully!");
                return;
            }

            previous = current;
            current = current.next;

        } while (current != head);

        System.out.println("Ticket ID not found.");
    }

    // 3. Display all tickets
    void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode current = head;

        System.out.println("\n----- Booked Tickets -----");

        do {
            System.out.println("Ticket ID: " + current.ticketId);
            System.out.println("Customer Name: " + current.customerName);
            System.out.println("Movie Name: " + current.movieName);
            System.out.println("Seat Number: " + current.seatNumber);
            System.out.println("Booking Time: " + current.bookingTime);
            System.out.println("--------------------------");

            current = current.next;

        } while (current != head);
    }

    // 4. Search by Customer Name or Movie Name
    void searchTicket() {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        sc.nextLine();

        System.out.println("1. Search by Customer Name");
        System.out.println("2. Search by Movie Name");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name to search: ");
        String search = sc.nextLine();

        TicketNode current = head;
        boolean found = false;

        do {
            if ((choice == 1 &&
                    current.customerName.equalsIgnoreCase(search))
                    ||
                    (choice == 2 &&
                            current.movieName.equalsIgnoreCase(search))) {

                System.out.println("\nTicket Found!");
                System.out.println("Ticket ID: " + current.ticketId);
                System.out.println("Customer Name: " + current.customerName);
                System.out.println("Movie Name: " + current.movieName);
                System.out.println("Seat Number: " + current.seatNumber);
                System.out.println("Booking Time: " + current.bookingTime);

                found = true;
            }

            current = current.next;

        } while (current != head);

        if (!found) {
            System.out.println("No matching ticket found.");
        }
    }

    // 5. Count total booked tickets
    void countTickets() {
        if (head == null) {
            System.out.println("Total booked tickets: 0");
            return;
        }

        int count = 0;
        TicketNode current = head;

        do {
            count++;
            current = current.next;
        } while (current != head);

        System.out.println("Total booked tickets: " + count);
    }

    public static void main(String[] args) {
        Main system = new Main();

        while (true) {
            System.out.println("\n===== ONLINE TICKET RESERVATION =====");
            System.out.println("1. Add Ticket");
            System.out.println("2. Remove Ticket");
            System.out.println("3. Display Tickets");
            System.out.println("4. Search Ticket");
            System.out.println("5. Count Tickets");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = system.sc.nextInt();

            switch (choice) {
                case 1:
                    system.addTicket();
                    break;

                case 2:
                    system.removeTicket();
                    break;

                case 3:
                    system.displayTickets();
                    break;

                case 4:
                    system.searchTicket();
                    break;

                case 5:
                    system.countTickets();
                    break;

                case 6:
                    System.out.println("Exiting system...");
                    system.sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}