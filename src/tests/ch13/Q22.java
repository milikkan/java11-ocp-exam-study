package tests.ch13;

class Wash<T> {
    T item;
    public void clean(T item) {
        System.out.println("Clean " + item);
    }
}

public class Q22 {
    public static void main(String[] args) {
        // 1. OK
        // Wash wash = new Wash();

        // 2. OK
        // Wash wash = new Wash<String>();

        // 3.
        Wash<String> wash = new Wash<>();
        wash.clean("socks");
    }
}
