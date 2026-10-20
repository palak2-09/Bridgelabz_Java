/*
Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g.
public static double convertKmToMiles(double km) =>
Method To convert kilometers to miles and return the value. Use the following code  double km2miles = 0.621371;
Method to convert miles to kilometers and return the value. Use the following code  double miles2km = 1.60934;
Method to convert meters to feet and return the value. Use the following code to convert  double meters2feet = 3.28084;
Method to convert feet to meters and return the value. Use the following code to convert  double feet2meters = 0.3048;
 */


package Methods.Level2;

import java.util.Scanner;

public class UnitConvertor1 {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Convert kilometers to miles
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        System.out.println(km + " kilometers in miles: "
                + convertKmToMiles(km));

        // Convert miles to kilometers
        System.out.print("\nEnter distance in miles: ");
        double miles = sc.nextDouble();
        System.out.println(miles + " miles in kilometers: "
                + convertMilesToKm(miles));

        // Convert meters to feet
        System.out.print("\nEnter distance in meters: ");
        double meters = sc.nextDouble();
        System.out.println(meters + " meters in feet: "
                + convertMetersToFeet(meters));

        // Convert feet to meters
        System.out.print("\nEnter distance in feet: ");
        double feet = sc.nextDouble();
        System.out.println(feet + " feet in meters: "
                + convertFeetToMeters(feet));

        sc.close();
    }
}
