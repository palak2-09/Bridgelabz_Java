/*
 Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the total, average, and the percentage score  Hint =>  a. Take input for the number of students b. Write a method to generate random 2-digit scores for Physics, Chemistry, and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students c. Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using the Math.round() method.  d. Finally, write a Method to display the scorecard of all students with their scores, total, average, and percentage in a tabular format using "\t".
 */
package Methods.Level3;
import java.util.Scanner;

public class StudentGrades {

    /*
     * Create a program to take marks of students in three subjects:
     * Physics, Chemistry, and Maths.
     *
     * Calculate the total, average, percentage, and grade for each student.
     *
     * Grade criteria:
     * A: 80% and above
     * B: 70% - 79%
     * C: 60% - 69%
     * D: 50% - 59%
     * E: 40% - 49%
     * R: 39% and below
     *
     * Generate random 2-digit marks for each subject.
     * Use 2D arrays to store marks and results.
     * Round average and percentage to 2 decimal places using Math.round().
     * Display the results in a tabular format.
     */

    // Method to generate random marks for all students
    public static int[][] generateMarks(int numberOfStudents) {
        int[][] marks = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int) (Math.random() * 100);
            }
        }

        return marks;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] marks) {
        double[][] results = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];

            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round average and percentage to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    // Method to determine the grade
    public static String getGrade(double percentage) {
        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "R";
        }
    }

    // Method to display student results in a table
    public static void displayResults(int[][] marks, double[][] results) {
        System.out.println("\nStudent Results");
        System.out.println("----------------------------------------------------------------------------");

        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-12s %-10s%n",
                "Student", "Physics", "Chemistry", "Maths",
                "Total", "Average", "Percentage");

        System.out.println("----------------------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-12.2f %-10.2f%n",
                    i + 1,
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2]);

            System.out.println("Grade: " + getGrade(results[i][2]));
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the number of students as input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        if (numberOfStudents <= 0) {
            System.out.println("Number of students must be greater than zero.");
        } else {
            // Generate marks and calculate results
            int[][] marks = generateMarks(numberOfStudents);
            double[][] results = calculateResults(marks);

            // Display the results
            displayResults(marks, results);
        }

        sc.close();
    }
}

