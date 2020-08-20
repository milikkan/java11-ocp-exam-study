package certification;

public class Neigbor extends Parent {
    void doStuff() {
        System.out.println("x=" + x);
    }
    public static void main(String[] args) {
        new Neigbor().doStuff();
    }
}
