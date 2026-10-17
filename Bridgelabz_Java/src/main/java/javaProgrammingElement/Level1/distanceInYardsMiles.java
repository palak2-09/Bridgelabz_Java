package Level1;
import java.util.Scanner;
public class distanceInYardsMiles {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the distance in feet:");

        double distanceInFeet=sc.nextDouble();
        double distanceInYards=3*distanceInFeet;
        double distanceInMiles=1760*distanceInYards;

        System.out.println("The distance in feet is "+distanceInFeet+
                " while in yards is "+distanceInYards+" and miles is "+distanceInMiles);

    }
}
