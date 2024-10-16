import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SumMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the level completed: ");
        int level = sc.nextInt();

        System.out.print("Enter the number of magical items found: ");
        int numberOfItems = sc.nextInt();
        
        int[] baseValues = new int[numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            System.out.print("Enter base value for magical item " + (i + 1) + ": ");
            baseValues[i] = sc.nextInt();
        }
        int output = sumOfMultiply(level, baseValues);
        System.out.println("Energy points awarded: " + output);
    }

    public static int sumOfMultiply(int level, int[] baseValues) {
        Set<Integer> multiples = new HashSet<>();

        for (int baseValue : baseValues) {
            for (int multiple = baseValue; multiple < level; multiple += baseValue) {
                multiples.add(multiple);
            }
        }

        int sum = 0;
        for (int num : multiples) {
            sum += num;
        }
        
        return sum;
    }
}
