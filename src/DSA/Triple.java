package DSA;

import java.util.stream.IntStream;

public class Triple {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,20).filter(e -> e % 2 != 0).map(e -> e * e * e).sum());
    }
}
