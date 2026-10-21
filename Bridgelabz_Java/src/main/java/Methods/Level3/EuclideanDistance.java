/*
Write a program Euclidean distance between two points as well as the equation of the line using those two points. Use Math functions Math.pow() and Math.sqrt()
Hint =>
Take inputs for 2 points x1, y1, and x2, y2
Method to find the Euclidean distance between two points and return the distance
distance = (x2-x1)2 +(y2-y1)2
Write a Method to find the equation of a line given two points and return the equation which includes the slope and the y-intercept
The equation of a line is given by the equation y = m*x + b Where m is the slope and b is the y-intercept. So firstly compute the slope using the formulae
m = (y2 - y1)/(x2 - x1)
Post that compute the y-intercept b using the formulae
b = y1 - m*x1
Finally, return an array having slope m and y-intercept b
 */
package Methods.Level3;
import java.util.Scanner;

public class EuclideanDistance {

    /*
     * Calculate the Euclidean distance between two points.
     * Find the equation of the line in the form y = mx + b.
     * Use Math.pow() and Math.sqrt() to calculate the distance.
     */

    // Method to calculate Euclidean distance
    public static double calculateDistance(double x1, double y1,
                                           double x2, double y2) {
        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) +
                        Math.pow(y2 - y1, 2)
        );

        return distance;
    }

    // Method to calculate slope and y-intercept
    // Returns an array containing slope m and intercept b
    public static double[] findLineEquation(double x1, double y1,
                                            double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;

        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take coordinates of two points
        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Calculate and display distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance = " + distance);

        // Calculate slope and y-intercept
        if (x1 == x2) {
            System.out.println("Equation of the line: x = " + x1);
            System.out.println("Slope is undefined because the line is vertical.");
        } else {
            double[] result = findLineEquation(x1, y1, x2, y2);

            double m = result[0];
            double b = result[1];

            System.out.println("Slope (m) = " + m);
            System.out.println("Y-intercept (b) = " + b);
            System.out.println("Equation of the line: y = " + m + "x + " + b);
        }

        sc.close();
    }
}
