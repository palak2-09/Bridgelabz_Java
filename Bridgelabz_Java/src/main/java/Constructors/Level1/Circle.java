/*
Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.
 */

package Constructors.Level1;

public class Circle {
    double radius;

    // Default constructor
    public Circle() {
        this(1.0);
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to display radius
    public void display() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.0);

        circle1.display();
        circle2.display();
    }
}