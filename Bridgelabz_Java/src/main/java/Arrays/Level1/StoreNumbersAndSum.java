/*
Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers
Hint =>
Create a variable to store an array of 10 elements of type double as well as a variable to store the total of type double initializes to 0.0. Also, the index variable is initialized to 0 for the array
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop
Also, break from the loop if the index has a value of 10 as the array size is limited to 10.
If the user entered a number other than 0 or a negative number inside the while loop then assign the number to the array element and increment the index value
Take another for loop to get the values of each element and add it to the total
Finally display the total value
 */
package Arrays.Level1;
import java.util.Scanner;
public class StoreNumbersAndSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //create an array to store upto 10 double numbers
        double[] numbers=new double[10];

        //initialize total and index
        double total=0.0;
        int index=0;
        //take input until 0, a negative number or 10
        while(true){
            System.out.print("Enter a positive number: ");
            double number=sc.nextDouble();

            //stop if the number is 0 or negative
            if(number<=0){
                break;
            }
            //stop if the array is full
            if(index==10){
                break;
            }
            //store the number and move to the next index
            numbers[index]=number;
            index++;
        }
        //display the numbers and calculate their sum
        System.out.println("Numbers entered: ");
        for(int i=0;i<index;i++){
            System.out.println(numbers[i]);
            total=total+numbers[i];
        }
        //display the total
        System.out.println("Sum = "+total);
        sc.close();
    }
}
