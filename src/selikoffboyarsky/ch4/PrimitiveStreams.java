package selikoffboyarsky.ch4;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {
    static void calculateTotal() {
        Stream<Integer> nums = Stream.of(1, 2, 3);
        System.out.println(nums.reduce(0, (sum, num) -> sum + num));

        // another way
        nums = Stream.of(1, 2, 3);
        System.out.println(nums.mapToInt(x -> x).sum());
    }

    static void calculateAverage() {
        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble());

        System.out.println(IntStream.of(5, 6, 7).average().getAsDouble());
    }

    static void countNumbers() {
        // counting 1 to 5
        IntStream count = IntStream.iterate(1, n -> n + 1).limit(5);
        count.forEach(System.out::print);
        System.out.println();
        // shorter way
        IntStream range = IntStream.range(1, 6); // end is exclusive
        range.forEach(System.out::print);
    }

    public static void main(String[] args) {
        calculateTotal();
        calculateAverage();

        // empty DoubleStream
        DoubleStream empty = DoubleStream.empty();
        // one value DoubleStream
        DoubleStream oneValue = DoubleStream.of(3.14);
        // multiple values of DoubleStream
        DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
        // printing
        oneValue.forEach(System.out::println);
        System.out.println();
        varargs.forEach(System.out::println);

        // generate and iterate
        DoubleStream random = DoubleStream.generate(Math::random);
        DoubleStream fractions = DoubleStream.iterate(.5, d -> d / 2);
        random.limit(3).forEach(System.out::println);
        System.out.println();
        fractions.limit(3).forEach(System.out::println);
        System.out.println("-----------");

        countNumbers();
    }
}
