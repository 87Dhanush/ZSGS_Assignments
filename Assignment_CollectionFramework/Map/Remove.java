import java.util.*;

public class Remove {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Jane", 9);
        map.put("Tom", 36);
        map.put("John", 89);
        if (map.containsKey("Tom")) {
            map.remove("Tom");
        }

        for (String name : map.keySet()) {
            System.out.println(name + " -> " + map.get(name));
        }
    }
}
