/*
Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
Hint =>
Create a String Array to save the results and
Finally, loop again to show the results of the array based on the index position
 */
package Arrays.Level1;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //taking input from the user
        System.out.println("Enter a positive number:");
        int number=sc.nextInt();

        //checking whether the number is positive
        if(number<=0){
            System.out.println("Error: Please enter a positive number.");
            sc.close();
            return;
        }
        //creating a string array to store the results from 0 to number
        String[] results=new String[number+1];

        //checking each number and storing the results
        for(int i=0;i<=number;i++){
            if(i%3==0 && i%5==0){
                results[i]="FizzBuzz";
            }
            else if(i%3==0){
                results[i]="Fizz";
            }
            else if(i%5==0){
                results[i]="Buzz";
            }
            else{
                results[i]=String.valueOf(i);
            }
        }
        //printing the results with their positions
        for(int i=0;i<=number;i++){
            System.out.println("Position: "+(i+1)+" = "+results[i]);
        }
        sc.close();


    }
}
