/*
Create a program to store the digits of the number in an array and find the largest and second largest element of the array.
Hint =>
Create a number variable and Take user input.
Define an array to store the digits. Set the size of the array to maxDigit variable initially set to 10
Create an integer variable index with the value 0 to reflect the array index.
Use a loop to iterate until the number is not equal to 0.
Remove the last digit from the number in each iteration and add it to the array.
Increment the index by 1 in each iteration and if the index count equals maxDigit then break out of the loop and the remaining digits are not added to the array
Define variable to store largest and second largest digit and initialize it to zero
Loop through the array and use conditional statements to find the largest and second largest number in the array
Finally display the largest  and second-largest number
 */
package Arrays.Level2;
import java.util.Scanner;
public class LargestAndSecondLargestInArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //take number as input
        System.out.println("Enter the number:");
        int number=sc.nextInt();

        //define an array to store the digits
        int maxDigit=10;
        int[] digits=new int[maxDigit];
        int index=0;

        //extract digits and store them in an array
        while(number!=0 && index<maxDigit){
            int digit=number%10;
            digits[index]=digit;
            number=number/10;
            index++;
        }
        //initialise largest and secondlargest digits
        int largestDigit=-1;
        int secondLargestDigit=-1;

        for(int i=0;i<index;i++){
            if(digits[i]>largestDigit){
                secondLargestDigit=largestDigit;
                largestDigit=digits[i];
            }
            else if(digits[i]>secondLargestDigit && digits[i]<largestDigit){
                secondLargestDigit=digits[i];
            }
        }
        //display the results
        if(index==0){
            System.out.println("No digits found.");
        }
        else{
            System.out.println("Largest Digit= "+largestDigit);

            if(secondLargestDigit==-1){
                System.out.println("There is no second largest distinct digit.");
            }
            else{
                System.out.println("Second Largest Digit= "+secondLargestDigit);
            }
        }
        sc.close();
    }
}
