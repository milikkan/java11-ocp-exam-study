package tests.ch14;

import java.util.function.UnaryOperator;

class Doll {
    int layer;

    public Doll(int layer) {
        super();
        this.layer = layer;
    }
    static void open(UnaryOperator<Doll> task, Doll doll) {
//        while ((doll = task.accept(doll)) != null) { // accept is Consumer's method
        while ((doll = task.apply(doll)) != null) { // for UnaryOperator, method is appy()
            System.out.print("X");
        }
    }
}

public class Q18 {
    public static void main(String[] args) {
        Doll.open(s -> {
            if (s.layer <= 0) return null;
//            else return new Doll(s.layer--); // infinite loop, because every time a new Doll object is created
            else return new Doll(--s.layer); // now prints XXXXX
        }, new Doll(5));
    }
}
