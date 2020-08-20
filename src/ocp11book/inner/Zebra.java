package ocp11book.inner;

public class Zebra {
    private int x = 24;

    public int hunt() {
        String message = "x is ";

        abstract class Stripes { // abstract is allowed here
            private int x = 0; // private is allowed here

            public void print() {
                System.out.println(message + Zebra.this.x); // to refer outer x, use Zebra.this
            }
        }

        var s = new Stripes() { }; // implement abstract class Stripes

        s.print(); // x is 24
        return x;
    }

    public static void main(String[] args) {
        new Zebra().hunt();
    }
}
