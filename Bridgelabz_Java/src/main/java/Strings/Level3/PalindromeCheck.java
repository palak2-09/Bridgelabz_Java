/*
Write a program to to check if a text is palindrome and display the result
Hint =>
A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward
Logic 1: Write a method to compare the characters from the start and end of the string to determine whether the text is palindrome. The logic used here is as follows:
Set the start and end indexes of the text
Loop through the text and compare the characters from the start and the end of the string. If the characters are not equal, return false
Logic 2: Write a recursive method to compare the characters from the start and end of the text passed as parameters using recursion. The logic used here is as follows:
First, check if the start index is greater than or equal to the end index, then return true.
If the characters at the start and end indexes are not equal, return false.
Otherwise, call the method recursively with the start index incremented by 1 and the end index
Logic 3: Write a Method to compare the characters from the start and end of the text using character arrays. The logic used here is as follows:
Firstly Write a Method to reverse a string using the charAt() method and return the reversal array.
Create a character array using the String method toCharArray() and also create a reverse array. Compare the characters in the original and reverse arrays to do a Palindrome check
Finally, in the main method do palindrome check using the three logic and display result

 */
package Strings.Level3;

import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Check palindrome using a loop
    public static boolean checkPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // Logic 2: Check palindrome using recursion
    public static boolean checkPalindromeRecursive(String text, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // Compare characters at start and end
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call
        return checkPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Reverse the string using charAt()
    public static String reverseString(String text) {
        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        return reverse;
    }

    // Check palindrome using character arrays
    public static boolean checkPalindromeUsingArrays(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text).toCharArray();

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Logic 1
        boolean result1 = checkPalindrome(text);

        // Logic 2
        boolean result2 = checkPalindromeRecursive(text, 0, text.length() - 1);

        // Logic 3
        boolean result3 = checkPalindromeUsingArrays(text);

        System.out.println("\nLogic 1 (Using Loop): "
                + (result1 ? "Palindrome" : "Not a Palindrome"));

        System.out.println("Logic 2 (Using Recursion): "
                + (result2 ? "Palindrome" : "Not a Palindrome"));

        System.out.println("Logic 3 (Using Character Arrays): "
                + (result3 ? "Palindrome" : "Not a Palindrome"));

        sc.close();
    }
}
