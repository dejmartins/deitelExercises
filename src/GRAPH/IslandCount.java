package GRAPH;

import java.util.ArrayList;
import java.util.List;

public class IslandCount {

    public static void main(String[] args) {
        List<List<Character>> grid = new ArrayList<>();
        List<Character> a = new ArrayList<>();
        List<Character> b = new ArrayList<>();
        List<Character> c = new ArrayList<>();
        List<Character> d = new ArrayList<>();
        List<Character> e = new ArrayList<>();
        List<Character> f = new ArrayList<>();

        a.add('W');
        a.add('L');
        a.add('W');
        a.add('W');
        a.add('W');

        b.add('W');
        b.add('L');
        b.add('W');
        b.add('W');
        b.add('W');

        c.add('W');
        c.add('W');
        c.add('W');
        c.add('L');
        c.add('W');

        d.add('W');
        d.add('W');
        d.add('L');
        d.add('L');
        d.add('W');

        e.add('L');
        e.add('W');
        e.add('W');
        e.add('L');
        e.add('L');

        f.add('L');
        f.add('L');
        f.add('W');
        f.add('W');
        f.add('W');

        grid.add(a);
        grid.add(b);
        grid.add(c);
        grid.add(d);
        grid.add(e);
        grid.add(f);

        System.out.println(islandCount(grid));
    }

    private static int islandCount(List<List<Character>> grid) {
        List<String> visited = new ArrayList<>();
        int count = 0;
        for (int row = 0; row < grid.size(); row++) {
            for (int col = 0; col < grid.get(row).size(); col++) {
                if (explore(grid, row, col, visited)) count++;
            }
        }
        return count;
    }

    private static boolean explore(List<List<Character>> grid, int row, int col, List<String> visited) {
        boolean rowInBounds = 0 <= row && row < grid.size();
        boolean columnInBounds = 0 <= col && col < grid.get(0).size();
        if(!rowInBounds || !columnInBounds) return false;

        if ((grid.get(row).get(col) == 'W')) return false;

        String position = row + "," + col;
        if (visited.contains(position)) return false;
        visited.add(position);

        explore(grid, row - 1, col, visited);
        explore(grid, row + 1, col, visited);
        explore(grid, row, col - 1, visited);
        explore(grid, row, col + 1, visited);

        return true;
    }
}
