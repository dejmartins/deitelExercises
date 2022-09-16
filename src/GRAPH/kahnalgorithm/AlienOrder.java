package GRAPH.kahnalgorithm;

import java.util.*;

public class AlienOrder {

    public String alienOrder(String[] words){
        // Step 0: Create data structures and find all unique letters.
        Map<Character, List<Character>> adjList = new HashMap<>();
        Map<Character, Integer> count = new HashMap<>();
        for (String word : words){
            for(char c : word.toCharArray()){
                count.put(c, 0);
                adjList.put(c, new ArrayList<>());
            }
        }

        // Step 1: Find all edges.
        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];

            // Check that word2 is not a prefix of word1.
            if (word1.length() > word2.length() && word1.startsWith(word2)) return "";

            // Find the first non match and insert the corresponding relation.
            for (int j = 0; j < Math.min(word1.length(), word2.length()); j++) {
                if (word1.charAt(j) != word2.charAt(j)) {
                    adjList.get(word1.charAt(j)).add(word2.charAt(j));
                    count.put(word2.charAt(j), count.get(word2.charAt(j)) + 1);
                    break;
                }
            }
        }


            StringBuilder sb = new StringBuilder();
            Queue<Character> queue = new LinkedList<>();
            for(Character c : count.keySet()){
                if(count.get(c) == 0) queue.add(c);
            }

            while(!queue.isEmpty()){
                Character c = queue.poll();
                sb.append(c);
                for (Character next : adjList.get(c)) {
                    count.put(next, count.get(next) - 1);
                    if(count.get(next) == 0){
                        queue.add(next);
                    }
                }
            }

            if(sb.length() < count.size()){
                return "";
            }

            return sb.toString();
        }
    }
