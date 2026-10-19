/*
Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
Hint =>
Take the input for a number
Find the count of digits in the number
Find the digits in the number and save them in an array
Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
Display the frequency of each digit in the number
 */
package Arrays.Level2;
import java.util.Scanner;
public class FrequencyOfEachDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //ask the user to input the number
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        //handle zero separately
        if(number==0){
            System.out.println("Digit 0 occurs 1 time.");
            sc.close();
            return;
        }
        //convert the number to its absolute value
        int temp=Math.abs(number);

        //find the count of digits
        int count=0;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        //create an array to store the digits
        int[] digits=new int[count];
        //reset temp to the original number
        temp=Math.abs(number);

        for(int i=0;i<count;i++){
            digits[i]=temp%10;
            temp=temp/10;
        }
        //create a frequency array for digits 0 to 9
        int[] frequency=new int[10];
        //count the frequency of each digit
        for(int i=0;i<count;i++){
            frequency[digits[i]]++;
        }

        //display the frequency of each digit present
        for(int i=0;i<10;i++){
            if(frequency[i]>0){
                System.out.println("The frequency of "+i+" is: "+frequency[i]);
            }
        }
    }
}
