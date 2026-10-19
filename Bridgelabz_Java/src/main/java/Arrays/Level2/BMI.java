/*
An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint =>
Take input for a number of persons
Create arrays to store the weight, height, BMI, and weight status of the persons
Take input for the weight and height of the persons
Calculate the BMI of all the persons and store them in an array and also find the weight status of the persons
Display the height, weight, BMI, and weight status of each person
Use the table to determine the weight status of the person
 */
package Arrays.Level2;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //taking input for number of persons
        System.out.println("Enter number of persons:");
        int noOfPersons=sc.nextInt();
        //create arrays to store weight, height, BMI, and weight status
        double[] weight=new double[noOfPersons];
        double[] height=new double[noOfPersons];
        double[] bmi=new double[noOfPersons];
        String[] status=new String[noOfPersons];
        //taking input for the weight and height of the person
        for(int i=0;i<noOfPersons;i++){
            System.out.print("Enter weight of person "+(i+1)+" : ");
            weight[i]=sc.nextDouble();

            System.out.print("Enter height of person "+(i+1)+" : ");
            height[i]=sc.nextDouble();
        }

        for(int i=0;i<noOfPersons;i++){
            bmi[i]=weight[i]/(height[i]*height[i]);
        }

        //giving status to each person
        for(int i=0;i<noOfPersons;i++){
            if(bmi[i]<=18.4){
                status[i]="Underweight";
            }
            else if(bmi[i]>=18.5 && bmi[i]<=24.9){
                status[i]="Normal";
            }
            else if(bmi[i]>=25.0 && bmi[i]<=39.9){
                status[i]="Overweight";
            }
            else{
                status[i]="Obese";
            }
        }
        // Displaying the details of each person
        System.out.println("\n--- BMI Report ---");

        for (int i = 0; i < noOfPersons; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Height: " + height[i] + " m");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.printf("BMI: %.2f%n", bmi[i]);
            System.out.println("Status: " + status[i]);
        }

        sc.close();


    }
}
