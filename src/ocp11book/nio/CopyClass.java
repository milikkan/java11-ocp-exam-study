package ocp11book.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyClass {
    public static void main(String[] args) {
        var p1 = Path.of(".", "/", "goat.txt").normalize(); // goat.txt
        var p2 = Path.of("mule.png"); // mule.txt

        try {
            Files.copy(p1, p2, StandardCopyOption.COPY_ATTRIBUTES);
            System.out.println(Files.isSameFile(p1, p2)); // false
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
