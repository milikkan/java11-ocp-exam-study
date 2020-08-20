package ocp11book.streams;

import java.util.List;

public class TotalLengthUsingReduce {
    public static void main(String[] args) {
        System.out.println(
                List.of("duck", "flamingo", "pelican")
                .parallelStream().parallel() // works fine
                .reduce(
                        0,
//                        (c1, c2) -> c1.length() + c2.length(), // doesn't compile
                        (c1, c2) -> c1 + c2.length(), // doesn't compile
                        (s1, s2) -> s1 + s2
                )); // 19
    }
}
