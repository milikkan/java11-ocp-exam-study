package ocp11book.enums;

public class FlavorsEnum {
    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY; // semicolon required here
        static final Flavors DEFAULT = CHOCOLATE;
    }

    public static void main(String[] args) {
        for (final var e : Flavors.values()) {
            System.out.println(e.ordinal() + " ");
        }
    }
}
