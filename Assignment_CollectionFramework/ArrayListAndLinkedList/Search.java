import java.util.*;

public class Search {
    public static void main(String[] args) {
        ArrayList<Character> charList = new ArrayList<>();
        charList.addAll(Arrays.asList('A','B','C','D','E','F'));
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a character : ");
        char target=sc.nextLine().charAt(0);
        int index =charList.indexOf(target);
        if (index != -1) {
            System.out.println("Character '" +target+ "' found at index: " + index);
        } else {
            System.out.println("Character '" +target+ "' not found.");
        }

    }
}
