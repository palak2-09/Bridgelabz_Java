/*
Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
Hint =>
Take input for a number of persons
Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status of the persons
       double[][] personData = new double[number][3];
       String[] weightStatus = new String[number];
Take input for weight and height of the persons and for negative values, ask the user to enter positive values
Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
Display the height, weight, BMI and status of each person
 */
package Arrays.Level2;
import java.util.Scanner;
public class MultiDimensionalArrayBMI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input for the number of persons
        System.out.println("Enter number of persons:");
        int number = sc.nextInt();

        // Creating arrays to store height, weight, BMI, and status
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Taking input for height and weight
        for (int i = 0; i < number; i++) {

            System.out.println("\nPerson " + (i + 1));

            // Taking and validating height
            System.out.print("Enter height in meters: ");
            double height = sc.nextDouble();

            while (height <= 0) {
                System.out.print("Invalid height! Enter a positive height: ");
                height = sc.nextDouble();
            }

            personData[i][0] = height;

            // Taking and validating weight
            System.out.print("Enter weight in kg: ");
            double weight = sc.nextDouble();

            while (weight <= 0) {
                System.out.print("Invalid weight! Enter a positive weight: ");
                weight = sc.nextDouble();
            }

            personData[i][1] = weight;
        }

        // Calculating BMI for each person
        for (int i = 0; i < number; i++) {

            personData[i][2] = personData[i][1] /
                    (personData[i][0] * personData[i][0]);
        }

        // Determining the weight status
        for (int i = 0; i < number; i++) {

            double bmi = personData[i][2];

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25.0) {
                weightStatus[i] = "Normal";
            } else if (bmi < 30.0) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Displaying the details of each person
        System.out.println("\n========== BMI REPORT ==========");

        for (int i = 0; i < number; i++) {

            System.out.println("\nPerson " + (i + 1));
            System.out.println("Height: " + personData[i][0] + " m");
            System.out.println("Weight: " + personData[i][1] + " kg");
            System.out.printf("BMI: %.2f%n", personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
        }

        sc.close();
    }
}
