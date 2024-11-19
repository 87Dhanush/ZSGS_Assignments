import java.util.*;

public class ToArrayVector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(Arrays.asList("red", "green", "blue", "yellow"));

        String[] array = new String[vector.size()];
        vector.copyInto(array);
        System.out.println("Array after conversion from vector: " + Arrays.toString(array));
        Vector<String> newVector = new Vector<>(Arrays.asList(array));
        System.out.println("Vector after converting back from array: " + newVector);
    }
}
