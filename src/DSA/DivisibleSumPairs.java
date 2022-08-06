package DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class DivisibleSumPairs {

    public int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        for (int i = n - 1; i > 0; i--) {
            int val = ar.remove(0);
            for (Integer integer : ar) {
                if ((val + integer) % k == 0) count++;
            }
        }
        return count;
    }
}
