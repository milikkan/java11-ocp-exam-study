package selikoffboyarsky.ch4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AdvancedStreamPipelineConcepts {
    public static void main(String[] args) {
        List<String> cats = new ArrayList<>();
        cats.add("Annie");
        cats.add("Ripley");
        Stream<String> stream = cats.stream();
        cats.add("KC"); // we can add to stream after creating the stream because streams are lazy evaluated.
        System.out.println(stream.count()); // prints 3
    }
}
