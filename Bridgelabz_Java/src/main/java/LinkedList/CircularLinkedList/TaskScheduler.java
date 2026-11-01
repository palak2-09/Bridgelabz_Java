package LinkedList.CircularLinkedList;

import java.util.Scanner;

class TaskNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;

    TaskNode next;

    TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

public class TaskScheduler {

    TaskNode head = null;
    TaskNode tail = null;
    TaskNode current = null;

    // 1. Add task at the beginning
    void insertAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }

        if (current == null) {
            current = head;
        }

        System.out.println("Task added at the beginning.");
    }

    // 2. Add task at the end
    void insertAtEnd(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }

        if (current == null) {
            current = head;
        }

        System.out.println("Task added at the end.");
    }

    // 3. Add task at a specific position (1-based)
    void insertAtPosition(int taskId, String taskName, int priority,
                          String dueDate, int position) {

        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 1) {
            insertAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }

        if (head == null) {
            System.out.println("Invalid position.");
            return;
        }

        TaskNode temp = head;

        for (int i = 1; i < position - 1 && temp != tail; i++) {
            temp = temp.next;
        }

        if (position > 1 && temp == tail && position != 2) {
            System.out.println("Invalid position.");
            return;
        }

        if (temp == tail) {
            insertAtEnd(taskId, taskName, priority, dueDate);
            return;
        }

        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);

        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("Task added at position " + position + ".");
    }

    // 4. Remove task by Task ID
    void removeTask(int taskId) {

        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode temp = head;
        TaskNode previous = tail;

        do {
            if (temp.taskId == taskId) {

                // Only one node
                if (head == tail) {
                    head = tail = current = null;
                } else {
                    // If deleting the head
                    if (temp == head) {
                        head = head.next;
                        tail.next = head;
                    } else {
                        previous.next = temp.next;

                        if (temp == tail) {
                            tail = previous;
                            tail.next = head;
                        }
                    }

                    // Update current if the current task is deleted
                    if (current == temp) {
                        current = temp.next;
                    }
                }

                System.out.println("Task removed successfully.");
                return;
            }

            previous = temp;
            temp = temp.next;

        } while (temp != head);

        System.out.println("Task not found.");
    }

    // 5. View current task
    void viewCurrentTask() {
        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("\n--- Current Task ---");
        displayTask(current);
    }

    // 6. Move to the next task
    void moveToNextTask() {
        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }

        current = current.next;

        System.out.println("Moved to the next task.");
        viewCurrentTask();
    }

    // 7. Display all tasks
    void displayTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode temp = head;

        System.out.println("\n--- All Tasks ---");

        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // 8. Search task by priority
    void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }

            temp = temp.next;

        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with this priority.");
        }
    }

    // Helper method to display one task
    void displayTask(TaskNode task) {
        System.out.println("Task ID: " + task.taskId);
        System.out.println("Task Name: " + task.taskName);
        System.out.println("Priority: " + task.priority);
        System.out.println("Due Date: " + task.dueDate);
        System.out.println("-------------------------");
    }

    // Main method
    public static void main(String[] args) {

        TaskScheduler list = new TaskScheduler();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== Task Scheduler =====");
            System.out.println("1. Add task at beginning");
            System.out.println("2. Add task at end");
            System.out.println("3. Add task at specific position");
            System.out.println("4. Remove task by ID");
            System.out.println("5. View current task");
            System.out.println("6. Move to next task");
            System.out.println("7. Display all tasks");
            System.out.println("8. Search task by priority");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                case 2:
                case 3: {
                    System.out.print("Enter task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter task name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter priority: ");
                    int priority = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter due date (DD-MM-YYYY): ");
                    String dueDate = sc.nextLine();

                    if (choice == 1) {
                        list.insertAtBeginning(id, name, priority, dueDate);
                    } else if (choice == 2) {
                        list.insertAtEnd(id, name, priority, dueDate);
                    } else {
                        System.out.print("Enter position: ");
                        int position = sc.nextInt();

                        list.insertAtPosition(id, name, priority, dueDate, position);
                    }

                    break;
                }

                case 4: {
                    System.out.print("Enter task ID to remove: ");
                    int id = sc.nextInt();

                    list.removeTask(id);
                    break;
                }

                case 5:
                    list.viewCurrentTask();
                    break;

                case 6:
                    list.moveToNextTask();
                    break;

                case 7:
                    list.displayTasks();
                    break;

                case 8: {
                    System.out.print("Enter priority to search: ");
                    int priority = sc.nextInt();

                    list.searchByPriority(priority);
                    break;
                }

                case 9:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 9);

        sc.close();
    }
}