/*
Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors
Hint =>
Take the input for a number
Find the factors of the number and save them in an array. For this create integer variable maxFactor and initialize to 10, factors array of size maxFactor and index variable to reflect the index of the array.
To find factors loop through the numbers from 1 to the number, find the factors, and add them to the array element by incrementing the index. If the index is equal to maxIndex, then need factors array to store more elements
To store more elements, reset the maxIndex to twice its size, use the temp array to store the elements from the factors array, and eventually assign the factors array to the temp array
Finally, Display the factors of the number
 */
package Arrays.Level1;
import java.util.Scanner;
public class FactorsOfaNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //taking input for a number from the user
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        //checking whether the number is positive
        if(number<=0){
            System.out.println("Please enter a positive number.");
            sc.close();
            return;
        }
        //initialising the maximum size of an array
        int maxFactor=10;
        int[] factors=new int[maxFactor];

        //index to track the number of factors stored
        int index=0;
        //finding factors of the number
        for(int i=1;i<=number;i++){
            if(number%i==0){
                //checking whether the array is full
                if(index==maxFactor){
                    //doubling the array size
                    maxFactor=maxFactor*2;
                    //creating a temporary array
                    int[] temp=new int[maxFactor];
                    //copying the existing factors
                    for(int j=0;j<factors.length;j++){
                        temp[j]=factors[j];
                    }
                    //assigning the bigger array
                    factors=temp;
                }
                //storing the factor in the array
                factors[index]=i;
                index++;
            }
        }
        //displaying the fcators
        System.out.println("The factors of "+number+" are:");
        for(int i=0;i<index;i++){
            System.out.print(factors[i]+" ");
        }
        sc.close();
    }
}
