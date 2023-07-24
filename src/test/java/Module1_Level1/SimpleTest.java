package Module1_Level1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static Module1_Level1.Factorial.calculateFactorial;
import static Module1_Level1.Simple.getCharacterCount;
import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertEquals;

public class SimpleTest {

    @Test
    public void testCompareWords(){
        String word1 = "Java";
        String word2 = "Java";
        assertThat(word1).withFailMessage("Word 1 and Word 2 are not the same").isEqualTo(word2);
    }
    @Test
    public void getCharacterCountTest() {
        String input = "Hello";
        int actualCharacterCount = getCharacterCount(input);
        int expectedCharacterCount = 5;
        assertThat(actualCharacterCount).withFailMessage("The actual character count is: '%s', the expected is: '%s' for input '%s'", actualCharacterCount, expectedCharacterCount, input)
                .isEqualTo(expectedCharacterCount);
    }
    @Test
    public void testCalculateFactorial() {
        int input = 5;
        int expectedOutput = 120;
        int actualOutput = calculateFactorial(input);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test(dataProvider = "testData")
    public void testWordCompare(String text1, String text2){
        assertThat(text1).withFailMessage("Word 1 and Word 2 are not the same").isEqualTo(text2);
    }
    @DataProvider(name = "testData")
    public Object[][] testData(){
        return new Object[][]{
                {"Good", "Good"},
                {"Testing","Tests"}
        };
    }
}