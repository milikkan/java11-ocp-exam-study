package tests.ch14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Supplier;

public class Q10 {
//    private static void checkPrices(List<Double> prices, Consumer scanner) {          // error
//    private static void checkPrices(List<Double> prices, DoubleConsumer scanner) {    // error
//    private static void checkPrices(List<Double> prices, Supplier<Double> scanner) {  // error
    private static void checkPrices(List<Double> prices, Consumer<Double> scanner) {    // OK
        prices.forEach(scanner);
    }

    public static void main(String[] args) {
        List<Double> prices = Arrays.asList(1.2, 6.5, 3.0);
        checkPrices(prices, p -> {
            String result = p < 5 ? "Correct" : "Too high";
            System.out.println(result);
        });
    }
}
