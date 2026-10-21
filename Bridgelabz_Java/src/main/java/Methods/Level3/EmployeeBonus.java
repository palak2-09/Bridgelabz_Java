/*
 Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary. Hint =>  a. Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years b. Create a Method to determine the Salary and years of service and return the same. Use the Math.random() method to determine the 5-digit salary for each employee and also use the random method to determine the years of service. Define 2D Array to save the salary and years of service. c. Write a Method to calculate the new salary and bonus based on the logic defined above and return the new 2D Array of the latest salary and bonus amount  d. Write a Method to Calculate the sum of the Old Salary, the Sum of the New Salary, and the Total Bonus Amount and display it in a Tabular Format
 */
package Methods.Level3;
import java.util.Scanner;

public class EmployeeBonus {

    /*
     * Calculate the bonus for 10 employees based on their years
     * of service.
     *
     * Employees with more than 5 years of service receive a 5% bonus.
     * Other employees receive a 2% bonus.
     *
     * Display each employee's old salary, new salary, and bonus.
     * Calculate the total old salary, new salary, and bonus amount.
     */

    // Method to generate salary and years of service
    public static int[][] generateEmployeeData() {
        int[][] employees = new int[10][2];

        for (int i = 0; i < employees.length; i++) {
            // Generate a random 5-digit salary
            employees[i][0] = (int) (Math.random() * 90000) + 10000;

            // Generate years of service between 1 and 10
            employees[i][1] = (int) (Math.random() * 10) + 1;
        }

        return employees;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(int[][] employees) {
        double[][] result = new double[10][2];

        for (int i = 0; i < employees.length; i++) {
            double bonusPercentage;

            if (employees[i][1] > 5) {
                bonusPercentage = 0.05;
            } else {
                bonusPercentage = 0.02;
            }

            double bonus = employees[i][0] * bonusPercentage;
            double newSalary = employees[i][0] + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }

        return result;
    }

    // Method to calculate totals and display the table
    public static void displaySalaryDetails(
            int[][] employees, double[][] result) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("\nEmployee Salary Details");
        System.out.println("----------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-15s %-10s%n",
                "Employee", "Old Salary", "Bonus", "New Salary", "Service");
        System.out.println("----------------------------------------------------------------");

        for (int i = 0; i < employees.length; i++) {
            double oldSalary = employees[i][0];
            int yearsOfService = employees[i][1];
            double bonus = result[i][1];
            double newSalary = result[i][0];

            System.out.printf("%-10d %-15.2f %-15.2f %-15.2f %-10d%n",
                    i + 1, oldSalary, bonus, newSalary, yearsOfService);

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        System.out.println("----------------------------------------------------------------");
        System.out.printf("%-10s %-15.2f %-15.2f %-15.2f%n",
                "Total", totalOldSalary, totalBonus, totalNewSalary);
        System.out.println("----------------------------------------------------------------");
    }

    public static void main(String[] args) {
        // Generate employee salaries and service years
        int[][] employees = generateEmployeeData();

        // Calculate bonuses and new salaries
        double[][] result = calculateBonus(employees);

        // Display employee details and totals
        displaySalaryDetails(employees, result);
    }
}

