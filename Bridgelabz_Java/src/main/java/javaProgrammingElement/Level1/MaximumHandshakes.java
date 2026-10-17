package Level1;
import java.util.Scanner;
public class MaximumHandshakes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n=sc.nextInt();

        int combination= (n*(n-1))/2;

        System.out.println("The maximum number of handshakes possible are: "+combination);
    }
}
