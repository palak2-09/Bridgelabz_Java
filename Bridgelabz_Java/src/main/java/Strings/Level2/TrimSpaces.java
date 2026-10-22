/*
Write a program to trim the leading and trailing spaces from a string using the charAt() method
Hint =>
Create a method to trim the leading and trailing spaces from a string using the charAt() method. Inside the method run a couple of loops to trim leading and trailing spaces and determine the starting and ending points with no spaces. Return the start point and end point in an array
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
The main function calls the user-defined trim and substring methods to get the text after trimming the leading and trailing spaces. Post that use the String built-in method trim() to trim spaces and compare the two strings. And finally display the result
 */
package Strings.Level2;

import java.util.Scanner;

public class TrimSpaces {

    // Method 1: Find the starting and ending indexes after trimming spaces
    public static int[] trimIndex(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Remove leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Remove trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method 2: Create substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    // Method 3: Compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with leading and trailing spaces: ");
        String text = sc.nextLine();

        // User-defined trimming
        int[] indexes = trimIndex(text);
        String userTrimmed;

        if (indexes[0] > indexes[1]) {
            userTrimmed = "";
        } else {
            userTrimmed = createSubstring(text, indexes[0], indexes[1]);
        }

        // Built-in trimming
        String builtInTrimmed = text.trim();

        System.out.println("\nUser-defined trimmed string: [" + userTrimmed + "]");
        System.out.println("Built-in trimmed string: [" + builtInTrimmed + "]");

        // Compare both strings
        boolean result = compareStrings(userTrimmed, builtInTrimmed);

        System.out.println("Are both strings equal? " + result);

        sc.close();
    }
}