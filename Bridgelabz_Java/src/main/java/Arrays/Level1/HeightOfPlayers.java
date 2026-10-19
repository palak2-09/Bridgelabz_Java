/*
Create a program to find the mean height of players present in a football team.
Hint =>
The formula to calculate the mean is: mean = sum of all elements / number of elements
Create a double array named heights of size 11 and get input values from the user.
Find the sum of all the elements present in the array.
Divide the sum by 11 to find the mean height and print the mean height of the football team
 */
package Arrays.Level1;
import java.util.Scanner;
public class HeightOfPlayers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //defining an array of size 11
        double[] heights=new double[11];
        //storing the height of 11 players in an array
        for(int i=0;i<11;i++){
            System.out.print("Enter the height of player "+(i+1)+" : ");
            heights[i]=sc.nextDouble();
        }
        //calculating the sum of height of all players
        double sum=0;
        for(int i=0;i<11;i++){
            sum+=heights[i];
        }
        //finding the mean height by dividing the sum by 11
        double meanHeight=sum/11;
        System.out.println("The mean height of the football team is:"+meanHeight);
        sc.close();
    }
}
