package tests.ch15;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Q22 {
//    private static void spot(List<String> x) { // doesn't compile, List doesn't have filter method
//    private static void spot(Optional<Collection> x) { // compiles OK, Collection has isEmpty()
    private static void spot(Optional<String> x) { // compiles OK, String has isEmpty()
//    private static void spot(Stream<Collection> x) { // doesn't compile because Stream doesn't have ifPresent method
        x.filter(y -> !y.isEmpty())
                .map(y -> 8)
                .ifPresent(System.out::println);
    }


    public static void main(String[] args) {
//        spot(Optional.of(Arrays.asList("aa", "bb"))); // 8
        spot(Optional.of("aa")); // 8
    }
}
