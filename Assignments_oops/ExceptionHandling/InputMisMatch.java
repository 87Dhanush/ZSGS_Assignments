import java.util.*;

public class InputMisMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter a number: ");
            int input = scanner.nextInt();
            System.out.println("Your input number is " + input);
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Enter digits only");
        } finally {
            scanner.close();
        }
    }
}
