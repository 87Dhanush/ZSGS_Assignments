import java.util.*;

public class CheckSizeVector {
    public static void main(String[] args) {
        Vector<Double> vector = new Vector<>();
        vector.add(2.5);
        vector.add(3.7);
        vector.add(10.5);
        vector.add(4.2);
        vector.add(7.1);
        boolean containsValue = vector.contains(10.5);
        System.out.println("Does the vector contain 10.5? " + containsValue);
        System.out.println("Size of the vector before adding: " + vector.size());
        vector.add(8.6);
        System.out.println("Size of the vector after adding: " + vector.size());
    }
}
