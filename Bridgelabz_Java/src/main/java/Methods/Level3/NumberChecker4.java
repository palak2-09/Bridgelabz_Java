/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint =>
Method to Check if a number is prime number. A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.
Method to Check if a number is a neon number. A neon number is a number where the sum of digits of the square of the number is equal to the number itself
Method to Check if a number is a spy number. A number is called a spy number if the sum of its digits is equal to the product of its digits
Method to Check if a number is an automorphic number. An automorphic number is a number whose square ends with the number itself. E.g. 5 is an automorphic number
Method to Check if a number is a buzz number. A buzz number is a number that is either divisible by 7 or ends with 7
 */
package Methods.Level3;

import java.util.Scanner;

public class NumberChecker4 {

    /*
     * Check whether a number is prime, neon, spy, automorphic, or buzz.
     * Use separate static methods for each check and display the results.
     */

    // Method to check whether the number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Method to check whether the number is neon
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        return sum == number;
    }

    // Method to check whether the number is spy
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;

        if (temp == 0) {
            return true;
        }

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        return sum == product;
    }

    // Method to check whether the number is automorphic
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        int temp = number;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                return false;
            }

            temp /= 10;
            square /= 10;
        }

        return true;
    }

    // Method to check whether the number is buzz
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
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

        // Display the results
        System.out.println("Is Prime Number: " + isPrime(number));
        System.out.println("Is Neon Number: " + isNeon(number));
        System.out.println("Is Spy Number: " + isSpy(number));
        System.out.println("Is Automorphic Number: " + isAutomorphic(number));
        System.out.println("Is Buzz Number: " + isBuzz(number));

        sc.close();
    }
}

