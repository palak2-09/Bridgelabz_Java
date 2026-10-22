/*
Find unique characters in a string using the charAt() method and display the result
Hint =>
Create a Method to find the length of the text without using the String method length()
Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array. The logic used here is as follows:
Create an array to store the unique characters in the text. The size is the length of the text
Loops to Find the unique characters in the text. Find the unique characters in the text using a nested loop. An outer loop iterates through each character and an inner loop checks if the character is unique by comparing it with the previous characters. If the character is unique, it is stored in the result array
Create a new array to store the unique characters
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.

 */
package Strings.Level3;

import java.util.Scanner;

public class UniqueCharacters {

    // Method 1: Find string length without using length()
    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method 2: Find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] temp = new char[length];
        int uniqueCount = 0;

        // Check each character against previous characters
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }

            // Store the character if it has not appeared before
            if (isUnique) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }

        // Create a new array containing only unique characters
        char[] uniqueCharacters = new char[uniqueCount];

        for (int i = 0; i < uniqueCount; i++) {
            uniqueCharacters[i] = temp[i];
        }

        return uniqueCharacters;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] result = findUniqueCharacters(text);

        System.out.print("Unique characters: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
