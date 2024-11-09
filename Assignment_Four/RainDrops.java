
import java.util.*;
public class RainDrops {

    public static String convert(int number) {
        StringBuilder result = new StringBuilder();

        if (number % 3 == 0) {
            result.append("Pling");
        }
        if (number % 5 == 0) {
            result.append("Plang");
        }
        if (number % 7 == 0) {
            result.append("Plong");
        }
        if (result.length() == 0) {
            return Integer.toString(number);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the number : ");
        int number=sc.nextInt();
        System.out.println(convert(number));
    }
}
