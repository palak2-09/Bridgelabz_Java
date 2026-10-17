package Level2;
import java.util.Scanner;
public class DivideChocolates {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of chocolates:");
        int numberOfChocolates=sc.nextInt();
        System.out.println("Enter the number of children:");
        int numberOfChildren=sc.nextInt();

        int chocolatesEachChildGets=numberOfChocolates/numberOfChildren;
        int chocolatesLeft=numberOfChocolates% numberOfChildren;
        System.out.println("The number of chocolates each child gets is "+
                chocolatesEachChildGets+" and the number of remaining chocolates are "+
                chocolatesLeft);
    }
}
