package Collections.Map;
import java.util.*;

public class MergeMap {
    public static void main(String[] args) {

        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        HashMap<String, Integer> result = new HashMap<>(map1);

        for (String key : map2.keySet()) {
            result.merge(key, map2.get(key), Integer::sum);
        }

        System.out.println(result);
    }
}
