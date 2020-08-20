package selikoffboyarsky.ch1.memberinner;

public class Outer {
    private String greeting = "Hi";

    // can be abstract
    // can be final
    // can extend other classes
    // can implement interfaces
    protected class Inner { // can be declared public, protected, private or default
        public int repeat = 3;
        public void go() {
            for (int i = 0; i < repeat; i++) {
                System.out.println(greeting); // can access outer private members
            }
        }
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.go();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.callInner(); // prints "Hi" 3 times

        // we cannot reference Inner from static context
        // Inner in = new Inner(); // doesn't compile

        // another way to instantiate Inner
        // we need an Outer instance to call new
        Inner in = outer.new Inner();
        in.go(); // prints "Hi" 3 times
        // we can also refer to Inner class with Outer
        Outer.Inner inner = outer.new Inner();
        inner.go(); // prints "Hi" 3 times
    }
}
