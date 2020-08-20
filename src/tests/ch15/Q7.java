package tests.ch15;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Q7 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(5.4);
        list.add(1.2);

        Optional<Double> opt = list.stream().sorted().findFirst(); // doesn't modify the original list
        System.out.println(opt.get() + " " + list.get(0)); // 1.2 5.4

    }
}
