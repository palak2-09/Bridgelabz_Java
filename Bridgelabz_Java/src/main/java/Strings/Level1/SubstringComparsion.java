/*
Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
Hint =>
Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result
 */
package Strings.Level1;
import java.util.Scanner;
public class SubstringComparsion {
    //method to create a substring using charAt()
    public static String createSubstring(String str, int start, int end){
        String result="";
        for(int i=start;i<end;i++){
            result=result+str.charAt(i);
        }
        return result;
    }
    //method to compare two strings
    public static boolean compareStrings(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();

        System.out.println("Enter the start index:");
        int start=sc.nextInt();

        System.out.println("Enter the end index:");
        int end=sc.nextInt();

        //validate the index
        if(start<0||end>str.length()||start>=end){
            System.out.println("Invalid start or end index.");
        }
        else{
            // Create substring using charAt()
            String result1=createSubstring(str,start,end);
            // Create substring using built-in substring()
            String result2=str.substring(start,end);

            //compare both the results
            boolean result3=compareStrings(result1,result2);

            System.out.println("Substring using charAt(): " + result1);
            System.out.println("Substring using substring(): " + result2);
            System.out.println("Are both substrings equal? " + result3);
        }

    }
}
