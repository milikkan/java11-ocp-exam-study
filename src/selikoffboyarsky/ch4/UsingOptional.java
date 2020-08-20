package selikoffboyarsky.ch4;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.DoubleStream;

public class UsingOptional {
    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score : scores) sum += score;
        return Optional.of((double) sum / scores.length);
    }
    public static void main(String[] args) {
        System.out.println(average()); // Optional.empty
        System.out.println(average(90, 100)); // Optional[95.0]

        Optional<Double> opt = average(90, 100);
        if (opt.isPresent()) {
            System.out.println(opt.get());
        }
        // shorter way
        opt.ifPresent(System.out::println);

        Optional<Double> bad = average();
        // System.out.println(bad.get()); // NoSuchElementException at runtime

        // checking if the values is null before creating an Optional
        String value = null;
        Optional o = (value == null) ? Optional.empty() : Optional.of(value);
        System.out.println(o);
        // this is a common pattern, we can use ofNullable method instead
        String value2 = "aa";
        Optional o2 = Optional.ofNullable(value2);
        System.out.println(o2);

        Optional<Double> average = average();
        System.out.println(average.orElse(0.0));
        System.out.println(average.orElseGet(() -> Math.random()));
//        System.out.println(average.orElseThrow(() -> new IllegalStateException()));

        Optional<Double> newAvg = average(90, 100);
        System.out.println(newAvg.orElse(Double.NaN));
        System.out.println(newAvg.orElseGet(Math::random));
        System.out.println(newAvg.orElseThrow(IllegalStateException::new));
    }
}
