import java.util.*;
public class MergeMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("b", 3);
        map2.put("c", 4);
        for (String key : map2.keySet()) {
            map1.put(key, map2.get(key));
        }
        for (String key : map1.keySet()) {
            System.out.println(key + " -> " + map1.get(key));
        }
    }
}
