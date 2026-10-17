package Level2;
import java.util.Scanner;
public class TravelComputation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the traveler's name:");
        String name=sc.nextLine();
        System.out.println("Enter the starting city:");
        String fromCity=sc.nextLine();
        System.out.println("Enter the city you will travel via:");
        String viaCity=sc.nextLine();
        System.out.println("Enter the destination city:");
        String toCity=sc.nextLine();

        //take the distance from start city to via city
        System.out.println("Enter the distance from start start to via city:");
        double distanceFromToVia=sc.nextDouble();

        System.out.println("Enter the time from start city to via city:");
        int timeFromToVia=sc.nextInt();

        System.out.println("Enter the distance from via city to destination city:");
        double distanceViaToFinalCity=sc.nextDouble();

        System.out.println("Enter the time from via city to final city:");
        int timeViaToFinalCity=sc.nextInt();

        double totalDistance=distanceFromToVia+distanceViaToFinalCity;
        int totalTime=timeFromToVia+timeViaToFinalCity;

        System.out.println("The total distance travlled by "+name+" from "
                +fromCity +" to "+toCity+" via "+viaCity+
                " is "+totalDistance+" km and "+
                "the Total Time taken is "+totalTime+" minutes");


    }
}
