package selikoffboyarsky.ch4.review;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q14 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1); // primitive 1 is autoboxed to Integer object here
        IntStream is = s.mapToInt(x -> x); // object (Integer) stream is converted to primitive int stream
        // java uses auto unboxing here to convert Integer to int

        DoubleStream ds = s.mapToDouble(x -> x); // int is coverted to double, no problem

        // Stream<Integer> s2 = ds.mapToInt(x -> x); // doesn't compile,
        // because double cannot be converted to int without an explicit cast

        // Stream<Integer> s2 = ds.mapToInt(x -> (int)x); // even if we add the explicit cast,
        // returned type is IntStream, not Stream<Integer>

        // var s2 = ds.mapToInt(x -> (int)x); // this is correct or the next one is also correct
        IntStream s2 = ds.mapToInt(x -> (int)x);

        DoubleStream ds2 = is.mapToDouble(x -> x); // this is also ok, because we can convert from int to double implicitly
    }
}
