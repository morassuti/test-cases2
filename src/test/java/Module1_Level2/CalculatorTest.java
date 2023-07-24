package Module1_Level2;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    @Test
    public void testAddition() {
        double result = Calculator.add(10, 5);
        assertThat(result).withFailMessage("10 + 5 should be 15").isEqualTo(15);
    }
    @Test
    public void testSubtraction() {
        double result = Calculator.subtract(10, 5);
        assertThat(result).withFailMessage("10 - 5 should be 5").isEqualTo(5);
    }
    @Test
    public void testMultiplication() {
        double result = Calculator.multiply(10, 5);
        assertThat(result).withFailMessage("10 * 5 should be 50").isEqualTo(50);
    }
    @Test
    public void testDivision() {
        double result = Calculator.divide(10, 5);
        assertThat(result).withFailMessage("10 / 5 should be 2").isEqualTo(2);
    }
}