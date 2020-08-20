package overloading;

class Bobcat {
    public void findDen() { }
    static void aMethod() {
        System.out.println("bobcat");
    }
}
public class BobcatKitten extends Bobcat {
    static void aMethod() {
        System.out.println("bobcat kitten");
    }
    // legal override
    public void findDen() { }

    // legal overload
    public void findDen(boolean b) { }

    // compiler error, neither override nor overload
    /*public int findDen() throws Exception {
        return 0;
    }*/

    // neither override, nor overload, method name is different
    public int findden() throws Exception {
        return 0;
    }

    public static void main(String[] args) {
        aMethod();
        BobcatKitten.aMethod();
        Bobcat.aMethod();
    }
}
