package DSA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>();
        candles.add(3);
        candles.add(2);
        candles.add(1);
        candles.add(3);

        System.out.println(getMaxHeightCount(candles));
    }

    private static int getMaxHeightCount(List<Integer> candles) {
        int max = candles.stream().mapToInt(x -> x).max().getAsInt();
        long sum = candles.stream().filter(x -> x == max).count();
        return (int) sum;
    }
}
