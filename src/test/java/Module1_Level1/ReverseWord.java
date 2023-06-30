package Module1_Level1;
import java.util.Scanner;
public class ReverseWord {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word/sentence: ");

        String word = scan.nextLine();
        String rev = "";

        for (int i = word.length() - 1; i >= 0; i--){
            rev += word.charAt(i);
        }
        System.out.println("Reversed word: " + rev);
    }
}
