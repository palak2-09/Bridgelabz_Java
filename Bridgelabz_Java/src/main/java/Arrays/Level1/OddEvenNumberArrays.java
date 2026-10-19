/*
Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array
Hint =>
Get an integer input from the user, assign it to a variable number, and check for Natural Number. If not a natural number then print an error and exit the program
Create an integer array for even and odd numbers with size = number / 2 + 1
Create index variables for odd and even numbers and initialize them to zero
Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the corresponding array
Finally, print the odd and even numbers array using the odd and even index
 */
package Arrays.Level1;
import java.util.Scanner;
public class OddEvenNumberArrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //taking number as input from the user
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        //checking whether the number is a natural number
        if(number<1){
            System.out.println("Error: Please enter a natural number.");
            sc.close();
            return;
        }

        //creating 2 separate arrays to store odd and even numbers
        int[] odd=new int[number/2+1];
        int[] even=new int[number/2+1];

        //initialising index variables
        int evenIndex=0;
        int oddIndex=0;

        //storing odd and even numbers in separate arrays
        for(int i=1;i<=number;i++){
            if(i%2==0){
                even[evenIndex]=i;
                evenIndex++;
            }
            else{
                odd[oddIndex]=i;
                oddIndex++;
            }
        }
        //printing the odd numbers
        System.out.println("Odd Numbers:");

        for(int i=0;i<oddIndex;i++){
            System.out.print(odd[i]+" ");
        }

        //printing the even numbers
        System.out.println("\nEven Numbers:");

        for(int i=0;i<evenIndex;i++){
            System.out.print(even[i]+" ");
        }

        sc.close();
    }
}
