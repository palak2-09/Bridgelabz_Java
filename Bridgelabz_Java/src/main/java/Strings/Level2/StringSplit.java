/*
Write a program to split the text into words, compare the result with the split() method and display the result
Hint =>
Take user input using the Scanner nextLine() method
Create a Method to find the length of the String without using the built-in length() method.
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
Then Create an array to store the words and use the indexes to extract the words
Create a method to compare the two String arrays and return a boolean
The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result
 */
package Strings.Level2;

import java.util.Scanner;

public class StringSplit {

    // Method to find length without using length()
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

    // Method to count the number of words
    public static int countWords(String text) {
        int length = findLength(text);
        int words = 0;
        boolean inWord = false;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                words++;
                inWord = true;
            } else if (text.charAt(i) == ' ') {
                inWord = false;
            }
        }

        return words;
    }

    // Method to split text without using split()
    public static String[] splitText(String text) {
        int length = findLength(text);
        int wordCount = countWords(text);

        String[] words = new String[wordCount];
        int[] spaces = new int[wordCount + 1];
        int spaceCount = 0;

        // Store the indexes of spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaces[spaceCount++] = i;
            }
        }

        spaces[spaceCount] = length;

        int start = 0;
        int wordIndex = 0;

        // Extract words using space indexes
        for (int i = 0; i <= spaceCount; i++) {
            int end = spaces[i];

            if (start < end) {
                String word = "";

                for (int j = start; j < end; j++) {
                    word += text.charAt(j);
                }

                words[wordIndex++] = word;
            }

            start = end + 1;
        }

        return words;
    }

    // Method to compare two String arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = sc.nextLine();

        // User-defined split method
        String[] userWords = splitText(text);

        // Built-in split method
        String[] builtInWords = text.trim().isEmpty()
                ? new String[0]
                : text.trim().split("\\s+");

        System.out.println("\nWords using user-defined method:");
        for (String word : userWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split() method:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        // Compare both arrays
        boolean result = compareArrays(userWords, builtInWords);

        System.out.println("\nAre both arrays equal? " + result);

        sc.close();
    }
}