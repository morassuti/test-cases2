package Module1_Level1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LongestWord {
    public static String findLongestWord(String phrase) {
        String[] words = phrase.split(" ");
        int maxLength = 0;
        String longWord = "";

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longWord = word;
            }
        }
        return longWord;
    }
    @Test
    public void testFindLongestWord() {
        String phrase = "Helo";
        String result = LongestWord.findLongestWord(phrase);
        Assert.assertEquals(result, "Hello", "Incorrect longest word found");
    }
}