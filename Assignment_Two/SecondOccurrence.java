import java.util.Scanner;

public class SecondOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the number to find its second occurrence:");
        int target = sc.nextInt();
        
        int occurrence = 0;
        
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                occurrence++;
                if (occurrence == 2) {
                    System.out.println("Second occurrence found at index: " + i);
                    return;
                }
            }
        }
        
        System.out.println("Second occurrence not found.");
    }
}
