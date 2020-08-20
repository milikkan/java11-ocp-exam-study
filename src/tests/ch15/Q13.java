package tests.ch15;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Q13 {
    public static void main(String[] args) {
//        IntegerStream pages = IntegerStream.of(200, 300); // error, type should be IntStream
        IntStream pages = IntStream.of(200, 300);
        IntSummaryStatistics stats = pages.summaryStatistics();
        long total = stats.getSum();
        long count = stats.getCount();
        System.out.println(total + "-" + count); // 500-2
    }
}
