package DSA;

import java.util.List;

public class TheHurdleRace {

    public int hurdleRace(int k, List<Integer> height) {
        int doses = 0;
        int max = height.stream().mapToInt(x -> x).max().getAsInt();
        if(max > k) doses = max - k;
        return doses;
    }
}
