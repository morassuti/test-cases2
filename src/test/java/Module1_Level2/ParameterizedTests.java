package Module1_Level2;

import org.example.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;



public class ParameterizedTests extends Calculator {

    @ParameterizedTest
    @MethodSource("addArguments")
    void testAdd(int a, int b, int resultSum){
        int sum = Calculator.add(a, b);
        assertEquals(resultSum, sum);
    }

    @ParameterizedTest
    @MethodSource("expoArguments")
    void testExpo(int base, int exponent, int resultExpo){
        int expon = Calculator.expo(base, exponent);
        assertEquals(resultExpo, expon);
    }


    @ParameterizedTest
    @ValueSource(ints = {3,9,15})
    void isDivisibleByThree(int number){
        assertEquals(0, number % 3);
    }

    private static Stream<Arguments>addArguments(){
        return Stream.of(
                Arguments.of(8, 8, 16),
                Arguments.of(90, 9, 99)
        );
    }

    private static Stream<Arguments>expoArguments(){
        return Stream.of(
                Arguments.of(3, 2, 9),
                Arguments.of(5, 3, 125)
        );
    }
}
