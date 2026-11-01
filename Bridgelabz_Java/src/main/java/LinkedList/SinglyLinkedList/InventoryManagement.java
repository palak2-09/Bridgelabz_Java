package LinkedList.SinglyLinkedList;
import java.util.Scanner;
class ItemNode {
    String itemName;
    int itemId;
    int quantity;
    double price;
    ItemNode next;

    ItemNode(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
public class InventoryManagement {
    ItemNode head;
    Scanner sc = new Scanner(System.in);
    // 1. Add item at the beginning
    void addAtBeginning(String name, int id, int quantity, double price) {
        ItemNode newNode = new ItemNode(name, id, quantity, price);

        newNode.next = head;
        head = newNode;

        System.out.println("Item added at beginning.");
    }
    // 2. Add item at the end
    void addAtEnd(String name, int id, int quantity, double price) {
        ItemNode newNode = new ItemNode(name, id, quantity, price);

        if (head == null) {
            head = newNode;
            System.out.println("Item added at end.");
            return;
        }

        ItemNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        System.out.println("Item added at end.");
    }
    // 3. Add item at a specific position (1-based)
    void addAtPosition(String name, int id, int quantity,
                       double price, int position) {

        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 1) {
            addAtBeginning(name, id, quantity, price);
            return;
        }

        ItemNode temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position.");
            return;
        }

        ItemNode newNode = new ItemNode(name, id, quantity, price);

        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("Item added at position " + position + ".");
    }
    // 4. Remove item using Item ID
    void removeItem(int id) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed.");
            return;
        }

        ItemNode temp = head;

        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found.");
            return;
        }

        temp.next = temp.next.next;

        System.out.println("Item removed.");
    }
    // 5. Update quantity using Item ID
    void updateQuantity(int id, int newQuantity) {
        if (newQuantity < 0) {
            System.out.println("Quantity cannot be negative.");
            return;
        }

        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQuantity;
                System.out.println("Quantity updated.");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Item not found.");
    }

    // 6. Search item using Item ID
    void searchById(int id) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }

            temp = temp.next;
        }

        System.out.println("Item not found.");
    }

    // 7. Search item using Item Name
    void searchByName(String name) {
        ItemNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                found = true;
            }

            temp = temp.next;
        }

        if (!found) {
            System.out.println("Item not found.");
        }
    }

    // 8. Display one item
    void displayItem(ItemNode item) {
        System.out.println("Item ID: " + item.itemId);
        System.out.println("Item Name: " + item.itemName);
        System.out.println("Quantity: " + item.quantity);
        System.out.println("Price: " + item.price);
        System.out.println("Item Value: " + (item.quantity * item.price));
        System.out.println("-------------------------");
    }

    // 9. Display all items
    void displayInventory() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        ItemNode temp = head;

        System.out.println("\n----- INVENTORY -----");

        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    // 10. Calculate total inventory value
    void calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value: " + total);
    }

    // 11. Sort by item name or price, ascending or descending
    void sortInventory(int choice, boolean ascending) {
        if (head == null || head.next == null) {
            System.out.println("Inventory has fewer than two items.");
            return;
        }

        // Bubble sort by swapping item data
        for (ItemNode i = head; i != null; i = i.next) {
            for (ItemNode j = head; j.next != null; j = j.next) {

                int comparison;

                if (choice == 1) {
                    comparison = j.itemName.compareToIgnoreCase(
                            j.next.itemName);
                } else {
                    comparison = Double.compare(j.price, j.next.price);
                }

                boolean shouldSwap;

                if (ascending) {
                    shouldSwap = comparison > 0;
                } else {
                    shouldSwap = comparison < 0;
                }

                if (shouldSwap) {
                    // Swap item data, not the nodes
                    String tempName = j.itemName;
                    j.itemName = j.next.itemName;
                    j.next.itemName = tempName;

                    int tempId = j.itemId;
                    j.itemId = j.next.itemId;
                    j.next.itemId = tempId;

                    int tempQuantity = j.quantity;
                    j.quantity = j.next.quantity;
                    j.next.quantity = tempQuantity;

                    double tempPrice = j.price;
                    j.price = j.next.price;
                    j.next.price = tempPrice;
                }
            }
        }

        System.out.println("Inventory sorted successfully.");
        displayInventory();
    }

    // Main method
    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();
        Scanner sc = inventory.sc;

        int choice;

        do {
            System.out.println("\n===== INVENTORY MANAGEMENT =====");
            System.out.println("1. Add item at beginning");
            System.out.println("2. Add item at end");
            System.out.println("3. Add item at position");
            System.out.println("4. Remove item by ID");
            System.out.println("5. Update quantity");
            System.out.println("6. Search item by ID");
            System.out.println("7. Search item by name");
            System.out.println("8. Display inventory");
            System.out.println("9. Calculate total inventory value");
            System.out.println("10. Sort inventory");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                case 2:
                case 3: {
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter item ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();

                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();

                    if (id <= 0 || quantity < 0 || price < 0) {
                        System.out.println(
                                "ID must be positive; quantity and price cannot be negative.");
                        sc.nextLine();
                        break;
                    }

                    // Prevent duplicate item IDs
                    ItemNode check = inventory.head;
                    boolean duplicate = false;

                    while (check != null) {
                        if (check.itemId == id) {
                            duplicate = true;
                            break;
                        }
                        check = check.next;
                    }

                    if (duplicate) {
                        System.out.println("Item ID already exists.");
                    } else if (choice == 1) {
                        inventory.addAtBeginning(name, id, quantity, price);
                    } else if (choice == 2) {
                        inventory.addAtEnd(name, id, quantity, price);
                    } else {
                        System.out.print("Enter position: ");
                        int position = sc.nextInt();

                        inventory.addAtPosition(
                                name, id, quantity, price, position);
                    }

                    sc.nextLine();
                    break;
                }

                case 4:
                    System.out.print("Enter item ID to remove: ");
                    inventory.removeItem(sc.nextInt());
                    sc.nextLine();
                    break;

                case 5:
                    System.out.print("Enter item ID: ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter new quantity: ");
                    int newQuantity = sc.nextInt();

                    inventory.updateQuantity(updateId, newQuantity);
                    sc.nextLine();
                    break;

                case 6:
                    System.out.print("Enter item ID to search: ");
                    inventory.searchById(sc.nextInt());
                    sc.nextLine();
                    break;

                case 7:
                    System.out.print("Enter item name to search: ");
                    inventory.searchByName(sc.nextLine());
                    break;

                case 8:
                    inventory.displayInventory();
                    break;

                case 9:
                    inventory.calculateTotalValue();
                    break;

                case 10:
                    System.out.println("Sort by:");
                    System.out.println("1. Item Name");
                    System.out.println("2. Price");
                    System.out.print("Enter choice: ");
                    int sortChoice = sc.nextInt();

                    if (sortChoice != 1 && sortChoice != 2) {
                        System.out.println("Invalid sort choice.");
                        sc.nextLine();
                        break;
                    }

                    System.out.println("Order:");
                    System.out.println("1. Ascending");
                    System.out.println("2. Descending");
                    System.out.print("Enter choice: ");
                    int order = sc.nextInt();

                    if (order != 1 && order != 2) {
                        System.out.println("Invalid order choice.");
                        sc.nextLine();
                        break;
                    }

                    inventory.sortInventory(sortChoice, order == 1);
                    sc.nextLine();
                    break;

                case 11:
                    System.out.println("Exiting Inventory Management.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 11);

        sc.close();
    }



}
