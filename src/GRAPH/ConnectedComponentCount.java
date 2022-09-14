package GRAPH;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectedComponentCount {

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        List<Integer> e = new ArrayList<>();
        List<Integer> f = new ArrayList<>();
        List<Integer> g = new ArrayList<>();

        a.add(8);
        a.add(1);
        a.add(5);
        b.add(0);
        c.add(0);
        c.add(8);
        d.add(0);
        d.add(5);
        e.add(3);
        e.add(4);
        f.add(2);
        f.add(4);
        g.add(3);
        g.add(2);

        graph.put(0, a);
        graph.put(1, b);
        graph.put(5, c);
        graph.put(8, d);
        graph.put(2, e);
        graph.put(3, f);
        graph.put(4, g);
        System.out.println(connectedComponentCount(graph));

    }

    private static final List<Integer> visited = new ArrayList<>();


    private static int connectedComponentCount(Map<Integer, List<Integer>> graph) {
        int count = 0;
        for (Integer key : graph.keySet()){
            if(explore(graph, key)){
                count++;
            };
        }
        return count;
    }

    private static boolean explore(Map<Integer, List<Integer>> graph, Integer key) {
        List<Integer> stack = new ArrayList<>();
        if(visited.contains(key)) return false;
        stack.add(key);

        while (stack.size() > 0){
            int current = stack.remove(stack.size() - 1);
            if(!visited.contains(current)){
                stack.addAll(graph.get(current));
            }
            visited.add(current);
        }

        return true;
    }
}
