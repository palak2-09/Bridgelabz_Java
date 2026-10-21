/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint =>
Method to find factors of a number and return them as an array. Note there are 2 for loops one for the count and another for finding the factor and storing in the array
Method to find the greates factor of a Number using the factors array
Method to find the sum of the factors using factors array and return the sum
Method to find the product of the factors using factors array and return the product
Method to find product of cube of the factors using the factors array. Use Math.pow()
Method to Check if a number is a perfect number. Perfect numbers are positive integers that are equal to the sum of their proper divisors
Method to find the number is a abundant number. A number is called an abundant number if the sum of its proper divisors is greater than the number itself
Method to find the number is a deficient number. A number is called a deficient number if the sum of its proper divisors is less than the number itself
Method to Check if a number is a strong number. A number is called a strong number if the sum of the factorial of its digits is equal to the number itself
 */
package Methods.Level3;
import java.util.Scanner;

public class NumberChecker5 {

    /*
     * Find the factors of a number and calculate their greatest value,
     * sum, product, and product of cubes. Check whether the number is
     * perfect, abundant, deficient, or strong using separate methods.
     */

    // Method to find and store the factors
    public static int[] findFactors(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find the greatest factor
    public static int greatestFactor(int[] factors) {
        int greatest = factors[0];

        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }

        return greatest;
    }

    // Method to find the sum of factors
    public static int sumFactors(int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }

        return sum;
    }

    // Method to find the product of factors
    public static long productFactors(int[] factors) {
        long product = 1;

        for (int factor : factors) {
            product *= factor;
        }

        return product;
    }

    // Method to find the product of cubes of factors
    public static double productCubeFactors(int[] factors) {
        double product = 1;

        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }

        return product;
    }

    // Method to check whether the number is perfect
    public static boolean isPerfect(int number, int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }

        return number > 0 && sum == number;
    }

    // Method to check whether the number is abundant
    public static boolean isAbundant(int number, int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }

        return number > 0 && sum > number;
    }

    // Method to check whether the number is deficient
    public static boolean isDeficient(int number, int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }

        return number > 0 && sum < number;
    }

    // Method to calculate the factorial of a digit
    public static int factorial(int digit) {
        int fact = 1;

        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }

        return fact;
    }

    // Method to check whether the number is strong
    public static boolean isStrong(int number) {
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return number >= 0 && sum == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            sc.close();
            return;
        }

        // Find and display the factors
        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Display factor calculations
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumFactors(factors));
        System.out.println("Product of Factors: " + productFactors(factors));
        System.out.println("Product of Cubes of Factors: "
                + productCubeFactors(factors));

        // Display number classifications
        System.out.println("Is Perfect Number: " + isPerfect(number, factors));
        System.out.println("Is Abundant Number: " + isAbundant(number, factors));
        System.out.println("Is Deficient Number: " + isDeficient(number, factors));
        System.out.println("Is Strong Number: " + isStrong(number));

        sc.close();
    }
}

