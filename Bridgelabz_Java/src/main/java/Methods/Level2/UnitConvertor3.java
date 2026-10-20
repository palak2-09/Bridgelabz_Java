/*
Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g.
public static double convertFarhenheitToCelsius(double farhenheit) =>
Method to convert Fahrenheit to Celsius and return the value. Use the following code  double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
Method to convert Celsius to Fahrenheit and return the value. Use the following code  double celsius2farhenheit = (celsius * 9 / 5) + 32;
Method to convert pounds to kilograms and return the value. Use the following code  double pounds2kilograms = 0.453592;
Method to convert kilograms to pounds and return the value. Use the following code  double kilograms2pounds = 2.20462;
Method to convert gallons to liters and return the value. Use following code to convert   double gallons2liters = 3.78541;
Method to convert liters to gallons and return the value. Use following code to convert  double liters2gallons = 0.264172;
 */
package Methods.Level2;

import java.util.Scanner;
public class UnitConvertor3 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5.0 / 9;
        return fahrenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9.0 / 5) + 32;
        return celsius2fahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.println("Temperature in Celsius: "
                + convertFahrenheitToCelsius(fahrenheit));

        // Celsius to Fahrenheit
        System.out.print("\nEnter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println("Temperature in Fahrenheit: "
                + convertCelsiusToFahrenheit(celsius));

        // Pounds to kilograms
        System.out.print("\nEnter weight in pounds: ");
        double pounds = sc.nextDouble();
        System.out.println("Weight in kilograms: "
                + convertPoundsToKilograms(pounds));

        // Kilograms to pounds
        System.out.print("\nEnter weight in kilograms: ");
        double kilograms = sc.nextDouble();
        System.out.println("Weight in pounds: "
                + convertKilogramsToPounds(kilograms));

        // Gallons to liters
        System.out.print("\nEnter volume in gallons: ");
        double gallons = sc.nextDouble();
        System.out.println("Volume in liters: "
                + convertGallonsToLiters(gallons));

        // Liters to gallons
        System.out.print("\nEnter volume in liters: ");
        double liters = sc.nextDouble();
        System.out.println("Volume in gallons: "
                + convertLitersToGallons(liters));

        sc.close();
    }
}
