package selikoffboyarsky.ch2.review;

interface CanWalk {
    default void walk() {
        System.out.println("walking");
    }
}

interface CanRun {
    public default void walk() {
        System.out.println("walking");
    }
    public abstract void run();
}

interface CanSprint extends CanRun, CanWalk {
    public default void walk() {
        System.out.println("walking sprinting");
    }
}

public class Q10 implements CanSprint {
    @Override
    public void run() {

    }

    public static void main(String[] args) {
        new Q10().walk();
    }
}
