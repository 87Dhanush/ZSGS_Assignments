import java.util.*;

public class IterateAndModifyVector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(Arrays.asList("apple", "banana", "cherry", "date", "fig"));

        Enumeration<String> enumeration = vector.elements();
        System.out.println("Original vector elements:");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        int index = vector.indexOf("cherry");
        if (index != -1) {
            vector.set(index, "coconut");
        }

        System.out.println("Modified vector: " + vector);
    }
}
