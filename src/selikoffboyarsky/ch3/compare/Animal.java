package selikoffboyarsky.ch3.compare;

import java.util.*;

public class Animal implements Comparable<Animal> {
    private int id;

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                '}';
    }

    public int compareTo(Animal a) {
//        return this.id - a.id; // ascending order
        return a.id - this.id; // descending order
    }

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        a1.id = 5;
        a2.id = 7;
        System.out.println("a1 - a2: " + a1.compareTo(a2)); // -2
        System.out.println("a1 - a1: " + a1.compareTo(a1)); // 0
        System.out.println("a2 - a1: " + a2.compareTo(a1)); // 2

        List<Animal> animals = Arrays.asList(a1, a2);
        Collections.sort(animals);
        System.out.println(animals);
    }
}
