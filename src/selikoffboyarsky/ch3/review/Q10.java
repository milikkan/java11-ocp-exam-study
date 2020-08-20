package selikoffboyarsky.ch3.review;

import java.util.Arrays;
import java.util.Comparator;

class MyComparator implements Comparator<String> {
    public int compare(String a, String b) {
        // sorts in reverse-alphabetical order in a case insensitive way
        return b.toLowerCase().compareTo(a.toLowerCase());
    }
}

public class Q10 {
    public static void main(String[] args) {
        String[] values = {"123", "Abb", "aab"};
        Arrays.sort(values, new MyComparator());
        for (String s : values)
            System.out.print(s + " ");
    }
}
