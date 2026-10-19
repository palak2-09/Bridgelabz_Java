/*
Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
Hint =>
Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
Finally, display the result from the array in the format number * i = ___

 */
package Arrays.Level1;
import java.util.Scanner;
public class MultiplicationTableFrom6To9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //taking an integer input from the user
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        //creating a multiplicationResult array to store the result of multiplication of numbers
        int[] multiplicationResult=new int[4];

        //storing the result in array
        for(int i=6;i<=9;i++){
            multiplicationResult[i-6]=number*i;
        }
        //diplaying the multiplication table
        for(int i=6;i<=9;i++){
            System.out.println(number+" * "+i+" = "+multiplicationResult[i-6]);
        }
        sc.close();
    }
}
