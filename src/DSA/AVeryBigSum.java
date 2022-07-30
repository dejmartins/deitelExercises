package DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class AVeryBigSum {
    public static void main(String[] args) {
        List<Long> ar = new ArrayList<>();
        ar.add(1000000001L);
        ar.add(1000000002L);
        ar.add(1000000003L);
        ar.add(1000000004L);
        ar.add(1000000005L);

        System.out.println(getSum(ar));
    }

    private static long getSum(List<Long> ar) {
        long sum = 0;
        sum = ar.stream()
                .reduce(0L, Long::sum);
        return sum;
    }
}
