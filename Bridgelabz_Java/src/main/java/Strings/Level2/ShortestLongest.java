/*
Write a program to split the text into words and find the shortest and longest strings in a given text
Hint =>
Take user input using the Scanner nextLine() method
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method.
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array.
The main function calls the user-defined methods and displays the result

 */
package Strings.Level2;

import java.util.Scanner;

public class ShortestLongest {

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

        // Extract words using charAt()
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

    // Method 3: Create a 2D array of words and their lengths
    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    // Method 4: Find shortest and longest word indexes
    public static int[] findShortestLongest(String[][] words) {
        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < words.length; i++) {
            int currentLength = Integer.parseInt(words[i][1]);
            int shortestLength = Integer.parseInt(words[shortestIndex][1]);
            int longestLength = Integer.parseInt(words[longestIndex][1]);

            if (currentLength < shortestLength) {
                shortestIndex = i;
            }

            if (currentLength > longestLength) {
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String text = sc.nextLine();

        String[] words = splitText(text);

        if (words.length == 0) {
            System.out.println("No words found.");
            sc.close();
            return;
        }

        String[][] wordLengths = getWordLengths(words);
        int[] result = findShortestLongest(wordLengths);

        System.out.println("Shortest word: " + wordLengths[result[0]][0]);
        System.out.println("Shortest word length: "
                + Integer.parseInt(wordLengths[result[0]][1]));

        System.out.println("Longest word: " + wordLengths[result[1]][0]);
        System.out.println("Longest word length: "
                + Integer.parseInt(wordLengths[result[1]][1]));

        sc.close();
    }
}
