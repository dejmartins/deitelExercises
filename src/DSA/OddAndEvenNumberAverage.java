package DSA;

import java.security.SecureRandom;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class OddAndEvenNumberAverage {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        IntStream stream = secureRandom.ints(10, 0, 1001);
        List<Integer> list = stream.boxed().toList();
        System.out.println(list);
        long evenCount = list.stream()
                .filter(x -> x % 2 == 0)
                .count();

        long oddCount = list.stream()
                .filter(x -> x % 2 == 1)
                .count();

        double evenAverage = (list.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, Integer::sum) * 1.0)/evenCount;
        double oddAverage = (list.stream()
                .filter(x -> x % 2 == 1)
                .reduce(0, Integer::sum) * 1.0)/oddCount;


        double average = (list.stream()
                .reduce(0, Integer::sum) * 1.0)/list.size();

        System.out.println("Even count " + evenCount);
        System.out.println("Odd count " + oddCount);
        System.out.println("Even average " + evenAverage);
        System.out.println("Odd average " + oddAverage);
        System.out.println("Average " + average);

    }
}
