package Module1_Level1;
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the phrase: ");
        String ph = scanner.nextLine();

        String [] words = ph.split(" ");

        int maxLength = 0;
        String longWord = "";

        for (String word : words){
            if (word.length() > maxLength) {
                maxLength = word.length();
                longWord = word;
            }
        }
        System.out.println("Longest word of the phrase is: " + longWord);
    }
}
