package GRAPH;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UndirectedPath {
    public static void main(String[] args) {
        ArrayList<ArrayList<Character>> edges = new ArrayList<>();
        ArrayList<Character> a = new ArrayList<>();
        ArrayList<Character> b = new ArrayList<>();
        ArrayList<Character> c = new ArrayList<>();
        ArrayList<Character> d = new ArrayList<>();
        ArrayList<Character> e = new ArrayList<>();

        a.add('i');
        a.add('j');

        b.add('k');
        b.add('i');

        c.add('m');
        c.add('k');

        d.add('k');
        d.add('l');

        e.add('o');
        e.add('n');

        edges.add(a);
        edges.add(b);
        edges.add(c);
        edges.add(d);
        edges.add(e);

        System.out.println(undirectedGraph(edges, 'j', 'm'));

    }

    private static boolean undirectedGraph(ArrayList<ArrayList<Character>> edges, char src, char dest) {
        Map<Character, List<Character>> graph = new HashMap<>();
        List<Character> visited = new ArrayList<>();

        for (ArrayList<Character> edge : edges) {
            if (!graph.containsKey(edge.get(0))) {
                graph.put(edge.get(0), new ArrayList<>());
            }
            if (!graph.containsKey(edge.get(1))) {
                graph.put(edge.get(1), new ArrayList<>());
            }

            graph.get(edge.get(0)).add(edge.get(1));
            graph.get(edge.get(1)).add(edge.get(0));
        }

        List<Character> stack = new ArrayList<>();
        stack.add(src);

        while (stack.size() > 0){
            char current = stack.remove(stack.size() - 1);
            if(!visited.contains(current)){
                if(current == dest) return true;
                stack.addAll(graph.get(current));
            }
            visited.add(current);
        }
        return false;
    }
}
