package selikoffboyarsky.ch3;

interface Shippable<T> {
    void ship(T t);
}

class Robot {}

// first way of implementing Shippable interface
class ShippableRobotCrate implements Shippable<Robot> {
    @Override
    public void ship(Robot robot) {

    }
}

// second way of implementing Shippable interface
class ShippableAbstractCrate<U> implements Shippable<U> {
    @Override
    public void ship(U u) {

    }
}

// third way of implementing Shippable interface
class ShippableCrate implements Shippable { // compiler warns of using the raw type
    @Override
    public void ship(Object o) {

    }
}

public class GenericInterfaces {
    public static void main(String[] args) {
        Shippable<Robot> sh1 = new ShippableRobotCrate();
        sh1.ship(new Robot());

        Shippable<Robot> sh2 = new ShippableAbstractCrate<>();
        sh2.ship(new Robot());

        Shippable sh3 = new ShippableCrate();
        sh3.ship(new Robot());
    }
}
