package selikoffboyarsky.ch1.review.Q16;

public class Outer {
    class Inner { }

    public static void main(String[] args) {
        // 1. doesn't compile
        // Inner in = new Inner();

        // 2. doesn't compile
        // Inner in = Outer.new Inner();

        // 3. doesn't compile
        // Outer.Inner in = new Outer().Inner();

        // 4. compiles OK, member inner class needs an instance of the Outer class for instantiation
        Outer.Inner in = new Outer().new Inner();

        // 5. doesn't compile
        // Outer.Inner in = new Outer().Inner();

        // 6. doesn't compile
        // Outer.Inner in = Outer.new Inner();
    }
}
