/*
Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().
Hint =>
Write a method that generates array of 4 digit random numbers given the size as a parameter as shown in the method signature
public int[] generate4DigitRandomArray(int size)
Write a method to find average, min and max value of an array
public double[] findAverageMinMax(int[] numbers)
 */
package Methods.Level2;
import java.util.Scanner;
public class RandomNumber {
    //method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size){
        int[] numbers=new int[size];
        for(int i=0;i<size;i++){
            //generate a random number between 1000 and 9999
            numbers[i]=(int)(Math.random()*9000)+1000;
        }
        return numbers;
    }

    //method to find average, minimum and maximum
    public double[] findAverageMinMAx(int[] numbers){
        double sum=0;
        int min=numbers[0];
        int max=numbers[0];
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
            min=(int)Math.min(min,numbers[i]);
            max=(int)Math.max(max,numbers[i]);
        }
        double average=sum/ numbers.length;
        return new double[]{average,min,max};
    }
    public static void main(String[] args){
        RandomNumber obj=new RandomNumber();
        //generate five random number
        int[] numbers=obj.generate4DigitRandomArray(5);
        System.out.println("Five 4-digit random numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // Calculate average, minimum, and maximum
        double[] result = obj.findAverageMinMAx(numbers);

        System.out.println("\nAverage = " + result[0]);
        System.out.println("Minimum = " + (int) result[1]);
        System.out.println("Maximum = " + (int) result[2]);
    }
}
