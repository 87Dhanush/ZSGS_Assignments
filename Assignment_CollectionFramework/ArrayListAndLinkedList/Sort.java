import java.util.*;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a no of elements : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.print("Before sorted : "+list);
        Collections.sort(list);
        System.out.print("\nafter sorted : "+list);

    }
}
