/*
Write a program to demonstrate IllegalArgumentException
Hint =>
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate IllegalArgumentException. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception. Use the try-catch block to handle the IllegalArgumentException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
 */
package Strings.Level1;

import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        int start = 4;
        int end = 2;

        if (start > end) {
            throw new IllegalArgumentException("Start index cannot be greater than end index");
        }

        System.out.println(text.substring(start, end));
    }

    // Method to handle the exception
    public static void handleException(String text) {
        int start = 4;
        int end = 2;

        try {
            if (start > end) {
                throw new IllegalArgumentException("Invalid substring indexes");
            }

            System.out.println(text.substring(start, end));

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled!");
            System.out.println(e.getMessage());

        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled!");
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        // Generate the exception
        try {
            System.out.println("Generating exception!");
            generateException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException occurred!");
        }

        // Handle the exception
        System.out.println("\nHandling exception!");
        handleException(text);

        System.out.println("\nProgram continues execution.");

        sc.close();
    }
}