package tests.ch14;

import java.util.function.DoubleToLongFunction;

public class Q33 {
    public static void main(String[] args) {
        // 1. compiles
        DoubleToLongFunction dtlf1 = a -> null == null ? 1 : 2L;

        // 2. compiles
        DoubleToLongFunction dtlf2 = e -> (int) (10.0 *  e);

        // 3. compiles
        DoubleToLongFunction dtlf3 = (double m) -> { long p = (long)m; return p; };

        // 4. doesn't compile. We can pass Double instead of primitive double, or this violates the
        // signature of the functional interface
        // DoubleToLongFunction dtlf4 = (Double s) -> s.longValue();
    }
}
