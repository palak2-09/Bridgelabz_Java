/*
Sample Program 5: University Student Management
Create a Student class to manage student data with the following features:
Static:
A static variable universityName shared across all students.
A static method displayTotalStudents() to show the number of students enrolled.
This:
Use this in the constructor to initialize name, rollNumber, and grade.
Final:
Use a final variable rollNumber for each student that cannot be changed.
Instanceof:
Check if a given object is an instance of the Student class before performing operations like displaying or updating grades.

 */
package ThisStaticFinal;

public class Student {

    // Static variables
    static String universityName = "SRM University";
    static int totalStudents = 0;

    // Instance variables
    String name;
    final int rollNumber;
    char grade;

    // Constructor
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;

        totalStudents++;
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    // Method to update grade
    public void updateGrade(char newGrade) {
        this.grade = newGrade;
        System.out.println("Grade updated successfully!");
    }

    public static void main(String[] args) {

        // Creating Student objects
        Student student1 = new Student("Rahul", 101, 'A');
        Student student2 = new Student("Priya", 102, 'B');

        // Checking instanceof before displaying details
        if (student1 instanceof Student) {
            System.out.println("Student 1 Details:");
            student1.displayDetails();
        }

        System.out.println();

        if (student2 instanceof Student) {
            System.out.println("Student 2 Details:");
            student2.displayDetails();
        }

        System.out.println();

        // Checking instanceof before updating grade
        if (student2 instanceof Student) {
            student2.updateGrade('A');
        }

        System.out.println("\nStudent 2 Details After Grade Update:");

        if (student2 instanceof Student) {
            student2.displayDetails();
        }

        System.out.println();

        // Display total students
        Student.displayTotalStudents();
    }
}