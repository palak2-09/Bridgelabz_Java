package Collections.Map;
import java.util.*;

public class KeyWithHighestValue {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        int max = Integer.MIN_VALUE;
        String result = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        System.out.println("Key with highest value: " + result);
    }
}