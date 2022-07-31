package DSA;

import java.security.SecureRandom;
import java.util.*;
import java.util.stream.IntStream;

public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
//         623958417 467905213 714532089 938071625
        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);

//        arr.add(1);
//        arr.add(3);
//        arr.add(5);
//        arr.add(7);
//        arr.add(9);
        findMiniMaxSum(arr);
    }

    private static void findMiniMaxSum(List<Integer> arr) {
//        long[] t = new long[arr.size()];
//
//        for (int i = 0; i < arr.size(); i++) {
//            for (int j = 0; j < arr.size(); j++){
//                if (i == j) continue;
//                t[i] += arr.get(j);
//            }
//        }
//
//        System.out.println(Arrays.stream(t).min().getAsLong() + " " + Arrays.stream(t).max().getAsLong());

            long[] sum = new long[arr.size()];
            long s = IntStream.rangeClosed(0, arr.size() - 1)
                    .mapToLong(arr::get)
                    .sum();

            for (int i = 0; i < arr.size(); i++) {
                sum[i] = s - arr.get(i);
            }

            System.out.println(Arrays.stream(sum).min().getAsLong() + " " + Arrays.stream(sum).max().getAsLong());

    }
}
