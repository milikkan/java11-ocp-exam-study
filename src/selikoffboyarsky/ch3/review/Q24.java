package selikoffboyarsky.ch3.review;

import java.util.HashSet;
import java.util.Set;

public class Q24 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("Lion");
        s.add("Tiger");
        s.add("Bear");

        // s.forEach(s -> System.out.println(s)); // compiler error, s is already defined in the current scope
        s.forEach(str -> System.out.println(str)); // this compiles
    }
}
