package selikoffboyarsky.ch4;

interface Gorilla {
    String move();
}

class GorillaFamily {
    /*private static*/ String walk = "walk";

    void play(Gorilla g) {
        System.out.println(g.move());
    }

    void everyonePlay(boolean baby) {
        // baby = true; // can reassign if it is used in lambda
        // must be final or effectively-final (not reassigned)
        String approach = "amble";
        // approach = "run"; we cannot uncomment, or lambda cannot use it

        play(() -> walk); // using instance variable, no problem even if the instance variable is private or static
        play(() -> baby ? "hitch a ride" : "run"); // using a method parameter
        play(() -> approach); // using local variable
    }
}

public class VariablesInsideLambda {
}
