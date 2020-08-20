package selikoffboyarsky.ch1.staticnested;

public class Enclosing {
    int a = 5;
    static int b = 10;
    // a static nested class
    static class Nested {
        private int price = 6;
        void doStuff() {
//            System.out.println(Enclosing.a); // we cannot access outer members directly
            System.out.println(new Enclosing().a); // we need an instance od outer to access its members
            System.out.println(Enclosing.b); // can access static members
        }
    }

    public static void main(String[] args) {
        // we don't need an instance of outer class to instantiate the nested static class
        Nested nested = new Nested();
        // we can access private members of the nested class
        System.out.println(nested.price); // 6
    }
}
