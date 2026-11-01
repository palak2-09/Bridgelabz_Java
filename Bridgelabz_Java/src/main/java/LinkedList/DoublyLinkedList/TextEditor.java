package LinkedList.DoublyLinkedList;
import java.util.Scanner;

class TextNode {
    String text;
    TextNode next;
    TextNode prev;

    TextNode(String text) {
        this.text = text;
        this.next = null;
        this.prev = null;
    }
}

public class TextEditor {

    TextNode head;
    TextNode tail;
    TextNode current;

    int historySize = 0;
    final int MAX_HISTORY = 10;

    // 1. Add a new text state
    void addState(String text) {

        TextNode newNode = new TextNode(text);

        // If we undo and then type something new,
        // remove the old redo history.
        if (current != null && current.next != null) {
            TextNode temp = current.next;

            while (temp != null) {
                historySize--;
                temp = temp.next;
            }

            current.next = null;
            tail = current;
        }

        // First state
        if (head == null) {
            head = tail = current = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;

            tail = newNode;
            current = newNode;
        }

        historySize++;

        // Limit history to 10 states
        while (historySize > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            historySize--;
        }

        System.out.println("Text state saved.");
    }

    // 2. Undo
    void undo() {

        if (current == null || current.prev == null) {
            System.out.println("Nothing to undo.");
            return;
        }

        current = current.prev;

        System.out.println("Undo successful.");
        displayCurrentState();
    }

    // 3. Redo
    void redo() {

        if (current == null || current.next == null) {
            System.out.println("Nothing to redo.");
            return;
        }

        current = current.next;

        System.out.println("Redo successful.");
        displayCurrentState();
    }

    // 4. Display current text
    void displayCurrentState() {

        if (current == null) {
            System.out.println("Text is empty.");
            return;
        }

        System.out.println("Current Text: " + current.text);
    }

    // Display complete history
    void displayHistory() {

        if (head == null) {
            System.out.println("No history available.");
            return;
        }

        TextNode temp = head;

        System.out.println("\n--- Text History ---");

        while (temp != null) {

            if (temp == current) {
                System.out.println("-> " + temp.text + " [CURRENT]");
            } else {
                System.out.println("   " + temp.text);
            }

            temp = temp.next;
        }
    }

    // Main method
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== TEXT EDITOR =====");
            System.out.println("1. Type text / Save new state");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Display current text");
            System.out.println("5. Display history");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter text: ");
                    String text = sc.nextLine();
                    editor.addState(text);
                    break;

                case 2:
                    editor.undo();
                    break;

                case 3:
                    editor.redo();
                    break;

                case 4:
                    editor.displayCurrentState();
                    break;

                case 5:
                    editor.displayHistory();
                    break;

                case 6:
                    System.out.println("Exiting text editor.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}