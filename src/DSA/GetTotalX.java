package DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class GetTotalX {

    public int getTotal(List<Integer> a, List<Integer> b) {
        int aMax = a.stream().mapToInt(x -> x).max().orElse(0);
        int bMax = b.stream().mapToInt(x -> x).max().orElse(0);
        int[] range = IntStream.rangeClosed(aMax, bMax).toArray();

        int minCount = 0;
        List<Integer> minSet = new ArrayList<>();
        for (int val : range) {
            for (Integer integer : a) {
                if (val % integer == 0) minCount++;
            }
            if (minCount == a.size()) minSet.add(val);
            minCount = 0;
        }

        int maxCount = 0;
        List<Integer> maxSet = new ArrayList<>();
        for (int val : range) {
            for (Integer integer : b) {
                if (integer % val == 0) maxCount++;
            }
            if (maxCount == b.size()) maxSet.add(val);
            maxCount = 0;
        }

        return (int) maxSet.stream().filter(minSet::contains).count();
    }


}

