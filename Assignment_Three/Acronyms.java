import java.util.*;
public class Acronyms{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an input : ");
        String input=sc.nextLine();
        boolean gate=true;
        StringBuilder output=new StringBuilder();
        for(int i=0;i<input.length();i++){
          char currentChar = input.charAt(i);
          if(gate && ((currentChar>='a' && currentChar<='z') ||(currentChar>='A' && currentChar<='Z'))){
            System.out.println(currentChar);
                 if(currentChar>='a' && currentChar<='z'){
                    output.append((char)(currentChar+'A'-'a'));// convert lower to upper
                 }
                 else{
                    output.append(currentChar);
                 }
                 gate=false;
          }
          if(input.charAt(i)=='-' || input.charAt(i)==' '){
            gate=true;
          }  
        }
        System.out.println("Acronym : "+output); 
    }
}