package selikoffboyarsky.ch4.review;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q13 {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6);
        List<Integer> l3 = Arrays.asList();
        /*Stream.of(l1, l2, l3) // produces Stream<List<Integer>>
                .map(x -> x + 1) // doesn't compile because we can add 1 to a list
                .flatMap(x -> x .stream()) // we need to swtich map with flatMap for the code to work
                .forEach(System.out::println);*/
        Stream.of(l1, l2, l3)
                .flatMap(x -> x.stream())
                .map(x -> x + 1)
                .forEach(System.out::print); // 234567
    }
}
