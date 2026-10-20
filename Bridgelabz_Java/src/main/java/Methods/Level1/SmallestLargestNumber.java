/*
Write a program to find the smallest and the largest of the 3 numbers.
Hint =>
Take user input for 3 numbers
Write a single method to find the smallest and largest of the three numbers
public static int[] findSmallestAndLargest(int number1, int number2, int number3)
 */
package Methods.Level1;
import java.util.Scanner;
public class SmallestLargestNumber {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        //assume the first number to be the smallest and the largest
        int smallest=number1;
        int largest=number1;

        //check whether the second number is smaller or larger
        if(number2<smallest){
            smallest=number2;
        }
        if(number2>largest){
            largest=number2;
        }
        //check whether the third number is smaller or larger
        if(number3<smallest){
            smallest=number3;
        }
        if(number3>largest){
            largest=number3;
        }
        //store both the results in an array
        return new int[]{smallest,largest};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //take three numbers as input
        System.out.println("Enter number 1:");
        int number1=sc.nextInt();
        System.out.println("Enter number 2:");
        int number2=sc.nextInt();
        System.out.println("Enter number 3:");
        int number3=sc.nextInt();

        int[] results=findSmallestAndLargest(number1, number2, number3);
        System.out.println("The smallest number is: "+results[0]);
        System.out.println("The largest number is: "+results[1]);

        sc.close();
    }


}
