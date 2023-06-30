package Module1_Level1;
import java.util.Scanner;
public class Capitalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String cap = scanner.nextLine();
        String capitalizedSentence = capitalizeWords(cap);
        System.out.println(capitalizedSentence);
    }

    public static String capitalizeWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder capitalizedSentence = new StringBuilder();

        for (String word : words) {
            String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
            capitalizedSentence.append(capitalizedWord).append(" ");
        }

        return capitalizedSentence.toString().trim();
    }
}

        


