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

/*
Introduction

You work for a company that sells fonts through their website. They'd like to show a different sentence each time someone views a font on their website. To give a comprehensive sense of the font, the random sentences should use all the letters in the English alphabet.

They're running a competition to get suggestions for sentences that they can use. You're in charge of checking the submissions to see if they are valid.
Note

Pangram comes from Greek, παν γράμμα, pan gramma, which means "every letter".

The best known English pangram is:

    The quick brown fox jumps over the lazy dog.

Instructions

Your task is to figure out if a sentence is a pangram.

A pangram is a sentence using every letter of the alphabet at least once. It is case insensitive, so it doesn't matter if a letter is lower-case (e.g. k) or upper-case (e.g. K).

For this exercise, a sentence is a pangram if it contains each of the 26 letters in the English alphabet.
*/
