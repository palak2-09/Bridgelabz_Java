/*
Create a program to find the factors of a number taken as user input, store the factors in an array and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results
Hint =>
Take the input for a number
Write a static Method to find the factors of the number and save them in an array and return the array.
To find factors and save to array will have two loops. The first loop to find the count and initialize the array with the count. And the second loop save the factors into the array
Write a method to find the sum of the factors using factors array
Write a method to find the product of the factors using factors array
Write a method to find the sum of square of the factors using Math.pow() method
 */
package Methods.Level2;
import java.util.Scanner;
public class FactorsOfNumber {
    //find all the factors of a number and store them in an array
    public static int[] findFactors(int number){
        int count=0;

        for(int i=1;i<=number;i++){
            if(number%i==0){
                count++;
            }
        }
        //create an array with the required size
        int[] factors=new int[count];
        int index=0;

        //store the factors in array
        for(int i=1;i<=number;i++){
            if(number%i==0){
                factors[index]=i;
                index++;
            }
        }
        return factors;
    }
    //method to find the sum of factors
    public static int sumOfFactors(int[] factors){
        int sum=0;
        for(int i=0;i<factors.length;i++){
            sum+=factors[i];
        }
        return sum;
    }
    //method to find the product of factors
    public static int productOfFactors(int[] factors){
        int prod=1;
        for(int i=0;i<factors.length;i++){
            prod*=factors[i];
        }
        return prod;
    }
    //method to find the sum of squares of factors
    public static int sumOfSquares(int[] factors){
        int sum=0;
        for(int i=0;i<factors.length;i++){
            sum+=Math.pow(factors[i],2);
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //taking input from the user
        System.out.println("Enter the number:");
        int number=sc.nextInt();

        int[] factors=findFactors(number);
        System.out.println("The factors are:");
        for(int i=0;i<factors.length;i++){
            System.out.print(factors[i]+" ");
        }
        //displaying the results
        System.out.println("The sum of factors is: "+sumOfFactors(factors));
        System.out.println("The product of factors is: "+productOfFactors(factors));
        System.out.println("The sum of square of factors is: "+sumOfSquares(factors));

        //close the scanner
        sc.close();
    }
}
