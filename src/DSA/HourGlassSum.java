package DSA;

import java.util.ArrayList;
import java.util.List;

public class HourGlassSum {

    public int getSum(List<List<Integer>> arr) {
        List<Integer> totalSum = new ArrayList<>();
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.size() - 2; j++) {
                int sum = 0;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        if (k != i + 1) {
                            sum = sum + arr.get(k).get(l);
                        }
                    }
                }
                sum = sum + arr.get(i + 1).get(j + 1);
                totalSum.add(sum);
            }
        }
        return totalSum.stream().mapToInt(x -> x).max().orElse(0);
    }
}
