/*
Sample Problem 2: School System with Different Roles
Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
Tasks:
Define a superclass Person with common attributes like name and age.
Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
Each subclass should have a method like displayRole() that describes the role.
Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics.

 */
package Inheritance;

// Superclass
class Person {
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display common details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void displayRole() {
        System.out.println("Role: Person");
    }
}

// Subclass 1
class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("--- Teacher Details ---");
        displayDetails();
        System.out.println("Subject: " + subject);
        System.out.println("Role: Teacher");
    }
}

// Subclass 2
class Student extends Person {
    String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println("--- Student Details ---");
        displayDetails();
        System.out.println("Grade: " + grade);
        System.out.println("Role: Student");
    }
}

// Subclass 3
class Staff extends Person {
    String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("--- Staff Details ---");
        displayDetails();
        System.out.println("Department: " + department);
        System.out.println("Role: Staff");
    }
}

// Main class
public class SchoolSystem {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Anita", 35, "Mathematics");
        Student student = new Student("Rahul", 16, "10th Grade");
        Staff staff = new Staff("Suresh", 40, "Administration");

        teacher.displayRole();

        System.out.println();

        student.displayRole();

        System.out.println();

        staff.displayRole();
    }
}
