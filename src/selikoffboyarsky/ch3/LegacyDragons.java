package selikoffboyarsky.ch3;

import java.util.ArrayList;
import java.util.List;

class Dragon {}
class Unicorn {}

public class LegacyDragons {
    public static void main(String[] args) {
        List unicorns = new ArrayList();
        unicorns.add(new Unicorn());
        //printDragons(unicorns); // compiles with compiler warning

        List<Unicorn> realUnicorns = new ArrayList<>();
        addUnicorn(realUnicorns);
        Unicorn unicorn = realUnicorns.get(0); // ClassCastException
    }

    public static void printDragons(List<Dragon> dragons) {
        for (Dragon dragon : dragons) { // ClassCastException at runtime
            System.out.println(dragon);
        }
    }

    public static void addUnicorn(List unicorn) {
        unicorn.add(new Dragon()); // we can do it, list is raw type, compiles with warnings
    }
}
