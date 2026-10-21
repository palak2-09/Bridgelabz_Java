/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint =>
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to find the sum of the digits of a number using the digits array
Method to find the sum of the squares of the digits of a number using the digits array. Use Math.pow() method
Method to Check if a number is a harshad number using a digits array. A number is called a Harshad number if it is divisible by the sum of its digits. For e.g. 21
Method to find the frequency of each digit in the number. Create a 2D array to store the frequency with digit in the first column and frequency in the second column.
 */
package Methods.Level3;
import java.util.Scanner;
public class NumberChecker2 {

    /*
     * Count the digits of a number and store them in an array.
     * Calculate the sum and sum of squares of its digits.
     * Check whether the number is a Harshad number.
     * Find the frequency of each digit using a 2D array,
     * where the first column stores the digit and the second its frequency.
     */

    // Method to count the digits
    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    // Method to store digits in an array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    // Method to calculate the sum of digits
    public static int sumDigits(int[] digits) {
        int sum = 0;

        for (int digit : digits) {
            sum += digit;
        }

        return sum;
    }

    // Method to calculate the sum of squares of digits
    public static double sumSquares(int[] digits) {
        double sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }

        return sum;
    }

    // Method to check whether the number is a Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumDigits(digits);

        return sum != 0 && number % sum == 0;
    }

    // Method to find the frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];

        // Store each digit in the first column
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        // Count the frequency of each digit
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Please enter a positive number.");
            sc.close();
            return;
        }

        // Count and store the digits
        int count = countDigits(number);
        int[] digits = storeDigits(number);

        System.out.println("Number of Digits: " + count);

        System.out.print("Digits Array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Calculate the sum and sum of squares
        System.out.println("Sum of Digits: " + sumDigits(digits));
        System.out.println("Sum of Squares: " + sumSquares(digits));

        // Check whether the number is a Harshad number
        System.out.println("Is Harshad Number: "
                + isHarshadNumber(number, digits));

        // Display the frequency of each digit
        int[][] frequency = digitFrequency(digits);

        System.out.println("\nDigit Frequency:");
        System.out.println("Digit\tFrequency");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + "\t"
                        + frequency[i][1]);
            }
        }

        sc.close();
    }
}
