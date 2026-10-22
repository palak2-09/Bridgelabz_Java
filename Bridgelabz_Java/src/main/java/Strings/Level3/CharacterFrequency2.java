/*
Write a program to find the frequency of characters in a string using unique characters and display the result
Hint =>
Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array.  Use Nested Loops to find the unique characters in the text
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Call the uniqueCharacters() method to find the unique characters in the text
Create a 2D String array to store the unique characters and their frequencies.
Loop through the unique characters and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.

 */
package Strings.Level3;

import java.util.Scanner;

public class CharacterFrequency2 {

    // Method 1: Find unique characters using nested loops
    public static char[] uniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            // Check whether the character appeared previously
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }

            // Store the character if it is unique
            if (isUnique) {
                temp[count] = ch;
                count++;
            }
        }

        // Create an array containing only unique characters
        char[] unique = new char[count];

        for (int i = 0; i < count; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }

    // Method 2: Find the frequency of unique characters
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];

        // Count the frequency of each character using ASCII values
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Get the unique characters
        char[] unique = uniqueCharacters(text);

        // Store unique characters and their frequencies in a 2D array
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(frequency[unique[i]]);
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
