package Module1_Level1;

import java.util.Scanner;

public class reverseWord {

    public static void main(String[] args){
        // Scanner class allows to read user input data
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word/sentence: ");
        // nextLine reads the next line of text as a String
        String word = scan.nextLine();
        // Empty string called rev
        String rev = "";
        // Loop to iterate over the characters in reverse order
        for (int i = word.length() - 1; i >= 0; i--){
            //get the character at current index and add to the "rev" variable
            rev += word.charAt(i);
        }
        System.out.println("Reversed word: " + rev);
    }
}
