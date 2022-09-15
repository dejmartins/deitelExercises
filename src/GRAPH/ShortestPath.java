package GRAPH;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShortestPath {

    public static void main(String[] args) {
        List<List<Character>> edges = new ArrayList<>();
        List<Character> a = new ArrayList<>();
        List<Character> b = new ArrayList<>();
        List<Character> c = new ArrayList<>();
        List<Character> d = new ArrayList<>();
        List<Character> e = new ArrayList<>();

        a.add('w');
        a.add('x');
        b.add('x');
        b.add('y');
        c.add('z');
        c.add('y');
        d.add('z');
        d.add('v');
        e.add('w');
        e.add('v');

        edges.add(a);
        edges.add(b);
        edges.add(c);
        edges.add(d);
        edges.add(e);

        shortestPath(edges, 'w', 'z');


    }

    private static void shortestPath(List<List<Character>> edges, char startNode, char endNode) {
        Map<Character, List<Character>> graph = edgesToGraph(edges);
    }

    private static Map<Character, List<Character>> edgesToGraph(List<List<Character>> edges) {
        Map<Character, List<Character>> graph = new HashMap<>();

        for (List<Character> edge : edges) {
            if (!graph.containsKey(edge.get(0))) {
                graph.put(edge.get(0), new ArrayList<>());
            }

            if (!graph.containsKey(edge.get(1))) {
                graph.put(edge.get(1), new ArrayList<>());
            }

            graph.get(edge.get(0)).add(edge.get(1));
            graph.get(edge.get(1)).add(edge.get(0));
        }

        return graph;
    }
}
