package selikoffboyarsky.ch3.sortsearch;

import selikoffboyarsky.ch3.compare.Duck;

import java.util.Set;
import java.util.TreeSet;

public class UseTreeSet {
    static class Rabbit {
        int id;
    }

    public static void main(String[] args) {
        Set<Duck> ducks = new TreeSet<>();
        ducks.add(new Duck("Puddles", 5)); // OK, Duck is comparable

        Set<Rabbit> rabbits = new TreeSet<>((r1, r2) -> r1.id - r2.id); // pass a Comparator to TreeSet
        // rabbits.add(new Rabbit()); // runtime error (ClassCCastException) because Rabbit is not comparable

        // first solution is for Rabbit to implement Comparable interface
        // second solution is to pass a Comparator to TreeSet when initializing
        rabbits.add(new Rabbit());
    }
}
