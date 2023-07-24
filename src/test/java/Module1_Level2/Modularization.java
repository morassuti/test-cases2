package Module1_Level2;

import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Modularization {

    private final int factorial;
    private final int expnumber;

    public Modularization(int factorial, int expnumber) {
        this.factorial = factorial;
        this.expnumber = expnumber;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {1, 2},
                {2, 3},
                {6, 4},
                {24, 5},
                {120, 6}

        });
    }

    @Test
    public void testFactorial() {
        int number = calculateFac(factorial);
        assertEquals(expnumber, number);
    }

    private int calculateFac(int factorial) {
        int number = 0;
        int currentFact = 1;

        while (currentFact <= factorial) {
            number++;
            currentFact *= number;

        }
        return number;
    }
}
