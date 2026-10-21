/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint =>
Method to Find the count of digits in the number
Method to Store the digits of the number in a digits array
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
Method to check if the number is a armstrong number using the digits array. ​​Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits. Eg: 153 = 1^3 + 5^3 + 3^3
Method to find the largest and second largest elements in the digits array. Use Integer.MIN_VALUE to initialize the variable.
Method to find the the smallest and second smallest elements in the digits array. Use Integer.MAX_VALUE to initialize the variable.
 */
package Methods.Level3;

import java.util.Scanner;

public class NumberChecker {

    /*
     * Create static methods to count the digits of a number and store
     * them in an array. Check whether the number is a duck number
     * or an Armstrong number. Find the largest, second largest,
     * smallest, and second smallest digits using the digits array.
     */

    // Method to count the digits
    public static int countDigits(int number) {
        int count = 0;

        if (number == 0) {
            return 1;
        }

        while (number != 0) {
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

    // Method to check whether the number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }

        return false;
    }

    // Method to check whether the number is an Armstrong number
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0;
        int count = digits.length;

        for (int digit : digits) {
            sum += (int) Math.pow(digit, count);
        }

        return sum == number;
    }

    // Method to find the largest and second largest digits
    public static void findLargestTwo(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        System.out.println("Largest Digit: " + largest);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second Largest Digit: Not available");
        } else {
            System.out.println("Second Largest Digit: " + secondLargest);
        }
    }

    // Method to find the smallest and second smallest digits
    public static void findSmallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        System.out.println("Smallest Digit: " + smallest);

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Second Smallest Digit: Not available");
        } else {
            System.out.println("Second Smallest Digit: " + secondSmallest);
        }
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

        // Count digits and store them in an array
        int count = countDigits(number);
        int[] digits = storeDigits(number);

        System.out.println("Number of Digits: " + count);

        System.out.print("Digits Array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Check duck and Armstrong numbers
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: "
                + isArmstrongNumber(number, digits));

        // Find the largest and smallest digits
        findLargestTwo(digits);
        findSmallestTwo(digits);

        sc.close();
    }
}

