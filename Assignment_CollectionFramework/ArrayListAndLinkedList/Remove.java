import java.util.*;

public class Remove{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(); 
        list.addAll(Arrays.asList(10,20,30,40,50));
        System.out.println("Original Arraylist : \n"+list);
        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()){
           int value=iterator.next(); 
           if(value>30){
                iterator.remove();
           }
        }
        System.out.print("\nModified ArrayList : ");
        System.out.println(list);
    }
}