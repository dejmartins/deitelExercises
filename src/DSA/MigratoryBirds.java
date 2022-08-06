package DSA;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MigratoryBirds {

    public int getMigratoryBirds(List<Integer> arr) {
        Map<Integer, Long> f = arr.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        long maxOccurrence = f.values().stream().max(Comparator.comparing(Long::valueOf)).orElse(0L);
        arr.clear();
        for (Map.Entry<Integer, Long> integer : f.entrySet()) {
            if (integer.getValue() == maxOccurrence) arr.add(integer.getKey());
        }
        return arr.stream().mapToInt(x -> x).min().orElse(0);
    }
}
