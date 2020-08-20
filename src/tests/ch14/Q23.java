package tests.ch14;

import java.util.ArrayList;
import java.util.List;

class Boss {
    String name;

    public Boss(String name) {
        this.name = name;
    }

    public String getName() { return this.name.toUpperCase(); }

    public String toString() { return getName(); }
}

public class Q23 {
    public static void main(String[] args) {
        final List<Boss> bosses = new ArrayList(8);
//        final List<Boss> bosses = new ArrayList<>(8); // same as above line
        bosses.add(new Boss("Jenny"));
        bosses.add(new Boss("Ted"));
        bosses.add(new Boss("Grace"));
//        bosses.removeIf(s -> s.equalsIgnoreCase("ted")); // doesn't compile because Boss doesn't have equalsIgnoreCse() method
        bosses.removeIf(s -> s.getName().equalsIgnoreCase("ted"));
        System.out.println(bosses);
    }
}
