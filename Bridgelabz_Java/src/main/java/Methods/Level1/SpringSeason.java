/*
Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false
 */
package Methods.Level1;
import java.util.Scanner;
public class SpringSeason {
    public static boolean checkSpringSeason(int month, int day){
        //spring season starts on March 20 and ends on June 20
        if((month==3 && day>=20 && day<=31)
                ||(month==4 && day>=1 && day<=30)
                ||(month==5 && day>=1 && day<=31)
                ||(month==6 && day>=1 && day<=20)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //take month input
        System.out.println("Enter month(1-12)");
        int month=sc.nextInt();

        //take day input
        System.out.println("Enter day:");
        int day=sc.nextInt();

        boolean result=checkSpringSeason(month,day);
        //display the result
        if(result){
            System.out.println("Its a Spring Season.");
        }
        else{
            System.out.println("Not a Spring Season");
        }
        //close the scanner
        sc.close();
    }

}
