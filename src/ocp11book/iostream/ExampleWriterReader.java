package ocp11book.iostream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleWriterReader {
    private void echo() throws IOException {
        var o = new FileWriter("new-zoo.txt");

        try (var f = new FileReader("zoo-data.txt");
             var b = new BufferedReader(f);
             o) {
            o.write(b.readLine());
        }
        o.write(""); // runtime exception
    }

    public static void main(String[] args) {
        try {
            new ExampleWriterReader().echo();
        } catch (IOException ioe) {
            System.out.println("Error: " + ioe.getMessage());
        }
    }
}
