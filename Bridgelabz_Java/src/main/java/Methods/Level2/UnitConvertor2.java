/*
Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g.
public static double convertYardsToFeet(double yards) =>
Method to convert yards to feet and return the value. Use following code to convert  double yards2feet = 3;
Method to convert feet to yards and return the value. Use following code to convert  double feet2yards = 0.333333;
Method to convert meters to inches and return the value. Use following code to convert  double meters2inches = 39.3701;
Method to convert inches to meters and return the value. Use following code to convert  double inches2meters = 0.0254;
Method to convert inches to centimeters and return the value. Use the following code  double inches2cm = 2.54;
 */

package Methods.Level2;

import java.util.Scanner;

public class UnitConvertor2 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Yards to feet
        System.out.print("Enter distance in yards: ");
        double yards = sc.nextDouble();
        System.out.println("Feet: " + convertYardsToFeet(yards));

        // Feet to yards
        System.out.print("\nEnter distance in feet: ");
        double feet = sc.nextDouble();
        System.out.println("Yards: " + convertFeetToYards(feet));

        // Meters to inches
        System.out.print("\nEnter distance in meters: ");
        double meters = sc.nextDouble();
        System.out.println("Inches: " + convertMetersToInches(meters));

        // Inches to meters
        System.out.print("\nEnter distance in inches: ");
        double inches = sc.nextDouble();
        System.out.println("Meters: " + convertInchesToMeters(inches));

        // Inches to centimeters
        System.out.print("\nEnter distance in inches: ");
        double inchesValue = sc.nextDouble();
        System.out.println("Centimeters: " + convertInchesToCm(inchesValue));

        sc.close();
    }
}

