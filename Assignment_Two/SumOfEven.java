import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 != 0) {
                continue; 
            }
            sum += arr[i];
        }
        
        System.out.println("Sum of even numbers: " + sum);
    }
}
