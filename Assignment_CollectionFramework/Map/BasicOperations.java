import java.util.HashMap;

public class BasicOperations {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("SuryaPrakash", 30);
        map.put("Baby", 25);
        map.put("Chan", 35);
        map.put("Dhanush", 21);
        map.put("Walter", 40);

        System.out.println("Chan's age: " + map.get("Chan"));
        for (String name : map.keySet()) {
            System.out.println(name + " -> " + map.get(name));
        }
    }
}
