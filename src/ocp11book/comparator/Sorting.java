package ocp11book.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    static class Lizard implements Comparator<Lizard> {
        private int weight;

        public Lizard(int weight) {
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int compare(Lizard x, Lizard y) {
            return Comparator.comparing(Lizard::getWeight).compare(x, y);
        }

        public String toString() {
            return "" + weight;
        }
    }

    public static void main(String[] args) {
        List<Lizard> list = new ArrayList<>();
        list.add(new Lizard(5));
        list.add(new Lizard(4));
        list.add(new Lizard(7));
        // Collections.sort(list); // doesn't compile. Lizard doesn't impelemet Comparable. We need to provide a Comparator
        Collections.sort(list, Comparator.comparing(Lizard::getWeight));
        System.out.println(list);
    }

}
