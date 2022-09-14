package GRAPH;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HasPath {

    public static boolean hasPath(Map<Character, List<Character>> graph, char src, char dest){
        if (src == dest) return true;
        List<Character> stack = new ArrayList<>();
        stack.add(src);

        while(stack.size() > 0){
            char current = stack.remove(stack.size() - 1);
            if(current == dest) return true;
            stack.addAll(graph.get(current));
        }

        return false;
    }

    public static void main(String[] args) {
        Map<Character, List<Character>> graph = new HashMap<>();
        List<Character> f = new ArrayList<>();
        List<Character> g = new ArrayList<>();
        List<Character> h = new ArrayList<>();
        List<Character> i = new ArrayList<>();
        List<Character> j = new ArrayList<>();
        List<Character> k = new ArrayList<>();

        f.add('g');
        f.add('i');
        g.add('h');
        i.add('g');
        i.add('k');
        j.add('i');

        graph.put('f', f);
        graph.put('g', g);
        graph.put('h', h);
        graph.put('i', i);
        graph.put('j', j);
        graph.put('k', k);

        System.out.println(graph);
        System.out.println(hasPath(graph, 'f', 'k')); //true
    }
}
