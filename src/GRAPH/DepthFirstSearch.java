package GRAPH;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepthFirstSearch {
    public static void main(String[] args) {
        Map<Character, List<Character>> dfs = new HashMap<>();
        List<Character> a = new ArrayList<>();
        List<Character> b = new ArrayList<>();
        List<Character> c = new ArrayList<>();
        List<Character> d = new ArrayList<>();
        List<Character> e = new ArrayList<>();
        List<Character> f = new ArrayList<>();

        a.add('b');
        a.add('c');
        b.add('d');
        c.add('e');
        d.add('f');

        dfs.put('a', a);
        dfs.put('b', b);
        dfs.put('c', c);
        dfs.put('d', d);
        dfs.put('e', e);
        dfs.put('f', f);

        ArrayList<Character> stack = new ArrayList<>();
        stack.add('a');

        while (stack.size() > 0) {
            char current = stack.remove(stack.size() - 1);
            System.out.println(current);
            stack.addAll(dfs.get(current));
        }

    }

}
