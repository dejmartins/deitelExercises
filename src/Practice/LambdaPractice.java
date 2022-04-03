package Practice;

import java.util.stream.IntStream;

public class LambdaPractice {
    public static void main(String[] args) {
//        System.out.printf("%d", IntStream.rangeClosed(1,10).sum());

        System.out.printf("%d", IntStream.rangeClosed(1,10)
                .map((x) -> {return x * 2;})
                .sum());
    }
}
