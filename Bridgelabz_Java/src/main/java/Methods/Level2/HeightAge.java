/*
Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it
Hint =>
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Write a Method to find the youngest of the 3 friends
Write a Method to find the tallest of the 3 friends
 */
package Methods.Level2;
import java.util.Scanner;
public class HeightAge {
    public static int youngestFriend(int[] ages){
        int youngest=0;
        for(int i=0;i<ages.length;i++){
            if(ages[i]<ages[youngest]){
                youngest=i;
            }
        }
        return youngest;
    }
    public static int tallestFriend(double[] height){
        int tallest=0;
        for(int i=0;i<height.length;i++){
            if(height[i]>height[tallest]){
                tallest=i;
            }
        }
        return tallest;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] names={"Amar", "Akbar", "Anthony"};

        int[] ages=new int[3];
        double[] height=new double[3];

        for(int i=0;i<3;i++){
            System.out.println("The age of "+names[i]+" is: ");
            ages[i]=sc.nextInt();

            System.out.println("The height of "+names[i]+" is: ");
            height[i]=sc.nextDouble();
        }

        int youngestIndex=youngestFriend(ages);
        int tallestIndex=tallestFriend(height);

        //display the results
        System.out.println("The tallest friend is: "+names[tallestIndex]);
        System.out.println("The youngest friend is: "+names[youngestIndex]);
        sc.close();


    }
}
