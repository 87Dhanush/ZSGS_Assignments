import java.util.*;
public class ToArray {
    public static void main(String[] args) {
    String[] array={"Apple","Banana","Cherry"};
    ArrayList<String> list=new ArrayList<>(Arrays.asList(array));
    System.out.println("Array to ArrayList : "+list);
    array=list.toArray(new String[0]);
    System.out.println("ArrayList to Array : "+Arrays.toString(array));

    }    
}
