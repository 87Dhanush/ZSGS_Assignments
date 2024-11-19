import java.util.Arrays;
import java.util.LinkedList;

public class AddLL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(10,20,30,40,50));
        
        int firstElement = list.getFirst();
        System.out.println("First element: " + firstElement);
        
        int lastElement = list.getLast();
        System.out.println("Last element: " + lastElement);
    }
}
