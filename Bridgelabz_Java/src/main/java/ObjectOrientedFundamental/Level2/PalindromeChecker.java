/*
Program to Check Palindrome String
Problem Statement: 	Create a PalindromeChecker class with an attribute text. Add methods to:
Check if the text is a palindrome.
Display the result.
Explanation: The PalindromeChecker class holds the text attribute. The methods operate on this attribute to verify its palindrome status and display the result.

 */
package ObjectOrientedFundamental.Level2;
import java.util.Scanner;
public class PalindromeChecker {
    String text;

    //method to check if it is a palindrome
    boolean isPalindrome(){
        String reversed="";
        for(int i=text.length()-1;i>=0;i--){
            reversed+=text.charAt(i);
        }
        return reversed.equalsIgnoreCase(text);
    }
    //method to display the results
    void displayResult(){
        if(isPalindrome()){
            System.out.println(text+" is a palindrome.");
        }
        else{
            System.out.println(text+" is not a palindrome.");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        PalindromeChecker obj=new PalindromeChecker();
        System.out.println("Enter a string:");
        obj.text=sc.nextLine();

        //display the result
        obj.displayResult();

        sc.close();
    }
}
