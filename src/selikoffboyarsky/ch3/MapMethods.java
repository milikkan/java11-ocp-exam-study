package selikoffboyarsky.ch3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {
        // HashMap
        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala"); // bamboo
        System.out.println(food);
        // keys are not stored as sorted
        for (String key : map.keySet()) System.out.print(key + ", ");
        System.out.println("\n------------");

        // TreeMap
        Map<String, String> map2 = new TreeMap<>();
        map2.put("koala", "bamboo");
        map2.put("lion", "meat");
        map2.put("giraffe", "leaf");
        System.out.println(map2.get("lion")); // meat
        // keys are stored as sorted
        for (String key : map2.keySet()) System.out.print(key + ", ");
        System.out.println("\n------------");

//        System.out.println(map.contains("lion"));  // compiler error, no contains() method
        System.out.println(map.containsKey("lion")); // true
        System.out.println(map.containsValue("lion")); // false
        System.out.println(map.size()); // 3
    }
}
