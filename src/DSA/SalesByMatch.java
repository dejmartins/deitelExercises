package DSA;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalesByMatch {

    public int sockMerchant(int n, List<Integer> ar) {
        int matchedPairs = 0;
        Map<Integer, Long> count = ar.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        for (Map.Entry<Integer, Long> integer : count.entrySet()){
            matchedPairs += integer.getValue() / 2;
        }
        return matchedPairs;
    }
}
