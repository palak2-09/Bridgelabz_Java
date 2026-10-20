/*
Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
Hint =>
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Write the method to find the number of chocolates each child gets and number of remaining chocolates
public static int[] findRemainderAndQuotient(int number, int divisor)
 */
package Methods.Level1;
import java.util.Scanner;
public class ChocolatesDivision {
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int remainder=number%divisor;
        int quotient=number/divisor;

        return new int[]{remainder,quotient};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //taking input from the user
        System.out.println("Enter the number of chocolates:");
        int numberOfChocolates=sc.nextInt();
        System.out.println("Enter the number of children:");
        int numberOfChildren=sc.nextInt();
        //call the method and store the returned values
        int[] results=findRemainderAndQuotient(numberOfChocolates,numberOfChildren);
        System.out.println("The number of chocolates that each child will get is: "+results[1]);
        System.out.println("The chocolates left are: "+results[0]);
        //close the scanner
        sc.close();
    }

}
