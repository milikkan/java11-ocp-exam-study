package tests.ch15;

import java.util.Optional;

public class Q27 {
    private static void eatDesert(Optional<String> op) {
//        System.out.println(op.get("No desert today")); // doesn't compile, because get doesn't take any arguments
//        System.out.println(op.get()); // Cupcake

        System.out.println(op.orElse("No desert today"));
        System.out.println(op.orElseGet(() -> "No desert today"));
    }
    public static void main(String[] args) {
//        eatDesert(Optional.of("Cupcake")); // Cupcake
        eatDesert(Optional.empty()) ; // no desert today
    }
}
