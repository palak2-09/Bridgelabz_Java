/*
Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.
Hint =>
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Define a double array to save salary and years of service for each of the 10 employees
Also define a double array to save the new salary and the bonus amount as well as variables to save the total bonus, total old salary, and new salary
Define a loop to take input from the user. If salary or year of service is an invalid number then ask the use to enter again. Note in this case you will have to decrement the index counter
Define another loop to calculate the bonus of 10 employees based on their years of service. Save the bonus in the array, compute the new salary, and save in the array. Also, the total bonus and total old and new salary can be calculated in the loop
Print the total bonus payout as well as the total old and new salary of all the employees
 */
package Arrays.Level2;

import java.util.Scanner;

public class BonusOfEmployees {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating arrays to store employee details
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables to store totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Taking input for 10 employees
        for (int i = 0; i < 10; i++) {

            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter salary: ");
            double empSalary = sc.nextDouble();

            System.out.print("Enter years of service: ");
            double empYears = sc.nextDouble();

            // Validating salary and years of service
            if (empSalary <= 0 || empYears < 0) {
                System.out.println("Invalid input! Please enter the details again.");
                i--;
                continue;
            }

            salary[i] = empSalary;
            yearsOfService[i] = empYears;
        }

        // Calculating bonus and new salary
        for (int i = 0; i < 10; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            // Calculating new salary
            newSalary[i] = salary[i] + bonus[i];

            // Calculating totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Displaying employee details
        System.out.println("\n----- Employee Bonus Details -----");

        for (int i = 0; i < 10; i++) {
            System.out.println("\nEmployee " + (i + 1));
            System.out.println("Old Salary: " + salary[i]);
            System.out.println("Years of Service: " + yearsOfService[i]);
            System.out.println("Bonus: " + bonus[i]);
            System.out.println("New Salary: " + newSalary[i]);
        }

        // Displaying total amounts
        System.out.println("\n----- Company Summary -----");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
