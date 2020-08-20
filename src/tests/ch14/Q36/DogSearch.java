package tests.ch14.Q36;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DogSearch {
    void reduceList(List<String> names, Predicate<String> tester) {
        names.removeIf(tester);
    }

    public static void main(String[] args) {
//        int MAX_LENGTH = 2;
        DogSearch search = new DogSearch();
        List<String> names = new ArrayList<>();
        names.add("Lassie");
        names.add("Benji");
        names.add("Brian");
        int MAX_LENGTH = 2 + names.size();
//        search.reduceList(names, d -> d.length() > MAX_LENGTH); // doesn't compile because MAX_LENGTH is not effectively final
        search.reduceList(names, d -> d.length() > MAX_LENGTH);
        System.out.println(names.size()); // 2
    }
}
