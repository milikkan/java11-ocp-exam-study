package tests.ch15;

import java.util.stream.Stream;

public class Q34 {
    public static void main(String[] args) {
        Stream<Boolean> hide = Stream.of(true, false, true);
        boolean found = hide.filter(b -> b).anyMatch(x -> x);
        System.out.println(found); // true
    }
}
