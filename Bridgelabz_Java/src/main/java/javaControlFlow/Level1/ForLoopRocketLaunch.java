/*
Rewrite program 8 to do the countdown using the for-loop
 */
package javaControlFlow.Level1;
import java.util.Scanner;
public class ForLoopRocketLaunch {
    public static void main(String[] args){
        /* take counter as input from user for countdown of the rocket launch
        decrement the counter until it is greater than or equal to 1
         */
        Scanner sc=new Scanner(System.in);
        //taking counter as input from the user
        System.out.println("Enter the start of the countdown:");
        int counter=sc.nextInt();

        //the loop will continue until the counter is greater than or equal to 1
        for(int i=counter;i>=1;i--){
            System.out.println(i);

        }
    }
}
