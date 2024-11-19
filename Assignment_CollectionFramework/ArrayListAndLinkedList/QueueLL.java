import java.util.*;
public class QueueLL {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("Diana");
        System.out.println("Original Queue: " + queue);

        queue.poll(); 
        queue.poll(); 
        System.out.println("Queue after removal: " + queue);
    }
}
