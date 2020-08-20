package tests.ch14.Q32;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FindMovie {
//    private Function<String> printer; // Error-1: Function takes 2 generic arguments
    private Function<String, String> printer;

    protected FindMovie() {
//        printer = s -> { System.out.println(s); return s; } // Error-2: this line needs semicolon at the end
        printer = s -> { System.out.println(s); return s; };
    }

    void printMovies(List<String> movies) {
//        movies.forEach(printer); // Error-3: forEach takes a Consumer, not a Function
//        movies.forEach(s -> printer.apply(s)); // same below
        movies.forEach(printer::apply);
    }

    public static void main(String[] args) {
        List<String> movies = new ArrayList<>();
        movies.add("Stream 3");
        movies.add("Lord of the Recursion");
        movies.add("Silence of the Lambdas");
        new FindMovie().printMovies(movies);
    }
}
