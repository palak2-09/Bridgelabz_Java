/*
Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
Hint =>
Take user input using the  Scanner next() method for 2 String variables
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String Built-In method to check if the results are the same and display the result
 */
package Strings.Level1;
import java.util.Scanner;
public class CompareStrings {
    public static boolean compareString(String str1, String str2){
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
        System.out.println("Enter string 1:");
        String str1=sc.next();
        System.out.println("Enter string 2:");
        String str2=sc.next();

        //compare using charAt()
        boolean result1=compareString(str1,str2);

        //compare using the built in equals() method
        boolean result2=str1.equals(str2);

        System.out.println("Result using charAt(): "+result1);
        System.out.println("Result using equals(): "+result2);

        //check whether both the methods give the same result
        if(result1==result2){
            System.out.println("Both methods give the same result.");
        }
        else{
            System.out.println("Both methods give different result.");
        }
        sc.close();
    }
}
