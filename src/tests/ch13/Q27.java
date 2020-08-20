package tests.ch13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static java.util.function.Predicate.not;

public class Q27 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Atlanta");
        list.add("Chicago");
        list.add("New York");

        list.stream()
//                .filter(String::isEmpty) // OK
//                .filter(!String::isEmpty) // doesn't compile, method reference cannot have an operator next to it
//                .filter(String::!Empty) // doesn't compile
                .filter(not(String::isEmpty)) // compiles OK
                .forEach(System.out::println);
    }
}
