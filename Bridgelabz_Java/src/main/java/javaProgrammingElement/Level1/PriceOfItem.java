package Level1;
import java.util.Scanner;
public class PriceOfItem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the unit price of an item:");
        int unitPrice=sc.nextInt();
        System.out.println("Enter the quantity of the given item:");
        int quantity=sc.nextInt();

        int totalPurchasePrice=unitPrice*quantity;
        System.out.println("The total purchase price is INR "+totalPurchasePrice+
                " if the quantity "+quantity+" and unit price is INR "+unitPrice);
    }
}
