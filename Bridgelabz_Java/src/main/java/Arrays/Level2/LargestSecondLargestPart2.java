/*
Rework the program 2, especially the Hint f where if index equals maxDigit, we break from the loop. Here we want to modify to Increase the size of the array i,e maxDigit by 10 if the index is equal to maxDigit. This is done to consider all digits to find the largest and second-largest number
Hint =>
In Hint f inside the loop if the index is equal to maxDigit, increase maxDigit and make digits array to store more elements.
To do this, we need to create a new temp array of size maxDigit, copy from the current digits array the digits into the temp array, and assign the current digits array to the temp array
Now the digits array will be able to store all digits of the number in the array and then find the largest and second largest number
 */
package Arrays.Level2;

import java.util.Scanner;

public class LargestSecondLargestPart2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number input
        System.out.println("Enter a number:");
        long number = sc.nextLong();

        // Initialize the array with a size of 10
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store them in the array
        while (number != 0) {

            // Increase array size when it becomes full
            if (index == maxDigit) {
                maxDigit += 10;

                // Create a temporary array with the increased size
                int[] temp = new int[maxDigit];

                // Copy existing digits into the temporary array
                for (int i = 0; i < index; i++) {
                    temp[i] = digits[i];
                }

                // Assign the new array
                digits = temp;
            }

            // Extract the last digit
            int digit = (int) (number % 10);

            // Store the digit in the array
            digits[index] = digit;

            // Remove the last digit
            number = number / 10;

            // Move to the next index
            index++;
        }

        // Initialize the largest and second-largest digits
        int largest = -1;
        int secondLargest = -1;

        // Find the largest and second-largest distinct digits
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        if (index == 0) {
            System.out.println("No digits found.");
        } else {
            System.out.println("The largest digit is: " + largest);

            if (secondLargest == -1) {
                System.out.println("No second-largest distinct digit was found.");
            } else {
                System.out.println("The second-largest digit is: " + secondLargest);
            }
        }

        sc.close();
    }
}