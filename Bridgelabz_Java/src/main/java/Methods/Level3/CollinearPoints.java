/*
 * Write a program to find whether three points are collinear using
 * the slope formula and the area of a triangle formula.
 *
 * Hint:
 * 1. Take inputs for three points: (x1, y1), (x2, y2), and (x3, y3).
 *
 * 2. Write a method to check whether the three points are collinear
 *    using the slope formula.
 *
 *    Slope AB = (y2 - y1) / (x2 - x1)
 *    Slope BC = (y3 - y2) / (x3 - x2)
 *    Slope AC = (y3 - y1) / (x3 - x1)
 *
 *    The three points are collinear if:
 *    Slope AB = Slope BC = Slope AC
 *
 * 3. Write a method to check whether the three points are collinear
 *    using the area of a triangle formula.
 *
 *    The three points are collinear if the area of the triangle
 *    formed by them is zero.
 *
 *    Area = 0.5 * abs(
 *        x1 * (y2 - y3) +
 *        x2 * (y3 - y1) +
 *        x3 * (y1 - y2)
 *    )
 *
 * 4. Display whether the points are collinear using both methods.

 */
package Methods.Level3;


import java.util.Scanner;

public class CollinearPoints {

    /*
     * Check whether three points are collinear using:
     * 1. Slope formula
     * 2. Area of a triangle formula
     *
     * Three points are collinear if they lie on the same straight line.
     */

    // Method to check collinearity using the slope formula
    public static boolean checkCollinearUsingSlope(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using the triangle area formula
    public static boolean checkCollinearUsingArea(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        double area = 0.5 * Math.abs(
                x1 * (y2 - y3) +
                        x2 * (y3 - y1) +
                        x3 * (y1 - y2)
        );

        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take coordinates of three points
        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.print("Enter x3 and y3: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        // Check using the slope formula
        if (checkCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Using slope: Points are collinear.");
        } else {
            System.out.println("Using slope: Points are not collinear.");
        }

        // Check using the area formula
        if (checkCollinearUsingArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Using area: Points are collinear.");
        } else {
            System.out.println("Using area: Points are not collinear.");
        }

        sc.close();
    }
}

