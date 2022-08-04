package DSA;

import java.util.ArrayList;
import java.util.List;

public class BreakingRecords {

    public List<Integer> getNumberOfBrokenRecords(List<Integer> scores) {
        List<Integer> result = new ArrayList<>();
        int max = scores.get(0);
        int min = scores.get(0);
        int topCount = 0;
        int downCount = 0;
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) > max) {
                topCount++;
                max = scores.get(i);
            }
            else if (scores.get(i) < min) {
                downCount++;
                min = scores.get(i);
            }
        }
        result.add(topCount);
        result.add(downCount);
        return result;
    }
}
