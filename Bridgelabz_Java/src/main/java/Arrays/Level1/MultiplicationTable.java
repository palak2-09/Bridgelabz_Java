/*
Create a program to print a multiplication table of a number.
Hint =>
Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 10
Run a loop from 1 to 10 and store the results in the multiplication table array
Finally, display the result from the array in the format number * i = ___
 */
package Arrays.Level1;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //taking input from the user
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        //create an array to store 10 elements
        int[] multiplication=new int[10];
        //calculate and store the multiplication results
        for(int i=1;i<=10;i++){
            multiplication[i-1]=number*i;
        }

        //display the multiplication results
        for(int i=1;i<=10;i++){
            System.out.println(number+" * "+i+" = "+multiplication[i-1]);
        }
        sc.close();
    }
}
