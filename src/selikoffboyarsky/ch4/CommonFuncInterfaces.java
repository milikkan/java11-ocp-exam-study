package selikoffboyarsky.ch4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class CommonFuncInterfaces {

    static void supplierDemo() {
        Supplier<LocalDate> s1 = () -> LocalDate.now();
        Supplier<LocalDate> s2 = LocalDate::now;

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);
        System.out.println(d2);

        Supplier<ArrayList<String>> sal = ArrayList::new;
        Supplier<ArrayList<String>> sal2 = ArrayList<String>::new; // OK, String is optional
//        Supplier<ArrayList<String>> sal2 = ArrayList<>::new; // wrong, no diamond operator
        List<String> list = sal.get();
        System.out.println(list);
    }

    static void consumerDemo() {
        Consumer<String> c1 = s -> System.out.println(s);
        Consumer<String> c2 = System.out::println;

        c1.accept("Hello");
        c2.accept("World");

        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> bc1 = (k, v) -> map.put(k,v);
        BiConsumer<String, Integer> bc2 = map::put;

        bc1.accept("John", 2);
        bc2.accept("Mary", 3);
        System.out.println(map);
    }

    static void predicateDemo() {
        Predicate<String> p1 = s -> s.isEmpty();
        Predicate<String> p2 = String::isEmpty;

        System.out.println(p1.test("Hi")); // false
        System.out.println(p2.test("")); // true

        BiPredicate<String, String> bp1 = (str, prefix) -> str.startsWith(prefix);
        BiPredicate<String, String> bp2 = String::startsWith;

        System.out.println(bp1.test("Hello", "He")); // true
        System.out.println(bp2.test("hello", "z")); // false
    }

    static void functionDemo() {
        Function<String, Integer> f1 = s -> s.length();
        Function<String, Integer> f2 = String::length;

        System.out.println(f1.apply("Joe"));
        System.out.println(f2.apply("Hello"));

        BiFunction<String, String, String> bf1 = (str, toAdd) -> str.concat(toAdd);
        BiFunction<String, String, String> bf2 = String::concat;

        System.out.println(bf1.apply("Hello ", "World"));
        System.out.println(bf2.apply("aa", "bb"));
    }

    static void operatorDemo() {
//        Function<String, String> f1 = s -> s.toUpperCase();
        UnaryOperator<String> uo1 = s -> s.toUpperCase();
        UnaryOperator<String> uo2 = String::toUpperCase;

        System.out.println(uo1.apply("hello"));
        System.out.println(uo2.apply("world"));

        BinaryOperator<String> bo1 = (str, toAdd) -> str.concat(toAdd);
        BinaryOperator<String> bo2 = String::concat;

        System.out.println(bo1.apply("hello ", "world"));
        System.out.println(bo2.apply("aa", "bb"));
    }

    public static void main(String[] args) {
        // supplierDemo();
        // consumerDemo();
        // predicateDemo();
        // functionDemo();
        operatorDemo();

    }
}
