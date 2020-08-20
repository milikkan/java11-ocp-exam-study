package tests.ch15;

import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q12 {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("speak", "bark", "meow", "growl");
        BinaryOperator<String> merge = (a, b) -> a;
        Map<Integer, String> map = s.collect(
                Collectors.toMap(String::length, k -> k, merge));
        System.out.println(map.size() + " " + map.get(4)); // 2 bark
        System.out.println(map); // {4=bark, 5=speak}
    }
}
