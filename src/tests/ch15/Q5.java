package tests.ch15;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Q5 {
    public static void main(String[] args) {
        IntStream s = IntStream.empty();
        // System.out.println(s.average().getAsDouble()); // compiles but throws exception at runtime

        // we should check for the existance of the value before printing
        OptionalDouble result = s.average();
        if (result.isPresent()) System.out.println(result.getAsDouble()); // prints nothing

        // or shorter version
        result.ifPresent(System.out::println);
    }
}
