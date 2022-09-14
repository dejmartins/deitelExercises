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

//        while (stack.size() > 0){
//            char current = stack.remove(0);
//            if(current == dest) return true;
//            stack.addAll(graph.get(current));
//        }

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

        Map<Character, List<Character>> graph2 = new HashMap<>();
        List<Character> v = new ArrayList<>();
        List<Character> w = new ArrayList<>();
        List<Character> x = new ArrayList<>();
        List<Character> y = new ArrayList<>();
        List<Character> z = new ArrayList<>();
        v.add('x');
        v.add('w');
        y.add('z');
        graph2.put('v', v);
        graph2.put('w', w);
        graph2.put('x', x);
        graph2.put('y', y);
        graph2.put('z', z);

        System.out.println(graph);
        System.out.println(hasPath(graph, 'f', 'k')); //true
        System.out.println(hasPath(graph2, 'v', 'z')); //false
    }
}
