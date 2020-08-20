package ocp11book.collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        var greetings = new LinkedList<String>();
        greetings.offer("hello");
        greetings.offer("hi");
        greetings.offer("ola");

        greetings.pop();
        greetings.peek();

        while (greetings.peek() != null)
            System.out.print(greetings.pop());
    }
}
