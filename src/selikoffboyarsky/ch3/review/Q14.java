package selikoffboyarsky.ch3.review;

import java.util.Comparator;
import java.util.TreeSet;

class Sorted implements Comparable<Sorted>, Comparator<Sorted> {
    private int num;
    private String text;

    Sorted(int n, String t) {
        this.num = n;
        this.text = t;
    }

    public String toString() {
        return "" + num;
    }

    public int compareTo(Sorted s) {
        return text.compareTo(s.text);
    }

    public int compare(Sorted s1, Sorted s2) {
        return s1.num - s2.num;
    }
}

public class Q14 {
    public static void main(String[] args) {
        Sorted s1 = new Sorted(88, "a");
        Sorted s2 = new Sorted(55, "b");

        TreeSet<Sorted> t1 = new TreeSet<>(); // uses Comparable to sort
        t1.add(s1);
        t1.add(s2);

        TreeSet<Sorted> t2 = new TreeSet<>(s1); // uses Comparator to sort, because we posses in one instance of it
        t2.add(s1);
        t2.add(s2);

        System.out.println(t1 + " " + t2);
    }

}
