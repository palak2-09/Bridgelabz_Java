/*
1. Write a program to demonstrate ***NumberFormatException***

**Hint =>&#xA0;**

1. Define a variable to take user input as a String 
2. Use Integer.parseInt() to generate this exception. ***Integer.parseInt()*** is a built-in function in java.lang.Integer class to extract the number from text. In case the text does not contain numbers the method will throw NumberFormatException which is a runtime exception
3. Write a Method to generate the Exception. Use ***Integer.parseInt(text)*** to extract number from the text. This will generate a runtime exception and abruptly stop the program. 
4. Write the Method to demonstrate ***NumberFormatException***. Use ***Integer.parseInt(text)*** to extract number from the text. This will generate a runtime exception. Use the try-catch block to handle the ***NumberFormatException*** as well as the generic runtime exception
5. From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
 */
package Strings.Level1;

import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println(number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled!");

        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled!");
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

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred!");
        }

        // Handle the exception
        System.out.println("\nHandling exception!");
        handleException(text);

        System.out.println("Program continues execution.");

        sc.close();
    }
}