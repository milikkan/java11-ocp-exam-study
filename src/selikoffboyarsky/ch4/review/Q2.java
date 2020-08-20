package selikoffboyarsky.ch4.review;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Q2 {
    public static void main(String[] args) {
        Predicate<? super String> predicate = s -> s.startsWith("g");
        Stream<String> stream1 = Stream.generate(() -> "growl! ");
        Stream<String> stream2 = Stream.generate(() -> "growl! ");
        boolean b1 = stream1.anyMatch(predicate); // true
        boolean b2 = stream2.allMatch(predicate); // hangs! because stream2 is an infinite stream
        // and allMatch method needs to evaluate all values to reach a conclusion,  we need to kill the program
        System.out.println(b1 + " " + b2); // nothing prints because execution doesn't get here
    }
}
