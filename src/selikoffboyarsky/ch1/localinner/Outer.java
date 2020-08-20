package selikoffboyarsky.ch1.localinner;

public class Outer {
    private int length = 5;

    public void calculate() {
        // variables accessed by local inner class must be final or effectively final
        // effectively final means, it cannot be reassigned even if it is not declared as final
        final int width = 20;
        // local inner class
        class Inner {
            public void multiply() {
                System.out.println(length * width);
            }
        }
        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.calculate();
    }
}
