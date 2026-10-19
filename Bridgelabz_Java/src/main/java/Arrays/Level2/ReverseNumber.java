/*
Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
Hint =>
Take user input for a number.
Find the count of digits in the number.
Find the digits in the number and save them in an array
Create an array to store the elements of the digits array in reverse order
Finally, display the elements of the array in reverse order
 */
package Arrays.Level2;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //taking number as input from the user
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        //handle 0 separately
        if(number==0){
            System.out.println("Reversed number : 0");
            sc.close();
            return;
        }
        //store the original number in a temporary variable
        int temp=Math.abs(number);

        int count=0;

        //find the count of digits in the number
        while(temp!=0){
            temp=temp/10;
            count++;
        }

        temp=Math.abs(number);
        //defining an array to store the digit of the number
        int[] digits=new int[count];
        //putting the elements in an array
        for(int i=0;i<count;i++){
            digits[i]=temp%10;
            temp=temp/10;
        }

        System.out.println("Reversed number: ");
        if(number<0){
            System.out.println("-");
        }
        //displaying the reversed array
        for(int i=0;i<count;i++){
            System.out.print(digits[i]);
        }
        System.out.println();
        sc.close();
    }

}
