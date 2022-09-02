package DSA;

import java.util.*;

public class LeaderBoard {

    public List<Integer> climbingLeaderBoard(List<Integer> ranked, List<Integer> player) {
        List<Integer> positions = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>(ranked);
        ranked = new ArrayList<>(set);
        ranked.sort(Collections.reverseOrder());
//
//        for(Integer integer : player){
//            ranked.add(integer);
//            ranked.sort(Collections.reverseOrder());
//
//            positions.add(ranked.indexOf(integer) + 1);
//            ranked.remove(integer);
//
//        }

        for (Integer integer : player) {
            int count = 0;
            while (count < ranked.size() && integer < ranked.get(count)) {
                count++;
            }
            positions.add(count + 1);
        }

        return positions;
    }
}
