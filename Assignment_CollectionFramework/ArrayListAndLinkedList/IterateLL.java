import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addAll(Arrays.asList("ONE","TWO","three"));
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("three")) {
                iterator.set("THREE"); 
            }
        }

        System.out.println("Modified List: " + list);
    }
}
