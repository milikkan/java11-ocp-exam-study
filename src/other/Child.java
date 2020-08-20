package other;

import certification.Parent;

public class Child extends Parent {
    int y = 10;
    void doStuff() {
        System.out.println("x2=" + x);
    }

    public static void main(String[] args) {
        new Child().doStuff();
    }
}
