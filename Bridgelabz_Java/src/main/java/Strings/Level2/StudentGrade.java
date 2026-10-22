/*
Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade as shown in figure below

Hint =>
Write a method to generate random 2-digit scores for Physics, Chemistry and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using Math.round() method
Write a Method to calculate the grade based on the percentage as shown in the ref table and return a 2D array of students' grade
Finally write a Method to display the scorecard of all students with their scores, total, average, percentage, and grade in a tabular format.
 */
package Strings.Level2;

public class StudentGrade {

    // Method 1: Generate random 2-digit marks for all students
    public static int[][] generateMarks(int students) {
        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int) (Math.random() * 61) + 40;
            }
        }

        return marks;
    }

    // Method 2: Calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] marks) {
        double[][] results = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];

            double average = Math.round((total / 3.0) * 100.0) / 100.0;
            double percentage = Math.round((total / 300.0) * 10000.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    // Method 3: Calculate grades based on percentage
    public static String[][] calculateGrades(double[][] results) {
        String[][] grades = new String[results.length][1];

        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];

            if (percentage >= 80) {
                grades[i][0] = "A";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
            } else {
                grades[i][0] = "R";
            }
        }

        return grades;
    }

    // Method 4: Display the scorecard of all students
    public static void displayScorecard(int[][] marks, double[][] results,
                                        String[][] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-12s %-10s%n",
                "Student", "Physics", "Chemistry", "Maths",
                "Total", "Average", "Percentage");

        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-12.2f %-9.2f%%%n",
                    i + 1,
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2]);
        }

        System.out.println("\nGrades:");
        System.out.printf("%-10s %-10s%n", "Student", "Grade");
        System.out.println("--------------------");

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("%-10d %-10s%n", i + 1, grades[i][0]);
        }
    }

    // Main method
    public static void main(String[] args) {
        int students = 10;

        // Generate marks for all students
        int[][] marks = generateMarks(students);

        // Calculate total, average, and percentage
        double[][] results = calculateResults(marks);

        // Calculate grades
        String[][] grades = calculateGrades(results);

        // Display the scorecard
        displayScorecard(marks, results, grades);
    }
}