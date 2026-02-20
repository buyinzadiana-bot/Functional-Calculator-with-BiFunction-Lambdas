import java.util.function.BiFunction;

public class FunctionalCalculator {

    // This method takes 2 numbers and a "function" (operation)
    public static Integer calculate(int num1, int num2,
                                    BiFunction<Integer, Integer, Integer> operation) {

        return operation.apply(num1, num2);
    }
}