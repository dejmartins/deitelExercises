package DSA;

import java.util.ArrayList;
import java.util.List;

public class SparseArray {

    public List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> stats = new ArrayList<>();
        int count = 0;
        for (String query : queries) {
            for (String string : strings) {
                if (query.equals(string)) {
                    count++;
                }
            }
            stats.add(count);
            count = 0;
        }
        return stats;
    }
}
