package Collections.Queue;
import java.util.*;
public class HospitalTriage {
    public static void main(String[] args) {

        PriorityQueue<Map.Entry<String, Integer>> pq =
                new PriorityQueue<>(
                        (a, b) -> b.getValue() - a.getValue()
                );

        pq.add(new AbstractMap.SimpleEntry<>("John", 3));
        pq.add(new AbstractMap.SimpleEntry<>("Alice", 5));
        pq.add(new AbstractMap.SimpleEntry<>("Bob", 2));

        System.out.println("Treatment Order:");

        while (!pq.isEmpty()) {
            Map.Entry<String, Integer> patient = pq.poll();

            System.out.println(
                    patient.getKey() + " - Severity: " +
                            patient.getValue()
            );
        }
    }
}
