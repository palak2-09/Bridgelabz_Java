/*
Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade  as per the following guidelines
Hint =>
Take input for the number of students
Create arrays to store marks, percentages, and grades of the students
Take input for marks of students in physics, chemistry, and maths. If the marks are negative, ask the user to enter positive values and decrement the index
Calculate the percentage and grade of the students based on the percentage
Display the marks, percentages, and grades of each student
 */
package Arrays.Level2;
import java.util.Scanner;
public class GradeNMarks2D {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //taking input for the number of students
        System.out.println("Enter the number of students:");
        int noOfStudents=sc.nextInt();
        //creating arrays to store marks, percentage and grade
        int[][] marks=new int[noOfStudents][3];
        double[] percentage=new double[noOfStudents];
        String[] grade=new String[noOfStudents];

        //taking marks for each student
        for(int i=0;i<noOfStudents;i++){
            System.out.println("Student "+(i+1));
            System.out.println("Enter Physics marks: ");
            marks[i][0]=sc.nextInt();
            while (marks[i][0] < 0 || marks[i][0] > 100) {
                System.out.print("Invalid marks! Enter marks between 0 and 100: ");
                marks[i][0] = sc.nextInt();
            }
            System.out.println("Enter Chemistry marks: ");
            marks[i][1]=sc.nextInt();
            while (marks[i][1] < 0 || marks[i][1] > 100) {
                System.out.print("Invalid marks! Enter marks between 0 and 100: ");
                marks[i][1] = sc.nextInt();
            }
            System.out.println("Enter Maths marks: ");
            marks[i][2]=sc.nextInt();
            while (marks[i][2] < 0 || marks[i][2] > 100) {
                System.out.print("Invalid marks! Enter marks between 0 and 100: ");
                marks[i][2] = sc.nextInt();
            }
        }
        //calculating percentage
        for(int i=0;i<noOfStudents;i++){
            int totalMarks=marks[i][0]+marks[i][1]+marks[i][2];
            percentage[i]=(totalMarks/3.0)*100;
        }
        // Assigning grades according to the given table
        for (int i = 0; i < noOfStudents; i++) {

            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }

        // Displaying student results
        System.out.println("\n========== STUDENT REPORT ==========");

        for (int i = 0; i < noOfStudents; i++) {

            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics Marks: " + marks[i][0]);
            System.out.println("Chemistry Marks: " + marks[i][1]);
            System.out.println("Maths Marks: " + marks[i][2]);

            System.out.printf("Percentage: %.2f%%%n", percentage[i]);

            System.out.println("Grade: " + grade[i]);
        }

        sc.close();
    }
}
