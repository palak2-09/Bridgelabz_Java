/*
Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint =>
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
Finally display the youngest and tallest of the 3 friends
 */
package Arrays.Level2;
import java.util.Scanner;
public class YoungestAndTallestFriends {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //creating an array of string type to store the names
        String[] names={"Amar, Akbar, Anthony"};

        //array to store the ages and heights
        int[] ages=new int[3];
        double[] heights=new double[3];

        //take input for ages and height
        for(int i=0;i<3;i++){
            System.out.print("Enter the age of "+names[i]+": ");
            ages[i]=sc.nextInt();

            System.out.println("Enter the height of "+names[i]+" : ");
            heights[i]=sc.nextDouble();
        }
        //assume the first friend is the youngest and tallest
        int youngestIndex=0;
        int tallestIndex=0;
        //find the youngest and the tallest friend
        for(int i=1;i<3;i++){
            if(ages[i]<ages[youngestIndex]){
                youngestIndex=i;
            }
            if(heights[i]>heights[tallestIndex]){
                tallestIndex=i;
            }
        }
        //display the results
        System.out.println("\nYoungest friend: "+names[youngestIndex]);
        System.out.println("Age: " + ages[youngestIndex]);

        System.out.println("\nTallest Friend: " + names[tallestIndex]);
        System.out.println("Height: " + heights[tallestIndex] + " cm");

        sc.close();
    }
}
