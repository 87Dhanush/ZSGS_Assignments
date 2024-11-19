import java.util.*;

public class InsertAndRemoveVector {
    public static void main(String[] args) {
        Vector<Character> vector = new Vector<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));

        vector.insertElementAt('X', 2);

        vector.remove(0);
        System.out.println("Vector after insertion and removal: " + vector);
    }
}
