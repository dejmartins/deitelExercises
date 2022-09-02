package DSA;

import java.util.List;

public class FormingMagicSquare {

    public int formingMagicSquare(List<List<Integer>> s) {
        int cost = Integer.MAX_VALUE;

        int [][] possibleSolutions = {
                {4,9,2,3,5,7,8,1,6},
                {4,3,8,9,5,1,2,7,6},
                {2,9,4,7,5,3,6,1,8},
                {2,7,6,9,5,1,4,3,8},
                {8,1,6,3,5,7,4,9,2},
                {8,3,4,1,5,9,6,7,2},
                {6,7,2,1,5,9,8,3,4},
                {6,1,8,7,5,3,2,9,4},
        };

        for (int i = 0; i < 8; i++) {
            int possibleCost = 0;
            possibleCost = Math.abs(possibleSolutions[i][0] - s.get(0).get(0))
                    + Math.abs(possibleSolutions[i][1] - s.get(0).get(1))
                    + Math.abs(possibleSolutions[i][2] - s.get(0).get(2))
                    + Math.abs(possibleSolutions[i][3] - s.get(1).get(0))
                    + Math.abs(possibleSolutions[i][4] - s.get(1).get(1))
                    + Math.abs(possibleSolutions[i][5] - s.get(1).get(2))
                    + Math.abs(possibleSolutions[i][6] - s.get(2).get(0))
                    + Math.abs(possibleSolutions[i][7] - s.get(2).get(1))
                    + Math.abs(possibleSolutions[i][8] - s.get(2).get(2));
            if (possibleCost < cost) cost = possibleCost;
        }

        return cost;
    }
}
