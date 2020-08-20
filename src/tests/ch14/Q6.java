package tests.ch14;

import java.util.function.ToDoubleBiFunction;

public class Q6 {
    public static void main(String[] args) {
        // 1. OK
        ToDoubleBiFunction<Integer, Double> tdbf1 =
                (Integer a, Double b) ->{int c; return b;};
        // 2. OK
        ToDoubleBiFunction<Integer, Double> tdbf2 = (h, i) -> (long)h;

        // 3. error, Object doesn't have length()
        /*ToDoubleBiFunction<String, Object> tdbf3 =
                (String u, Object v) -> u.length() + v.length();*/

        // 4. OK
        ToDoubleBiFunction<Integer, Double> tdbf4 = (x, y) -> { int z = 2; return y / z; };
    }
}
