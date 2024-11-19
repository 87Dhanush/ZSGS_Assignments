import java.util.*;

public class Retrieve{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(); 
        list.addAll(Arrays.asList("Apple","Banana","Papaya","Kiwi","Orange"));
        System.out.println("All fruits in the Arraylist");
        for(String fruit:list){
            System.out.print(fruit+" ");
        }
        System.out.print("\nThird fruit in the ArrayList : ");
        System.out.println(list.get(2));
    }
}