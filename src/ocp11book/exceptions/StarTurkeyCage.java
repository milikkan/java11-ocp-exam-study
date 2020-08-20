package ocp11book.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class StarTurkeyCage implements AutoCloseable {
    public void close() throws IOException {
        System.out.println("closing...");
        throw new FileNotFoundException();
    }

    // method doesn't compile, we should handle or declare exception thrown
    // from the close() method
    /*public static void main(String[] args) throws Exception {
        try (StarTurkeyCage t = new StarTurkeyCage()) {
            System.out.println("put turkeys in");
        }
    }*/

    public static void main(String[] args) {
        try (StarTurkeyCage t = new StarTurkeyCage()) {
            System.out.println("put turkeys in");
        } catch (Exception e) {}
    }
}
