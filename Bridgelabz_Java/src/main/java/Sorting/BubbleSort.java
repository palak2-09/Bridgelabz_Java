package Sorting;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n=sc.nextInt();

        int[] marks=new int[n];
        System.out.println("Enter student marks:");

        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }

        //bubble sort
        for(int i=0;i<n-1;i++){
            boolean swapped=false;

            for(int j=0;j<n-1-i;j++){
                if(marks[j]>marks[j+1]){
                    int temp=marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=temp;

                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println("Marks in ascending order :");
        for(int i=0;i<n;i++){
            System.out.print(marks[i]+" ");
        }
        sc.close();
    }
}
