/*
Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same
Hint =>
Write a method to Generate a 6-digit OTP number using Math.random()
Create an array to save the OTP numbers generated 10 times
Write a method to ensure that the OTP numbers generated are unique. If unique return true else return false
 */
package Methods.Level3;

public class OTPGenerator {

    /*
     * Generate a six-digit OTP using Math.random().
     * Store 10 generated OTPs in an array.
     * Check whether all 10 OTPs are unique.
     * Display the OTPs and the uniqueness result.
     */

    // Method to generate a six-digit OTP
    public static int generateOTP() {
        return (int) (100000 + Math.random() * 900000);
    }

    // Method to check whether all OTPs are unique
    public static boolean areUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate and store 10 OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Display the generated OTPs
        System.out.println("Generated OTPs:");

        for (int i = 0; i < otps.length; i++) {
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        // Check whether all OTPs are unique
        System.out.println("Are all OTPs unique? " + areUnique(otps));
    }
}
