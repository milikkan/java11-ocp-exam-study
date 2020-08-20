package casting;

class Animal {
    void makeNoise() {
        System.out.println("generic noise");
    }
}
class Dog extends Animal {
    @Override
    void makeNoise() {
        System.out.println("bark");
    }
    void playDead() {
        System.out.println("roll over");
    }
}

public class CastTest {

    public static void main(String[] args) {
        Animal [] arr = { new Animal(), new Dog(), new Animal() };
        for (Animal a : arr) {
            a.makeNoise();
            if (a instanceof Dog) {
//                a.playDead(); compiler error. Cannot find playDead() on Animal ref
                ((Dog) a).playDead(); // correct usage, downcast before using
            }
        }
        Dog dog = new Dog();
        Animal animal = dog;
        animal.makeNoise(); // invokes Dog version because of polymorphism
    }
}
