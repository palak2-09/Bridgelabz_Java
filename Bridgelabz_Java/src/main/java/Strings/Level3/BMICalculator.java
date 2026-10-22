/*
An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members. For this create a program to find the BMI and display the height, weight, BMI, and status of each individual
Hint =>
Take user input for the person's weight (kg) and height (cm) and store it in the corresponding 2D array of 10 rows. The First Column stores the weight and the second column stores the height in cm
Create a Method to find the BMI and status of every person given the person's height and weight and return the 2D String array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method that takes the 2D array of height and weight as parameters. Calls the user-defined method to compute the BMI and the BMI Status and stores in a 2D String array of height, weight, BMI, and status.
Create a method to display the 2D string array in a tabular format of Person's Height, Weight, BMI, and the Status
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
 */
package Strings.Level3;

import java.util.Scanner;

public class BMICalculator {

    // Method 1: Take weight and height of all persons
    public static double[][] getPersonData(int n, Scanner sc) {
        double[][] data = new double[n][2];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter weight in kg: ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height in cm: ");
            data[i][1] = sc.nextDouble();
        }

        return data;
    }

    // Method 2: Calculate BMI and determine status
    public static String[][] calculateBMI(double weight, double height) {
        String[][] result = new String[1][2];

        // Convert height from centimeters to meters
        height = height / 100.0;

        // Calculate BMI
        double bmi = weight / (height * height);
        bmi = Math.round(bmi * 100.0) / 100.0;

        // Determine BMI status
        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        result[0][0] = String.valueOf(bmi);
        result[0][1] = status;

        return result;
    }

    // Method 3: Calculate BMI and store height, weight, BMI, and status
    public static String[][] getBMIResults(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];

            String[][] bmiResult = calculateBMI(weight, height);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiResult[0][0];
            result[i][3] = bmiResult[0][1];
        }

        return result;
    }

    // Method 4: Display BMI results in tabular format
    public static void displayResults(String[][] result) {
        System.out.printf("%-10s %-15s %-15s %-15s%n",
                "Person", "Height (cm)", "Weight (kg)", "BMI");

        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-10d %-15s %-15s %-15s%n",
                    i + 1, result[i][0], result[i][1], result[i][2]);
            System.out.printf("%-10s %-15s %-15s %-15s%n",
                    "", "", "", result[i][3]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;

        // Take input for 10 persons
        double[][] data = getPersonData(n, sc);

        // Calculate BMI and status
        String[][] result = getBMIResults(data);

        // Display results
        displayResults(result);

        sc.close();
    }
}
