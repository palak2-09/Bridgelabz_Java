package Level1;
import java.util.Scanner;
public class DistanceConversion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance in kilometers: ");
        double km=sc.nextDouble();

        double miles=1.6*km;

        System.out.println("The total miles is "+miles+
                " for the given "+km+" km");
    }
}
