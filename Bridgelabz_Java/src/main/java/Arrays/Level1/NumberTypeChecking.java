/*
Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
Hint =>
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero.
Finally compare the first and last element of the array and display if they equal, greater or less

 */
package Arrays.Level1;
import java.util.Scanner;
public class NumberTypeChecking {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //defining an array containing 5 numbers
        int[] number=new int[5];
        //getting user input for the array
        for(int i=0;i<number.length;i++){
            System.out.println("Enter number "+(i+1)+" : ");
            number[i]=sc.nextInt();
        }
        //loop through the array to check if the number is positive, negative or zero
        for(int i=0;i<number.length;i++){
            if(number[i]>0){
                //if number is positive, check if it is odd or even
                if(number[i]%2==0){
                    System.out.println(number[i]+" is positive and even.");
                }
                else{
                    System.out.println(number[i]+" is positive and odd.");
                }
            }
            else if(number[i]<0){
                System.out.println(number[i]+" is negative.");
            }
            else {
                System.out.println(number[i]+" is zero.");
            }
        }
        //comparing the first and last element
        if(number[0]==number[number.length-1]){
            System.out.println("First and last elements are equal.");
        }
        else if(number[0]<number[number.length-1]){
            System.out.println("First element is smaller than the last element.");
        }
        else{
            System.out.println("First element is greater than the last element.");
        }
        sc.close();
    }
}
