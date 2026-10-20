/*
Write a program to find the sum of n natural numbers using loop
Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop
 */
package Methods.Level1;
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static int sumNatural(int number){
        int sum=0;
        for(int i=1;i<=number;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //ask the user to input the number
        System.out.println("Enter a number:");
        int number=sc.nextInt();

        int result=sumNatural(number);
        //display the result
        System.out.println("The sum is: "+result);
        sc.close();
    }
}
