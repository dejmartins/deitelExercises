package DSA;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(0);
        list.add(-1);
        list.add(-1);

        getRatio(list);
    }

    private static void getRatio(List<Integer> list) {
        double positive = 0;
        double negative = 0;
        double zero = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) positive++;
            if (list.get(i) < 0) negative++;
            if (list.get(i) == 0) zero++;
        }

        System.out.printf("%6f%n", positive / list.size());
        System.out.printf("%6f%n", negative / list.size());
        System.out.printf("%6f", zero / list.size());
    }
}
