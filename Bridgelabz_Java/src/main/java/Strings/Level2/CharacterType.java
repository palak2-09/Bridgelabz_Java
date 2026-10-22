/*
Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter
Hint =>
Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to find vowels and consonants in a string using charAt() method and return the character and vowel or consonant in a 2D array
Create a Method to display the 2D Array of Strings in a Tabular Format
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result

 */
package Strings.Level2;

import java.util.Scanner;

public class CharacterType {

    // Method 1: Check character type
    public static String checkCharacter(char ch) {

        // Convert uppercase to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method 2: Store characters and their types in a 2D array
    public static String[][] getCharacterTypes(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacter(ch);
        }

        return result;
    }

    // Method 3: Display the 2D array in tabular format
    public static void displayTable(String[][] result) {
        System.out.printf("%-15s %-15s%n", "Character", "Character Type");
        System.out.println("--------------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-15s %-15s%n",
                    result[i][0], result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = getCharacterTypes(text);

        displayTable(result);

        sc.close();
    }
}
