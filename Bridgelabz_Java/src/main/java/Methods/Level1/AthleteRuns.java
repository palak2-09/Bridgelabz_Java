/*
An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint =>
Take user input for 3 sides of a triangle
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run
 */
package Methods.Level1;

import java.util.Scanner;

public class AthleteRuns {
    public static int noOfRounds(int side1, int side2, int side3, int distance){
        //calculate the perimeter of triangle
        int perimeter=side1+side2+side3;
        int rounds=distance/perimeter;

        return rounds;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int distance=5000;
        //ask the user to enter the sides of the triangular park
        System.out.println("Enter side 1 of triangular park:");
        int side1=sc.nextInt();
        System.out.println("Enter side 2 of triangular park:");
        int side2=sc.nextInt();
        System.out.println("Enter side 3 of triangular park:");
        int side3=sc.nextInt();

        int rounds=noOfRounds(side1,side2,side3,distance);
        //display the final number of rounds
        System.out.println("The number of rounds the athlete takes to " +
                        "complete the distance of 5 km are : "+rounds);

        sc.close();

    }
}
