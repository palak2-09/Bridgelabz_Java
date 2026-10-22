/*
Write a program to convert the complete text to lowercase and compare the results
Hint =>
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Upper Case. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toUpperCase() to get the Uppercase Text and compare the two strings using the user-defined method. And finally display the result

 */
package Strings.Level1;

import java.util.Scanner;

public class LowerCaseComparison {
    public static String convertToLowercase(String text){
        String result="";
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch=(char)(ch+32);
            }
            result+=ch;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the complete text:");
        String text = sc.nextLine();
        // Convert using the user-defined method
        String result1 = convertToLowercase(text);
        // Convert using the built-in method
        String result2 = text.toLowerCase();

        // Compare both strings using charAt()
        boolean isEqual = true;

        if (result1.length() != result2.length()) {
            isEqual = false;
        } else {
            for (int i = 0; i < result1.length(); i++) {
                if (result1.charAt(i) != result2.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        }

        System.out.println("Lowercase using charAt(): " + result1);
        System.out.println("Lowercase using toLowerCase(): " + result2);
        System.out.println("Are both results equal? " + isEqual);

        sc.close();
    }
}
