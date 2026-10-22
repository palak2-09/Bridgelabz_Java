
/*
Write a program to find the frequency of characters in a string using the charAt() method and display the result
Hint =>
Create a method to find the frequency of characters in a string using the charAt() method and return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Create an array to store the characters and their frequencies
Loop through the characters in the text and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.
package Strings.Level3;
 */

package Strings.Level3;

import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of each character
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];

        // Count the frequency of each character using ASCII values
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Count distinct characters
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean alreadyCounted = false;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Store each distinct character and its frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean alreadyCounted = false;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(frequency[ch]);
                index++;
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);

        // Display character frequencies in tabular format
        System.out.printf("%-15s %-15s%n", "Character", "Frequency");
        System.out.println("------------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-15s %-15d%n",
                    result[i][0],
                    Integer.parseInt(result[i][1]));
        }

        sc.close();
    }
}
