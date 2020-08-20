package selikoffboyarsky.ch3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysAndArrayListsReview {

    public static void arrayAndArrayList() {
        String[] arr = {"gerbil", "mouse"};
        List<String> list = Arrays.asList(arr); // returns a fixed size list

        list.set(1, "test"); // result is reflected in the array too
        arr[0] = "new"; // result is reflected in the list too

//        String[] arr2 = (String[]) list.toArray(); // throws ClassCastException
        String[] arr2 = list.toArray(new String[]{});
        list.remove(1); // list is not resizable because it is backed by the array, throws UnsupportedOprationException
        for (String s : arr2) {
            System.out.println(s);
        }
        System.out.println("---------");
        list.forEach(System.out::println);
    }

    public static void sortingAndSearching() {
        // using array
        int[] numbers = {6, 9, 1, 8};
        Arrays.sort(numbers); // 1, 6, 8, 9
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("Index of 6 is " + Arrays.binarySearch(numbers, 6)); // 1
        System.out.println("Index of 3 is " + Arrays.binarySearch(numbers, 3)); // -2, because 3 is not in the list
        // take the position it would have been inserted -> 1
        // make it negative -> -1
        // subtract 1 -> -2

        // using list
        System.out.println("----------------");
        List<Integer> list = Arrays.asList(9, 7, 5, 3);
        Collections.sort(list); // 3, 5, 7, 9
        list.forEach(i -> System.out.print(i + " "));
        System.out.println("");
        System.out.println("Indef of 3 is " + Collections.binarySearch(list, 3)); // 0
        System.out.println("Indef of 2 is " + Collections.binarySearch(list, 2)); // -1
    }

    public static void main(String[] args) {
//        arrayAndArrayList();
        sortingAndSearching();
    }
}
