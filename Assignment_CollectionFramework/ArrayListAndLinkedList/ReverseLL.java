public class ReverseLL {
    
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        head = addAtBeginning(head, 'A');
        head = addAtBeginning(head, 'B');
        head = addAtBeginning(head, 'C');
        head = addAtBeginning(head, 'D');
        head = addAtBeginning(head, 'E');

        System.out.println("Original LinkedList:");
        printList(head);

        head = reverseLinkedList(head);

        System.out.println("Reversed LinkedList:");
        printList(head);
    }

    public static Node addAtEnd(Node head, char data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            // Add the new node at the end
            current.next = newNode;
        }

        return head;
    }

    public static Node addAtBeginning(Node head, char data) {
        Node newNode = new Node(data);

        // New node points to the current head
        newNode.next = head;
        head = newNode; // Make the new node the head of the list

        return head;
    }
    public static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;  // Save next node
            current.next = prev;  // Reverse current node's link
            prev = current;       // Move prev and current one step forward
            current = next;
        }

        // After the loop, prev will be the new head
        return prev;
    }
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
