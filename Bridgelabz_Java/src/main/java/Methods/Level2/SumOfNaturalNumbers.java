/*
Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct.
Hint =>
Take the user input number and check whether it's a Natural number, if not exit
Write a Method to find the sum of n natural numbers using recursion
Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2
Compare the two results and print the result
 */
package Methods.Level2;
import java.util.Scanner;
public class SumOfNaturalNumbers {
    //method to find the sum of n natural numbers using recursion
    public static int sumUsingRecursion(int n){
        //base condition
        if(n==0){
            return 0;
        }
        //recursive call
        return n+sumUsingRecursion(n-1);
    }
    //method to find the sum of natural numbers using formula
    public static int sumUsingFormula(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //taking input from the user
        System.out.println("Enter the natural number:");
        int n=sc.nextInt();

        if(n<=0){
            System.out.println("Invalid input! Please enter a natural number.");
            sc.close();
            return;
        }
        //calculate the sum using both the methods
        int recursiveSum=sumUsingRecursion(n);
        int formulaSum=sumUsingFormula(n);

        //display both the results
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        //comparing both the results
        if(recursiveSum==formulaSum){
            System.out.println("Both results are equal. The calculations are correct.");
        }
        else{
            System.out.println("Both results are different.");
        }
        sc.close();
    }


}
