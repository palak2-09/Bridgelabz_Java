package LinkedList.SinglyLinkedList;

import java.util.ArrayList;
import java.util.Scanner;

class UserNode {
    int userId;
    String name;
    int age;
    ArrayList<Integer> friendIds;
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}

public class SocialMediaFriends {

    UserNode head;

    // Find a user by ID
    UserNode findUser(int userId) {
        UserNode temp = head;

        while (temp != null) {
            if (temp.userId == userId) {
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }

    // 1. Add a new user
    void addUser(int userId, String name, int age) {

        if (userId <= 0 || age < 0) {
            System.out.println("Invalid user ID or age.");
            return;
        }

        if (findUser(userId) != null) {
            System.out.println("User ID already exists.");
            return;
        }

        UserNode newNode = new UserNode(userId, name, age);

        if (head == null) {
            head = newNode;
        } else {
            UserNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        System.out.println("User added successfully.");
    }

    // 2. Add a friend connection
    void addFriend(int userId1, int userId2) {

        if (userId1 == userId2) {
            System.out.println("A user cannot add themselves as a friend.");
            return;
        }

        UserNode user1 = findUser(userId1);
        UserNode user2 = findUser(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users do not exist.");
            return;
        }

        if (user1.friendIds.contains(userId2)) {
            System.out.println("These users are already friends.");
            return;
        }

        // Friendship is mutual
        user1.friendIds.add(userId2);
        user2.friendIds.add(userId1);

        System.out.println("Friend connection added successfully.");
    }

    // 3. Remove a friend connection
    void removeFriend(int userId1, int userId2) {

        UserNode user1 = findUser(userId1);
        UserNode user2 = findUser(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users do not exist.");
            return;
        }

        if (!user1.friendIds.contains(userId2)) {
            System.out.println("These users are not friends.");
            return;
        }

        user1.friendIds.remove(Integer.valueOf(userId2));
        user2.friendIds.remove(Integer.valueOf(userId1));

        System.out.println("Friend connection removed.");
    }

    // 4. Find mutual friends
    void findMutualFriends(int userId1, int userId2) {

        UserNode user1 = findUser(userId1);
        UserNode user2 = findUser(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users do not exist.");
            return;
        }

        boolean found = false;

        System.out.println("Mutual friends:");

        for (int friendId : user1.friendIds) {

            if (user2.friendIds.contains(friendId)) {
                UserNode friend = findUser(friendId);

                if (friend != null) {
                    System.out.println(
                            friend.name + " (ID: " + friend.userId + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No mutual friends.");
        }
    }

    // 5. Display all friends of a user
    void displayFriends(int userId) {

        UserNode user = findUser(userId);

        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        if (user.friendIds.isEmpty()) {
            System.out.println(user.name + " has no friends.");
            return;
        }

        System.out.println("Friends of " + user.name + ":");

        for (int friendId : user.friendIds) {
            UserNode friend = findUser(friendId);

            if (friend != null) {
                System.out.println(
                        "ID: " + friend.userId
                                + ", Name: " + friend.name
                                + ", Age: " + friend.age);
            }
        }
    }

    // 6. Search user by ID
    void searchById(int userId) {

        UserNode user = findUser(userId);

        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        displayUser(user);
    }

    // 7. Search user by name
    void searchByName(String name) {

        UserNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                displayUser(temp);
                found = true;
            }

            temp = temp.next;
        }

        if (!found) {
            System.out.println("User not found.");
        }
    }

    // Display user details
    void displayUser(UserNode user) {

        System.out.println("User ID: " + user.userId);
        System.out.println("Name: " + user.name);
        System.out.println("Age: " + user.age);
        System.out.println("Friend IDs: " + user.friendIds);
        System.out.println("-------------------------");
    }

    // 8. Count friends of each user
    void countFriends() {

        if (head == null) {
            System.out.println("No users available.");
            return;
        }

        UserNode temp = head;

        while (temp != null) {
            System.out.println(
                    temp.name + " (ID: " + temp.userId + ") has "
                            + temp.friendIds.size() + " friend(s).");

            temp = temp.next;
        }
    }

    // Display all users
    void displayAllUsers() {

        if (head == null) {
            System.out.println("No users available.");
            return;
        }

        UserNode temp = head;

        while (temp != null) {
            displayUser(temp);
            temp = temp.next;
        }
    }

    // Main method
    public static void main(String[] args) {

        SocialMediaFriends system = new SocialMediaFriends();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== SOCIAL MEDIA FRIEND SYSTEM =====");
            System.out.println("1. Add User");
            System.out.println("2. Add Friend Connection");
            System.out.println("3. Remove Friend Connection");
            System.out.println("4. Find Mutual Friends");
            System.out.println("5. Display Friends of a User");
            System.out.println("6. Search User by ID");
            System.out.println("7. Search User by Name");
            System.out.println("8. Count Friends of Each User");
            System.out.println("9. Display All Users");
            System.out.println("10. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter User ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    system.addUser(id, name, age);
                    break;

                case 2:
                    System.out.print("Enter first User ID: ");
                    int id1 = sc.nextInt();

                    System.out.print("Enter second User ID: ");
                    int id2 = sc.nextInt();

                    system.addFriend(id1, id2);
                    break;

                case 3:
                    System.out.print("Enter first User ID: ");
                    id1 = sc.nextInt();

                    System.out.print("Enter second User ID: ");
                    id2 = sc.nextInt();

                    system.removeFriend(id1, id2);
                    break;

                case 4:
                    System.out.print("Enter first User ID: ");
                    id1 = sc.nextInt();

                    System.out.print("Enter second User ID: ");
                    id2 = sc.nextInt();

                    system.findMutualFriends(id1, id2);
                    break;

                case 5:
                    System.out.print("Enter User ID: ");
                    system.displayFriends(sc.nextInt());
                    break;

                case 6:
                    System.out.print("Enter User ID: ");
                    system.searchById(sc.nextInt());
                    break;

                case 7:
                    System.out.print("Enter Name: ");
                    system.searchByName(sc.nextLine());
                    break;

                case 8:
                    system.countFriends();
                    break;

                case 9:
                    system.displayAllUsers();
                    break;

                case 10:
                    System.out.println("Exiting system.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 10);

        sc.close();
    }
}