package selftest.ch2;

class Dog {
    public void bark() {
        System.out.print("woof ");
    }
}

class Hound extends Dog {
    public void sniff() {
        System.out.print("sniff ");
    }
    public void bark() {
        System.out.print("howl ");
    }
}

public class Question8 {
    void go() {
        new Hound().bark(); // howl
        ((Dog) new Hound()).bark(); // howl -- due to polymorphism
        // ((Dog) new Hound()).sniff(); compilation error -- Dog class doesn't have sniff() method
    }

    public static void main(String[] args) {
        new Question8().go();
    }
}
