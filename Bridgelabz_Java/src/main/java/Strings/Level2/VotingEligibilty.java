/*
Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint =>
Create a method to define the random 2-digit age of several students provided as method parameters and return a 1D array of ages of n students
Create a method that takes an array of age as a parameter and returns a 2D String array of age and a boolean true or false to indicate can and cannot vote. Inside the method firstly validate the age for a negative number, if a negative cannot vote. For valid age check for age is 18 or above to set true to indicate can vote.
Create a method to display the 2D array in a tabular format.
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.

 */
package Strings.Level2;

import java.util.Scanner;

public class VotingEligibilty {

    // Method 1: Take ages of n students and return a 1D array
    public static int[] getStudentAges(int n, Scanner sc) {
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        return ages;
    }

    // Method 2: Create a 2D array containing ages and voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            // Negative ages are invalid and cannot vote
            if (ages[i] < 0) {
                result[i][1] = "Invalid Age";
            }
            // Students aged 18 or above can vote
            else if (ages[i] >= 18) {
                result[i][1] = "true";
            }
            // Students below 18 cannot vote
            else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    // Method 3: Display student ages and voting eligibility in tabular format
    public static void displayTable(String[][] result) {
        System.out.printf("%-15s %-20s%n", "Student Age", "Can Vote?");
        System.out.println("-----------------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-15s %-20s%n",
                    result[i][0], result[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Validate the number of students
        if (n <= 0) {
            System.out.println("Number of students must be positive.");
            sc.close();
            return;
        }

        // Get ages of all students
        int[] ages = getStudentAges(n, sc);

        // Check voting eligibility
        String[][] result = checkVotingEligibility(ages);

        // Display the results
        System.out.println("\nVoting Eligibility Report");
        displayTable(result);

        sc.close();
    }
}
