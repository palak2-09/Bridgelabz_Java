/*
Problem 2: Online Course Management
Design a Course class with:
Instance Variables: courseName, duration, fee.
Class Variable: instituteName (common for all courses).
Methods:
An instance method displayCourseDetails() to display the course details.
A class method updateInstituteName() to modify the institute name for all courses.
 */
package Constructors.Level2;

public class Course {

    // Instance variables
    String courseName;
    int duration;
    double fee;

    // Class variable
    static String instituteName = "ABC Institute";

    // Parameterized constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: Rs. " + fee);
        System.out.println("----------------------");
    }

    // Class method
    public static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {

        // Creating course objects
        Course course1 = new Course("Java", 3, 10000);
        Course course2 = new Course("Python", 4, 12000);

        System.out.println("Before Updating Institute Name:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        // Updating institute name
        Course.updateInstituteName("XYZ Institute");

        System.out.println("After Updating Institute Name:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
