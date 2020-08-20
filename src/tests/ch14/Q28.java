package tests.ch14;

import java.util.function.BiFunction;

public class Q28 {
    public static Integer rest(BiFunction<Integer, Double, Integer> takeABreak) {
        return takeABreak.apply(3, 10.2);
    }

    public static void main(String[] args) {
        // 1. doesn' compile, argument types mismatch
//        rest((int n, double e) -> (int)(n + e));
        rest((n, e) -> (int)(n + e)); // this one compiles when we delete the types

        // 2. doesn't compile, return type mismatch, cannot implicitly convert Double to Integer
//        rest((s, w) -> 2 * w);
        rest((s, w) -> (int)(2 * w)); // this compiles

        // 3. compiles OK
        rest((s, e) -> s.intValue() + e.intValue());
    }
}
