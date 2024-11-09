import java.util.*;

public class ResistorColorTrio {
    private static final Map<String, Integer> colorValues = Map.of(
        "black", 0,
        "brown", 1,
        "red", 2,
        "orange", 3,
        "yellow", 4,
        "green", 5,
        "blue", 6,
        "violet", 7,
        "grey", 8,
        "white", 9
    );

    public static String calculateResistance(String color1, String color2, String multiplierColor) {
        int firstDigit = colorValues.get(color1);
        int secondDigit = colorValues.get(color2);
        int multiplier = colorValues.get(multiplierColor);

        int baseValue = firstDigit * 10 + secondDigit;
        int resistanceValue = baseValue * (int) Math.pow(10, multiplier);

        if (resistanceValue >= 1_000_000) {
            return (resistanceValue / 1_000_000) + " megaohms";
        } else if (resistanceValue >= 1_000) {
            return (resistanceValue / 1_000) + " kiloohms";
        } else {
            return resistanceValue + " ohms";
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter three colors ");
        String color1=sc.nextLine();
        String color2=sc.nextLine();
        String color3=sc.nextLine();
        System.out.println(calculateResistance(color1,color2,color3));
    }
}
