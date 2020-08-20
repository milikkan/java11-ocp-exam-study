package selikoffboyarsky.ch3.sortsearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortRabbits {
    static class Rabbit {
        int id;
    }

    public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit());
//        Collections.sort(rabbits); // compiler error, Rabbit class is not Comparable

        // other than implementing Comparable interface
        // we can pass a Comparator as the 2nd argument
//        Collections.sort(rabbits, (r1, r2) -> r1.id - r2.id );
        // we also can use comparingInt method
        Collections.sort(rabbits, Comparator.comparingInt(r -> r.id));
    }
}
