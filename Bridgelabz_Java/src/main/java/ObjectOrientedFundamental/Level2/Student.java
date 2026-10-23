/*
Program to Simulate Student Report
Problem Statement: Create a Student class with attributes name, rollNumber, and marks. Add two methods:
To calculate the grade based on the marks.
To display the student's details and grade.
Explanation: The Student class organizes all relevant details about a student as attributes. Methods are used to calculate the grade and provide a way to display all information.
 */
package ObjectOrientedFundamental.Level2;
import java.util.Scanner;
public class Student {
    String name;
    int rollNumber;
    double marks;

    //method to calculate grade based on marks
    char calculateGrade(){
        if(marks>=90){
            return 'A';
        }
        else if(marks>=80){
            return 'B';
        }
        else if(marks>=70){
            return 'C';
        }
        else if(marks>=60){
            return 'D';
        }
        else if(marks>=50){
            return 'E';
        }
        else{
            return 'F';
        }
    }
    //method to display the student details and grade
    void displayDetails(){
        System.out.println("Student Report\n");
        System.out.println("Student name: "+name);
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Marks: "+marks);
        System.out.println("Grade: "+calculateGrade());
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //create an object for Student
        Student obj=new Student();

        //take student details from user
        System.out.println("Enter the name of student:");
        obj.name=sc.nextLine();

        System.out.println("Enter the roll number of student:");
        obj.rollNumber=sc.nextInt();

        System.out.println("Enter the marks of the student:");
        obj.marks=sc.nextDouble();

        //display student report
        obj.displayDetails();
        sc.close();
    }
}
