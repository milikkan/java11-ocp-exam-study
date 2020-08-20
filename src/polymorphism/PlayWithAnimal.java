package polymorphism;

abstract class Animal {
    String name = "???";
    public void printName() {
        System.out.println(name);
    }
    public void play() {
        System.out.println("pet animal");
    }
    public void careFor() {
        play();
    }
}

class Lion extends Animal {
    String name = "Leo";

    public void play() {
        System.out.println("toss in meat");
    }
}

public class PlayWithAnimal {
    public static void main(String[] args) {
        Animal animal = new Lion();
        animal.printName(); // prints "???", instance variables are not in polymorphic
        animal.careFor(); // prints "toss" in meat, Lion version of play is invoked at runtime
    }
}
