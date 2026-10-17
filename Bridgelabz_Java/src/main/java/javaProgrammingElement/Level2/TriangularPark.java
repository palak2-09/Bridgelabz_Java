package Level2;
import java.util.Scanner;
public class TriangularPark {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side1 of triangle:");
        int side1=sc.nextInt();
        System.out.println("Enter the side2 of triangle:");
        int side2=sc.nextInt();
        System.out.println("Enter the side3 of triangle:");
        int side3=sc.nextInt();

        int perimeter=side1+side2+side3;

        double rounds=5000.0/perimeter;
        System.out.println("The total number of rounds the athlete will run is "+
                rounds+" to complete 5km");

    }
}
