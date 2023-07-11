package Module1_Level1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Factorial {
    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    @Test
    public void testFactorialCalculation() {
        int result = Factorial.calculateFactorial(5);
        Assert.assertEquals(result, 120, "Factorial calculation is incorrect");
    }
}

