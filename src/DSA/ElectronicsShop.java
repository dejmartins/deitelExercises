package DSA;

import java.util.ArrayList;
import java.util.List;

public class ElectronicsShop {

    public int getMoneySpent(int[] keyboards, int[] drives, int budget) {
        List<Integer> possiblePrices = new ArrayList<>();

        for (int keyboard : keyboards) {
            for (int drive : drives) {
                if (keyboard + drive <= budget) possiblePrices.add(keyboard + drive);
            }
        }
        return (int) possiblePrices.stream().mapToInt(x -> x).max().orElse(-1);
    }
}
