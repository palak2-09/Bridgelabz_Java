/*
Write a program to split the text into words and return the words along with their lengths in a 2D array
Hint =>
Take user input using the Scanner nextLine() method
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method.
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
The main function calls the user-defined method and displays the result in a tabular format. During display make sure to convert the length value from String to Integer and then display
 */
package Strings.Level2;

import java.util.Scanner;

public class WordLength2D {

    // Method 1: Find length without using length()
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

    // Method 2: Split text without using split()
    public static String[] splitText(String text) {
        int length = findLength(text);
        int wordCount = 0;
        boolean inWord = false;

        // Count words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (text.charAt(i) == ' ') {
                inWord = false;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        String word = "";

        // Extract words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i);
            } else if (!word.isEmpty()) {
                words[wordIndex++] = word;
                word = "";
            }
        }

        if (!word.isEmpty()) {
            words[wordIndex] = word;
        }

        return words;
    }

    // Method 3: Create a 2D array containing words and their lengths
    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] result = getWordLengths(words);

        System.out.println("\nWord\t\tLength");
        System.out.println("------------------------");

        for (int i = 0; i < result.length; i++) {
            int length = Integer.parseInt(result[i][1]);

            System.out.println(result[i][0] + "\t\t" + length);
        }

        sc.close();
    }
}
