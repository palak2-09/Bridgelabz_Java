/*
Animal Hierarchy
Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses. Each subclass has a unique behavior.
Tasks:
Define a superclass Animal with attributes name and age, and a method makeSound().
Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes
 */

package Inheritance;

// Superclass
class Animal {
    String name;
    int age;

    // Parameterized constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog subclass
class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

// Cat subclass
class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow Meow!");
    }
}

// Bird subclass
class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp Chirp!");
    }
}

// Main class
public class AnimalHierarchy {

    public static void main(String[] args) {

        Dog dog = new Dog("Bruno", 3);
        Cat cat = new Cat("Kitty", 2);
        Bird bird = new Bird("Tweety", 1);

        // Display animal sounds
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();

        // Demonstrate runtime polymorphism
        System.out.println("\nDemonstrating Polymorphism:");

        Animal animal1 = new Dog("Rocky", 4);
        Animal animal2 = new Cat("Luna", 2);
        Animal animal3 = new Bird("Rio", 1);

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
    }
}