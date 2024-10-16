import java.util.*;
public class Pangram {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter an input word : ");
        String input=sc.nextLine().toLowerCase();
        int[] letters=new int[26];
        int count=0;

        for (int idx = 0; idx < input.length(); idx++) {
            if(input.charAt(idx)==' '){continue;}
            if(letters[input.charAt(idx)-'a']==0){
                count++;
              }
            letters[input.charAt(idx)-'a']++;
            
        }
        // System.out.println(Arrays.toString(letters));
        if(count==26){
            System.out.println("It's a pangram ");
        }
        else{
            System.out.println("It's not a pangram ");
        }
    }
}
