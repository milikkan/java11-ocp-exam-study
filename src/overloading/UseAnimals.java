package overloading;

class Animal {

}

class Horse extends Animal {

}

public class UseAnimals {
    public void doStuff(Animal a) {
        System.out.println("animal version of doStuff()");
    }
    public void doStuff(Horse h) {
        System.out.println("horse version of doStuff()");
    }

    public static void main(String[] args) {
        UseAnimals ua = new UseAnimals();
        Animal animalObj = new Animal();
        Horse horseObj = new Horse();

        ua.doStuff(animalObj); // invokes animal version
        ua.doStuff(horseObj); // invokes horse version

        Animal animalRefHorseObj = new Horse();
        ua.doStuff(animalRefHorseObj); // invokes animal version, overloading resolved at compile time

        // ua.doStuff((Horse)animalObj); // runtime (class cast) error

        ua.doStuff((Horse)animalRefHorseObj); // invokes the horse version
    }
}
