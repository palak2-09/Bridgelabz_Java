package LinkedList.CircularLinkedList;
import java.util.Scanner;

class ProcessNode {
    int processId;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime;
    int turnAroundTime;

    ProcessNode next;

    ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.waitingTime = 0;
        this.turnAroundTime = 0;
        this.next = null;
    }
}

public class RoundRobinScheduling {

    ProcessNode head;
    ProcessNode tail;

    // 1. Add process at the end
    void addProcess(int id, int burstTime, int priority) {

        if (id <= 0 || burstTime <= 0) {
            System.out.println("Process ID and burst time must be positive.");
            return;
        }

        if (findProcess(id) != null) {
            System.out.println("Process ID already exists.");
            return;
        }

        ProcessNode newNode = new ProcessNode(id, burstTime, priority);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }

        System.out.println("Process added successfully.");
    }

    // Find process by ID
    ProcessNode findProcess(int id) {

        if (head == null) {
            return null;
        }

        ProcessNode temp = head;

        do {
            if (temp.processId == id) {
                return temp;
            }

            temp = temp.next;

        } while (temp != head);

        return null;
    }

    // 2. Remove process by ID
    void removeProcess(int id) {

        if (head == null) {
            System.out.println("Process list is empty.");
            return;
        }

        ProcessNode current = head;
        ProcessNode previous = tail;

        do {
            if (current.processId == id) {

                // Only one process exists
                if (head == tail) {
                    head = tail = null;
                } else {
                    previous.next = current.next;

                    if (current == head) {
                        head = current.next;
                    }

                    if (current == tail) {
                        tail = previous;
                    }

                    tail.next = head;
                }

                System.out.println("Process removed.");
                return;
            }

            previous = current;
            current = current.next;

        } while (current != head);

        System.out.println("Process not found.");
    }

    // 3. Display circular process list
    void displayProcesses() {

        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        ProcessNode temp = head;

        System.out.println("\n--- Current Process Queue ---");

        do {
            System.out.println(
                    "Process ID: " + temp.processId
                            + ", Burst Time: " + temp.burstTime
                            + ", Remaining Time: " + temp.remainingTime
                            + ", Priority: " + temp.priority
            );

            temp = temp.next;

        } while (temp != head);
    }

    // 4. Simulate Round Robin scheduling
    void executeRoundRobin(int quantum) {

        if (quantum <= 0) {
            System.out.println("Time quantum must be positive.");
            return;
        }

        if (head == null) {
            System.out.println("No processes to execute.");
            return;
        }

        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;
        int completedProcesses = 0;
        int totalProcesses = countProcesses();

        int currentTime = 0;

        ProcessNode current = head;

        System.out.println("\n--- Round Robin Execution ---");

        while (head != null) {

            ProcessNode nextProcess = current.next;

            int executionTime = Math.min(
                    quantum, current.remainingTime);

            current.remainingTime -= executionTime;
            currentTime += executionTime;

            System.out.println(
                    "Process P" + current.processId
                            + " executes for " + executionTime
                            + " units. Remaining time: "
                            + current.remainingTime
            );

            // Process has completed
            if (current.remainingTime == 0) {

                current.turnAroundTime = currentTime;
                current.waitingTime =
                        current.turnAroundTime - current.burstTime;

                totalWaitingTime += current.waitingTime;
                totalTurnAroundTime += current.turnAroundTime;
                completedProcesses++;

                System.out.println(
                        "Process P" + current.processId
                                + " completed. Waiting Time: "
                                + current.waitingTime
                                + ", Turnaround Time: "
                                + current.turnAroundTime
                );

                removeProcess(current.processId);

                if (head == null) {
                    break;
                }

                // If the next process was removed, start from head.
                if (nextProcess == current) {
                    current = head;
                } else if (nextProcess == head
                        || findProcess(nextProcess.processId) != null) {
                    current = nextProcess;
                } else {
                    current = head;
                }

            } else {
                // Continue with the next process in the circle
                current = current.next;
            }

            System.out.println("\nQueue after this turn:");
            displayProcesses();
        }

        if (completedProcesses > 0) {
            System.out.println("\n--- Scheduling Results ---");

            System.out.println(
                    "Average Waiting Time: "
                            + (double) totalWaitingTime / completedProcesses);

            System.out.println(
                    "Average Turnaround Time: "
                            + (double) totalTurnAroundTime / completedProcesses);
        }
    }

    // Count processes in the circular list
    int countProcesses() {

        if (head == null) {
            return 0;
        }

        int count = 0;
        ProcessNode temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    // Main method
    public static void main(String[] args) {

        RoundRobinScheduling scheduler =
                new RoundRobinScheduling();

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== ROUND ROBIN SCHEDULER =====");
            System.out.println("1. Add Process");
            System.out.println("2. Remove Process by ID");
            System.out.println("3. Display Process Queue");
            System.out.println("4. Execute Round Robin");
            System.out.println("5. Count Processes");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Process ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Burst Time: ");
                    int burstTime = sc.nextInt();

                    System.out.print("Enter Priority: ");
                    int priority = sc.nextInt();

                    scheduler.addProcess(id, burstTime, priority);
                    break;

                case 2:
                    System.out.print("Enter Process ID to remove: ");
                    scheduler.removeProcess(sc.nextInt());
                    break;

                case 3:
                    scheduler.displayProcesses();
                    break;

                case 4:
                    System.out.print("Enter Time Quantum: ");
                    int quantum = sc.nextInt();

                    scheduler.executeRoundRobin(quantum);
                    break;

                case 5:
                    System.out.println(
                            "Total Processes: "
                                    + scheduler.countProcesses());
                    break;

                case 6:
                    System.out.println("Exiting scheduler.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}