/*
1. Write a program to convert the complete text to uppercase and compare the results

**Hint =>&#xA0;**

1. Take user input using the  ***Scanner*** ***nextLine()*** method to take the complete text into a String variable
2. Write a method using the String built-in ***charAt()*** method to convert each character if it is lowercase to the Upper Case. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
3. Write a method to compare two strings using the charAt() method and return a boolean result
4. In the main() use the String built-in method ***toLowerCase()*** to get the Uppercase Text and compare the two strings using the user-defined method. And finally display the result
 */
package Strings.Level1;
import java.util.Locale;
import java.util.Scanner;
public class UpperCaseComparison {
    //convert text to uppercase using charAt()
    public static String convertToUppercase(String text){
        String result="";
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch>='a' && ch<='z'){
                ch=(char)(ch-32);
            }
            result=result+ch;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the complete text:");
        String text=sc.nextLine();

        //user defined method
        String result1=convertToUppercase(text);

        //built in method
        String result2=text.toUpperCase();

        // Compare directly in main()
        boolean isEqual=true;

        if(result1.length()!=result2.length()){
            isEqual=false;
        }
        else{
            for(int i=0;i<result1.length();i++){
                if(result1.charAt(i)!=result2.charAt(i)){
                    isEqual=false;
                    break;
                }
            }
        }
        System.out.println("Uppercase using charAt(): " + result1);
        System.out.println("Uppercase using toUpperCase(): " + result2);
        System.out.println("Are both results equal? " + isEqual);

        sc.close();
    }
}
