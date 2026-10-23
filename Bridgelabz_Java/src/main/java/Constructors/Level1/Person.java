/*
Create a Person class with a copy constructor that clones another person's attributes.
 */
package Constructors.Level1;

public class Person {
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating the original object
        Person person1 = new Person("Rahul", 22);

        // Creating a copy of person1
        Person person2 = new Person(person1);

        System.out.println("Original Person:");
        person1.display();

        System.out.println("\nCopied Person:");
        person2.display();
    }
}