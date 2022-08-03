package DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class kruskals {
    public static void main(String[] args) {
        int gNodes = 5;
        List<Integer> gFrom = new ArrayList<>();
        gFrom.add(1);
        gFrom.add(1);
        gFrom.add(1);
        gFrom.add(1);
        gFrom.add(2);
        gFrom.add(3);
        gFrom.add(4);

        List<Integer> gTo = new ArrayList<>();
        gTo.add(2);
        gTo.add(3);
        gTo.add(4);
        gTo.add(5);
        gTo.add(3);
        gTo.add(4);
        gTo.add(5);

        List<Integer> gWeight = new ArrayList<>();
        gWeight.add(20);
        gWeight.add(50);
        gWeight.add(70);
        gWeight.add(90);
        gWeight.add(30);
        gWeight.add(40);
        gWeight.add(60);

        System.out.println(getMinimumOverallWeight(gNodes, gFrom, gTo, gWeight));
    }

    private static int getMinimumOverallWeight(int gNodes, List<Integer> gFrom, List<Integer> gTo, List<Integer> gWeight) {
        List<Integer> container = new ArrayList<>();
        Integer min = gWeight.stream().mapToInt(x -> x).min().getAsInt();
        int sum = min;

        container.add(gFrom.get(gWeight.indexOf(min)));
        container.add(gTo.get(gWeight.indexOf(min)));
        gTo.remove(gWeight.indexOf(min));
        gFrom.remove(gWeight.indexOf(min));
        gWeight.remove(min);

        for (int i = 0; i < gNodes; i++) {
            min = gWeight.stream().mapToInt(x -> x).min().getAsInt();
            if (container.contains(gFrom.get(gWeight.indexOf(min))) && container.contains(gTo.get(gWeight.indexOf(min)))){
                container.add(gFrom.get(gWeight.indexOf(min)));
                container.add(gTo.get(gWeight.indexOf(min)));
                gTo.remove(gWeight.indexOf(min));
                gFrom.remove(gWeight.indexOf(min));
                gWeight.remove(min);
            }
            else {
                sum += min;
                container.add(gFrom.get(gWeight.indexOf(min)));
                container.add(gTo.get(gWeight.indexOf(min)));
                gTo.remove(gWeight.indexOf(min));
                gFrom.remove(gWeight.indexOf(min));
                gWeight.remove(min);
            }
        }
        return sum;
    }


}
