package GRAPH;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BreadthFirstSearch {

    public static void breadthFirstSearchPrint(Map<Character, List<Character>> graph, char source){
        List<Character> queue = new ArrayList<>();
        queue.add(source);
        while(queue.size() > 0){
            char current = queue.remove(0);
            System.out.println(current);
            queue.addAll(graph.get(current));
        }

    }

    public static void main(String[] args) {
        Map<Character, List<Character>> graph = new HashMap<>();
        List<Character> a = new ArrayList<>();
        List<Character> b = new ArrayList<>();
        List<Character> c = new ArrayList<>();
        List<Character> d = new ArrayList<>();
        List<Character> e = new ArrayList<>();
        List<Character> f = new ArrayList<>();

        a.add('c');
        a.add('b');
        b.add('d');
        c.add('e');
        d.add('f');

        graph.put('a', a);
        graph.put('b', b);
        graph.put('c', c);
        graph.put('d', d);
        graph.put('e', e);
        graph.put('f', f);

        breadthFirstSearchPrint(graph, 'a');
    }
}
