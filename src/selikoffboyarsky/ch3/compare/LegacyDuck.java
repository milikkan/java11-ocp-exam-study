package selikoffboyarsky.ch3.compare;

public class LegacyDuck implements Comparable {
    private String name;

    public int compareTo(Object obj) {
        LegacyDuck d = (LegacyDuck) obj; // cast needed because no generics are used
        return name.compareTo(d.name);
    }
}
