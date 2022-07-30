package DSA;

import java.security.SecureRandom;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsPractice {
    public static void main(String[] args) {
//        int sum = IntStream.rangeClosed(0, 4)
//                .sum();
//        System.out.println(sum);


//        int doubleTheSum = IntStream.rangeClosed(1, 10)
//                .map(x -> x * 2)
//                .sum();
//        System.out.println(doubleTheSum);

//        int sum = IntStream.rangeClosed(1, 10)
//                .filter(x -> x % 2 == 0)
//                .map(x -> x * 3)
//                .sum();
//
//        System.out.println(sum);

        SecureRandom secureRandom = new SecureRandom();
        secureRandom.ints(10, 1, 10)
                .forEach(System.out::println);

        String s = secureRandom.ints(10, 1, 10)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("    "));

        System.out.println(s);
    }
}
