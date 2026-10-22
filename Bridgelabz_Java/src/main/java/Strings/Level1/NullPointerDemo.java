/*
Write a program to demonstrate NullPointerException.
Hint =>
Write a Method to generate the Exception. Here define the variable text and initialize it to null. Then call one of the String Method to generate the exception
Write the Method to demonstrate NullPointerException. Here define the variable text and initialize it to null. Then write try catch block for handling the Exception while accessing one of the String method
From the main Firstly call the method to generate the Exception then refactor the code to call the method to handle the RuntimeException
 */
package Strings.Level1;
public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;

        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled!");
            System.out.println("Error: Cannot call a method on a null reference.");
        }
    }

    public static void main(String[] args) {

        // First, generate the exception
        try {
            System.out.println("Generating Exception:");
            generateException();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred!");
        }

        // Then, handle the exception inside the method
        System.out.println("\nHandling Exception:");
        handleException();

        System.out.println("\nProgram continues execution.");
    }
}