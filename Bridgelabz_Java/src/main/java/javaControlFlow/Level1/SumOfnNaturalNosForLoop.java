/*
Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers.
Hint =>
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using for loop
Compare the two results and print the result
 */
package javaControlFlow.Level1;
import java.util.Scanner;
public class SumOfnNaturalNosForLoop {
    public static void main(String[] args){
        /*Calculate the sum of n natural numbers using a while loop
        and the formula n*(n+1)/2, then compare both results.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int n=sc.nextInt();
        //checking whether the number entered by the user is natural or not
        if(n<=0){
            System.out.println("Please enter a natural number.");
        }
        else{
            //applying the formula to find the sum of n natural numbers
            int formulaSum=n*(n+1)/2;

            //calculating the sum using for loop
            int sum=0;
            for(int i=1;i<=n;i++){
                sum+=i;
            }
            //display both the results
            System.out.println("Sum using the formula: "+formulaSum);
            System.out.println("Sum using while loop: "+sum);

            //compare both the results
            if(formulaSum==sum){
                System.out.println("Both computations are correct.");
            }
            else{
                System.out.println("Both computations are incorrect.");
            }
        }
    }
}
