/*
Write a program to find the frequency of characters in a string using nested loops and display the result
Hint =>
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 1D array. The logic used here is as follows:
Create an array to store the frequency of each character in the text and an array to store the characters in the text using the toCharArray() method
Loops to Find the frequency of each character in the text and store the result in a frequency array. For this use a Nested Loop with an Outer loop to iterate through each character in the text and initialize the frequency of each character to 1. And an Inner loop to check for duplicate characters. In case of duplicate increment the frequency value and set the duplicate characters to '0' to avoid counting them again.
Create a 1D String array to store the characters and their frequencies. For this Iterate through the characters in the text and store the characters and their frequencies
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.

 */
package Strings.Level3;

import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of each character
    public static String[] findFrequency(String text) {

        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length];

        // Outer loop to select each character
        for (int i = 0; i < characters.length; i++) {

            frequency[i] = 1;

            // Skip characters that have already been counted
            if (characters[i] == '0') {
                continue;
            }

            // Inner loop to find duplicate characters
            for (int j = i + 1; j < characters.length; j++) {

                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0';
                }
            }
        }

        // Store characters and their frequencies in a 1D String array
        String[] result = new String[characters.length * 2];
        int index = 0;

        for (int i = 0; i < characters.length; i++) {

            if (characters[i] != '0') {
                result[index++] = String.valueOf(characters[i]);
                result[index++] = String.valueOf(frequency[i]);
            }
        }

        // Copy only the required elements into the final array
        String[] finalResult = new String[index];

        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] result = findFrequency(text);

        System.out.println("\nCharacter\tFrequency");

        for (int i = 0; i < result.length; i += 2) {
            System.out.println(result[i] + "\t\t" + result[i + 1]);
        }

        sc.close();
    }
}
