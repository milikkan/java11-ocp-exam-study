package selikoffboyarsky.ch3;

import java.util.ArrayList;
import java.util.List;

public class LegacyAutoboxing {
    public static void main(String[] args) {
        List numbers = new ArrayList();
        numbers.add(5); // autoboxing
        //int result = numbers.get(0); // not compiles
        // Object can’t be unboxed into an int.
        // unboxing fails with a compiler error rather than a runtime error.
    }
}
