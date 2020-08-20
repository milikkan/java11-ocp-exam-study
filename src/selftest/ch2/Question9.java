package selftest.ch2;

class Tree { }

// this class compiles without problem but throws ClassCastException due to line 14
class Redwood extends Tree {
    public static void main(String[] args) {
        new Redwood().go();
    }
    void go() {
        go2(new Tree(), new Redwood()); // OK, correct arguments
        go2((Redwood) new Tree(), new Redwood()); // OK, subclass can be passed in place of superclass argument
    }
    void go2(Tree t1, Redwood r1) {
        Redwood r2 = (Redwood) t1; // super class must be explicitly
                                   // downcasted before being assigned to subclass reference
        Tree t2 = (Tree) r1; // upcasting is optional when subclass is being assigned to a super class reference
    }
}
