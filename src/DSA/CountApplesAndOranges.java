package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountApplesAndOranges {
    public String getCountOfApplesAndOranges(int s, int t, int a, int o, List<Integer> apples, List<Integer> oranges) {
        int[] apple = apples.stream().mapToInt(x -> x + a).toArray();
        int[] orange = oranges.stream().mapToInt(x -> x + o).toArray();
        return Arrays.stream(apple).filter(x -> x >= s && x <= t).count() + " " + Arrays.stream(orange).filter(x -> x >= s && x <= t).count();
    }
}
