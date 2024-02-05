package lambdas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class OddNumbersAverageCalculatorTest {

    @Test
    public void testCalculateAverageOfOddSquares() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        double result = OddNumbersAverageCalculator.calculateAverageOfOddSquares(numbers);

        // The expected result is the average of the squares of the odd numbers (1^2 + 3^2 + 5^2 + 7^2 + 9^2) / 5
        assertEquals(33.0, result, 0.001);
    }
}