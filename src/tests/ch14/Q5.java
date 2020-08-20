package tests.ch14;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Q5 {
//    public void mine(BiConsumer<Integer, Double> lambda) {             // error
    public void mine(BiFunction<Integer, Double, Double> lambda) {     // OK
//    public void mine(BiFunction<Integer, Integer, Double> lambda) {    // error
//    public void mine(Function<Integer, Double> lambda) {               // error

    }

    public static void main(String[] args) {
        new Q5().mine((s, p) -> s + p);
    }
}
