package selikoffboyarsky.ch3.review;

import java.io.FileNotFoundException;

class Helper {
    public static <U extends Exception> void printException(U u) {
        System.out.println(u.getMessage());
    }
}

public class Q12 {
    public static void main(String[] args) {
        // 1. compiles OK
        Helper.printException(new FileNotFoundException("A"));

        // 2. compiles OK
        Helper.printException(new Exception("B"));

        // 3. doesn't compile
        // Helper.<Throwable>printException(new Exception("C"));

        // 4. compiles OK
        Helper.<NullPointerException>printException(new NullPointerException("D"));

        // 5. doesn't compile
        // Helper.printException(new Throwable("E"));
    }
}
