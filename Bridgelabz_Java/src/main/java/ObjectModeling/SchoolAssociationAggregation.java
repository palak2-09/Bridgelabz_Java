/*
Problem 1: School and Students with Courses (Association and Aggregation)
Description: Model a School with multiple Student objects, where each student can enroll in multiple courses, and each course can have multiple students.
Tasks:
Define School, Student, and Course classes.
Model an association between Student and Course to show that students can enroll in multiple courses.
Model an aggregation relationship between School and Student.
Demonstrate how a student can view the courses they are enrolled in and how a course can show its enrolled students.
Goal: Practice association by modeling many-to-many relationships between students and courses.

 */
package ObjectModeling;

import java.util.ArrayList;
import java.util.List;

// Student class
class Student {
    String studentName;
    int studentId;
    List<Course> courses;

    Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    // Enroll student in a course
    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    // Display courses enrolled by the student
    public void viewCourses() {
        System.out.println("\nCourses enrolled by " + studentName + ":");

        for (Course course : courses) {
            System.out.println(course.courseName);
        }
    }
}

// Course class
class Course {
    String courseName;
    List<Student> students;

    Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Add student to the course
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Display students enrolled in the course
    public void viewStudents() {
        System.out.println("\nStudents enrolled in " + courseName + ":");

        for (Student student : students) {
            System.out.println(student.studentName);
        }
    }
}

// School class
class School {
    String schoolName;
    List<Student> students;

    School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Add an existing student to the school
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Display all students in the school
    public void displayStudents() {
        System.out.println("\nStudents in " + schoolName + ":");

        for (Student student : students) {
            System.out.println(student.studentName);
        }
    }
}

// Main class
public class SchoolAssociationAggregation {
    public static void main(String[] args) {

        // Creating school
        School school = new School("ABC School");

        // Creating students independently
        Student student1 = new Student("Rahul", 101);
        Student student2 = new Student("Priya", 102);
        Student student3 = new Student("Aman", 103);

        // Aggregation: Adding existing students to school
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        // Creating courses
        Course java = new Course("Java");
        Course python = new Course("Python");
        Course database = new Course("Database");

        // Association: Students enrolling in multiple courses
        student1.enrollCourse(java);
        student1.enrollCourse(python);

        student2.enrollCourse(java);
        student2.enrollCourse(database);

        student3.enrollCourse(python);
        student3.enrollCourse(database);

        // Display school students
        school.displayStudents();

        // Display courses of a student
        student1.viewCourses();
        student2.viewCourses();

        // Display students of a course
        java.viewStudents();
        python.viewStudents();
        database.viewStudents();
    }
}