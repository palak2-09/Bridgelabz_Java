/*
Create a program to find the shortest, tallest, and mean height of players present in a football team.
Hint =>
The formula to calculate the mean is: mean = sum of all elements/number of elements
Create an int array named heights of size 11 and get 3 digits random height in cms for each player in the range 150 cms to 250 cms
Write the method to Find the sum of all the elements present in the array.
Write the method to find the mean height of the players on the football team
Write the method to find the shortest height of the players on the football team
Write the method to find the tallest height of the players on the football team
Finally display the results
 */
package Methods.Level3;
import java.util.Random;

public class FootballTeamHeights {

    /*
     * Create an array to store the heights of 11 football players.
     * Generate random heights between 150 and 250 cm.
     * Calculate the sum and mean height using separate methods.
     * Find the shortest and tallest heights in the array.
     * Display all heights and the calculated results.
     */

    // Method to calculate the sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;

        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        return sum;
    }

    // Method to calculate the mean height
    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }

        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }

        return tallest;
    }

    public static void main(String[] args) {

        int[] heights = new int[11];
        Random random = new Random();

        // Generate random heights between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150;
        }

        // Display all players' heights
        System.out.println("Heights of Football Players:");

        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + ": "
                    + heights[i] + " cm");
        }

        // Display the results
        System.out.println("\nSum of Heights: " + findSum(heights) + " cm");
        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.printf("Mean Height: %.2f cm%n", findMean(heights));
    }
}

