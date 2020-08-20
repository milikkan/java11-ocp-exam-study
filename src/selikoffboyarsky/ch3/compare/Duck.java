package selikoffboyarsky.ch3.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// to demonstrate method references
class DuckHelper {
    public static int compareByWeight(Duck d1, Duck d2) {
        return d1.getWeight() - d2.getWeight();
    }
    public static int compareByName(Duck d1, Duck d2) {
        return d1.getName().compareTo(d2.getName());
    }
}

public class Duck implements Comparable<Duck> {
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return name;
    }

    public int compareTo(Duck duck) {
        return name.compareTo(duck.name);
    }

    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("quack", 7));
        ducks.add(new Duck("puddles", 10));
        ducks.add(new Duck("donald", 11));
        Collections.sort(ducks);
        System.out.println(ducks); // [donald, puddles, quack]

        // using inner class
        /*Comparator<Duck> byWeight = new Comparator<>() {
            @Override
            public int compare(Duck d1, Duck d2) {
                return d1.getWeight() - d2.getWeight(); // sort by weight, ascending
//                return d2.getWeight() - d1.getWeight(); // sort by weight, descending
            }
        };*/

        // using lamdas
//        Comparator<Duck> byWeight = (Duck d1, Duck d2) -> { return d1.getWeight() - d2.getWeight(); };
//        Comparator<Duck> byWeight = (d1, d2) -> { return d1.getWeight() - d2.getWeight(); };
//        Comparator<Duck> byWeight = (d1, d2) -> d1.getWeight() - d2.getWeight();

        // using method reference
//        Comparator<Duck> byWeight = Comparator.comparingInt(d -> d.getWeight());
        Comparator<Duck> byWeight = Comparator.comparingInt(Duck::getWeight);

        Collections.sort(ducks, byWeight);
        System.out.println(ducks); // [quack, puddles, donald]

        // method references
//        Comparator<Duck> byWeight2 = (d1, d2) -> DuckHelper.compareByWeight(d1, d2);
        Comparator<Duck> byWeight2 = DuckHelper::compareByWeight;

    }
}

