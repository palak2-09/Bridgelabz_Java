/*
Write a program to calculate various trigonometric functions using Math class given an angle in degrees
Hint =>
Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
public double[] calculateTrigonometricFunctions(double angle)
 */
package Methods.Level1;
import java.util.Scanner;
public class Trigonometry {
    public static double[] calculateTrigonometricFunctions(double angle){
        //convert the angle from degrees to radians
        double radians=Math.toRadians(angle);
        //calculate sine,cosine, and tangent
        double sin=Math.sin(radians);
        double cos=Math.cos(radians);
        double tan=Math.tan(radians);

        //return all three values in an array
        return new double[]{sin,cos,tan};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //taking input from the user
        System.out.println("Enter the angle in degrees:");
        double angle=sc.nextDouble();

        //call the method and restore the returned values
        double[] results=calculateTrigonometricFunctions(angle);

        //displaying the results
        System.out.println("Sine: "+results[0]);
        System.out.println("Cosine: "+results[1]);
        System.out.println("Tangent: "+results[2]);

        //close the scanner
        sc.close();
    }

}
