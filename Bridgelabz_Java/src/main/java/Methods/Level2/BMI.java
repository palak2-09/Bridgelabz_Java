/*
An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint =>
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and and store it in the corresponding 2D array of 10 rows and 3 columns. The First Column storing the weight, the second column storing the height in cm and the third column is the BMI
Create a Method to find the BMI of every person and populate the array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method to determine the BMI status using the logic shown in the figure below. and return the array of all the persons BMI Status.
 */
package Methods.Level2;
import java.util.Scanner;
public class BMI {
    public static void calculateBMI(double[][] personData){
        for(int i=0;i<personData.length;i++){
            //convert height from cm to m
            double heightInMeters=personData[i][1]/100.0;
            //bmi= weight/height*height
            personData[i][2]=personData[i][0]/(heightInMeters*heightInMeters);
        }
    }
    // Method to determine BMI status
    public static String[] getBMIStatus(double[][] personData) {
        String[] status = new String[personData.length];
        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //creating a 2D array to store weight, height and bmi
        double[][] personData=new double[10][3];
        //taking input for 10 people
        for(int i=0;i<personData.length;i++){
            System.out.println("Enter details of person "+ (i+1));
            System.out.println("Enter weight in kg: ");
            personData[i][0]=sc.nextDouble();
            System.out.println("Enter height in cm:");
            personData[i][1]=sc.nextDouble();
        }
        // Calculate BMI for all people
        calculateBMI(personData);

        // Get BMI status for all people
        String[] status = getBMIStatus(personData);
        // Display the results
        System.out.println("\n========== BMI REPORT ==========");
        System.out.printf("%-10s %-15s %-15s %-10s %-15s%n",
                "Person", "Weight (kg)", "Height (cm)", "BMI", "Status");

        for (int i = 0; i < personData.length; i++) {

            System.out.printf("%-10d %-15.2f %-15.2f %-10.2f %-15s%n",
                    (i + 1),
                    personData[i][0],
                    personData[i][1],
                    personData[i][2],
                    status[i]);
        }

        sc.close();
    }
}
