package StackQueue;

public class CircularTour {

    int findStartingPoint(int petrol[], int distance[]) {

        int n = petrol.length;

        int balance = 0;
        int deficit = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {

            balance = balance + petrol[i] - distance[i];

            if (balance < 0) {
                deficit = deficit + balance;
                start = i + 1;
                balance = 0;
            }
        }

        if (balance + deficit >= 0) {
            return start;
        }

        return -1;
    }

    public static void main(String[] args) {

        CircularTour obj = new CircularTour();

        int petrol[] = {4, 6, 7, 4};
        int distance[] = {6, 5, 3, 5};

        int result = obj.findStartingPoint(petrol, distance);

        if (result == -1) {
            System.out.println("Circular tour is not possible");
        } else {
            System.out.println("Starting petrol pump index: " + result);
        }
    }
}