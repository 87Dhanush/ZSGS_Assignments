import java.util.*;

public class KgGarden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Map<Character, String> plant = new HashMap<>();
        plant.put('G', "Grass");
        plant.put('C', "Clover");
        plant.put('R', "Radish");
        plant.put('V', "Violet");

        // char[][] garden = new char[2][12];
        Map<String, List<String>> student = new LinkedHashMap<>();  // LinkedHashMap for ordered keys
        String[] studentNames = {"Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet", 
                                 "Ileana", "Joseph", "Kincaid", "Larry"};
        for (String name : studentNames) {
            student.put(name, new ArrayList<>());
        }
        
            char[][] garden = new char[2][24];
            System.out.println("Enter 24 garden symbols (12 symbols per row):");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 24; j++) {
                    garden[i][j] = sc.next().charAt(0);
                }
            }

        System.out.println(Arrays.deepToString(garden));
        int col = 0;
        for (String name : studentNames) {
            List<String> plantsList = student.get(name);
            // System.out.println(plantsList+""+garden[0][col]+""+plant.get(garden[0][col]));
            plantsList.add(plant.get(garden[0][col]));
            plantsList.add(plant.get(garden[0][col + 1]));
            plantsList.add(plant.get(garden[1][col]));
            plantsList.add(plant.get(garden[1][col + 1]));
            col += 2; 
        }
        System.out.println("Enter the child name: ");
        String studentName = sc.next();
        if (student.containsKey(studentName)) {
            System.out.println("Plants for " + studentName + ": " + student.get(studentName));
        } else {
            System.out.println("Student not found.");
        }
        
    }
}
