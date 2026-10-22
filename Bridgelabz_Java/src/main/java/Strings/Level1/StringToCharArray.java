/*
Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
Hint =>
Take user input using the  Scanner next() method to take the text into a String variable
Write a method to return the characters in a string without using the toCharArray()
Write a method to compare two string arrays and return a boolean result
In the main() call the user-defined method and the String built-in ​​toCharArray() method, compare the 2 arrays, and finally display the result
 */
package Strings.Level1;
import java.util.Scanner;
public class StringToCharArray {
    //method to return the characters in a string without toCharArray()
    public static char[] getCharacters(String str){
        char[] characters=new char[str.length()];
        for(int i=0;i<str.length();i++){
            characters[i]=str.charAt(i);
        }
        return characters;
    }
    //method to compare two character arrays
    public static boolean compareArrays(char[]arr1, char[]arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();
        //convert using the string defined method
        char[] result1=getCharacters(str);
        // Convert using the built-in toCharArray() method
        char[] result2=str.toCharArray();

        //compare both character arrays
        boolean result=compareArrays(result1,result2);

        // Display results
        System.out.print("Characters using user-defined method: ");
        System.out.println(result1);

        System.out.print("Characters using toCharArray(): ");
        System.out.println(result2);

        System.out.println("Are both character arrays equal? " + result);
        sc.close();
    }
}
