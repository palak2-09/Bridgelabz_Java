/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint =>
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to reverse the digits array
Method to compare two arrays and check if they are equal
Method to check if a number is a palindrome using the Digits. A palindrome number is a number that remains the same when its digits are reversed.
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
 */
package Methods.Level3;
import java.util.Scanner;

public class NumberChecker3 {

    /*
     * Count the digits of a number and store them in an array.
     * Reverse the digits array and compare two arrays for equality.
     * Check whether the number is a palindrome or a duck number.
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

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }

        return reversed;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    // Method to check whether the number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }

    // Method to check whether the number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }

        return false;
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

        // Reverse and display the digits array
        int[] reversed = reverseArray(digits);

        System.out.print("Reversed Array: ");
        for (int digit : reversed) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Compare arrays and check palindrome
        System.out.println("Arrays Equal: " + compareArrays(digits, reversed));
        System.out.println("Is Palindrome: " + isPalindrome(digits));

        // Check whether the number is a duck number
        System.out.println("Is Duck Number: " + isDuckNumber(digits));

        sc.close();
    }
}

