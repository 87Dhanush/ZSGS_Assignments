import java.util.*;
public class RnaTranscription {
    
    public static String transcribe(String dnaStrand) {
        StringBuilder rnaStrand = new StringBuilder();
        
        for (char nucleotide : dnaStrand.toCharArray()) {
            switch (nucleotide) {
                case 'G':
                    rnaStrand.append('C');
                    break;
                case 'C':
                    rnaStrand.append('G');
                    break;
                case 'T':
                    rnaStrand.append('A');
                    break;
                case 'A':
                    rnaStrand.append('U');
                    break;
                default:
                    throw new IllegalArgumentException("Invalid DNA nucleotide: " + nucleotide);
            }
        }
        
        return rnaStrand.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an input ");
        String input=sc.nextLine();
        System.out.println(transcribe(input));
    }
}
