package GRAPH;

import java.util.ArrayList;
import java.util.List;

public class MinimumIsland {
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

        System.out.println(minimumIsland(grid));
    }

    private static int minimumIsland(List<List<Character>> grid) {
        List<String> visited = new ArrayList<>();
        int minimum = Integer.MAX_VALUE;
        for (int row = 0; row < grid.size(); row++) {
            for (int col = 0; col < grid.get(0).size(); col++) {
                int size = exploreSize(grid, row, col, visited);
                if (size > 0 && size < minimum) minimum = size;
            }
        }
        return minimum;
    }

    private static int exploreSize(List<List<Character>> grid, int row, int col, List<String> visited) {
        boolean rowInBound = 0 <= row && row < grid.size();
        boolean colInBound = 0 <= col && col < grid.get(0).size();

        if(!rowInBound || !colInBound) return 0;
        if ((grid.get(row).get(col) == 'W')) return 0;

        String position = row + "," + col;

        if (visited.contains(position)) return 0;
        visited.add(position);

        int size = 1;
        size += exploreSize(grid, row - 1, col, visited);
        size += exploreSize(grid, row + 1, col, visited);
        size += exploreSize(grid, row, col - 1, visited);
        size += exploreSize(grid, row, col + 1, visited);

        return size;
    }
}
