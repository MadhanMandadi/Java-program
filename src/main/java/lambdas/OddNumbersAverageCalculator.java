package lambdas;

import java.util.Arrays;

public class OddNumbersAverageCalculator {

    public static double calculateAverageOfOddSquares(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .mapToDouble(n -> n * n)
                .average()
                .orElse(0);
    }
}