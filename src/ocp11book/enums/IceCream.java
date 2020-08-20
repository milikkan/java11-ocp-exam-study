package ocp11book.enums;

public class IceCream {
    enum Flavors {
        CHOCOLATE, STRAWBERRY, VANILLA
    }

    public static void main(String[] args) {
//        Flavors STRAWBERRY = null; // throws NullPointerException
        Flavors STRAWBERRY = Flavors.STRAWBERRY; // works

        switch (STRAWBERRY) {
//            case Flavors.VANILLA: // doesn't compile
            case VANILLA:
                System.out.println("v");
            case STRAWBERRY:
                System.out.println("s");
            case CHOCOLATE:
                System.out.println("c");
                break;
            default:
                System.out.println("missing flavor");
        }
    }
}
