package selikoffboyarsky.ch3;

class Crate<T> {
    private T contents;

    public void packCrate(T contents) {
        this.contents = contents;
    }

    public T emptyCrate() {
        return this.contents;
    }
}

class SizeLimitedCrate<T, U> {
    private T contents;
    private U sizeLimit;

    public SizeLimitedCrate(T contents, U sizeLimit) {
        this.contents = contents;
        this.sizeLimit = sizeLimit;
    }
}

class Animal {}
class Elephant extends Animal {}
class Zebra extends Animal {}

public class GenericClasses {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Animal zebra = new Zebra();
        Crate<Animal> crateForAnimal = new Crate<>();
        crateForAnimal.packCrate(elephant);
        Elephant inNewHome = (Elephant)crateForAnimal.emptyCrate();

        Integer numPounds = 15_000;
        SizeLimitedCrate<Elephant, Integer> cl = new SizeLimitedCrate<>(elephant, numPounds);
    }
}
