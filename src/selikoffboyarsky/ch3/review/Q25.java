package selikoffboyarsky.ch3.review;

import java.util.HashMap;
import java.util.Map;

public class Q25 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, null);

        map.merge(1, 3, (a, b) -> a + b); // apply function and change the key with the return value, which is 13
        map.merge(3, 3, (a, b) -> a + b); // because value for 3 is null, functione is not used, instead new value is set as the value

        System.out.println(map);
    }
}
