/*
1. Write a program to demonstrate ***ArrayIndexOutOfBoundsException***

**Hint =>&#xA0;**

1. Define a variable of array of names and take input from the user
2. Write a Method to generate the Exception. Here access index larger then the length of the array. This will generate a runtime exception and abruptly stop the program. 
3. Write the Method to demonstrate ***ArrayIndexOutOfBoundsException***. Here access index larger then the length of the array. This will generate a runtime exception. Use the try-catch block to handle the ***ArrayIndexOutOfBoundsException*** and the generic runtime exception
4. From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException */
package Strings.Level1;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }

    // Method to handle the exception
    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled!");

        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];

        System.out.println("Enter 3 names:");

        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }

        // Generate the exception
        try {
            System.out.println("Generating exception!");
            generateException(names);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
        }

        // Handle the exception
        System.out.println("\nHandling exception!");
        handleException(names);

        System.out.println("Program continues execution.");

        sc.close();
    }
}