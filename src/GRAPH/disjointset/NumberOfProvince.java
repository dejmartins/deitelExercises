package GRAPH.disjointset;

public class NumberOfProvince {

    static class UnionFind{
        private final int[] root;
        private final int[] rank;
        private int count;

        public UnionFind(int size){
            root = new int[size];
            rank = new int[size];
            count = size;

            for (int i = 0; i < size; i++) {
                root[i] = i;
                rank[i] = 1;
            }
        }

        public int find(int vertex){
            if(root[vertex] == vertex) return vertex;
            return root[vertex] = find(root[vertex]);
        }

        public void union(int x, int y){
            int rootX = find(x);
            int rootY = find(y);

            if(rootX != rootY){
                if(rank[rootX] > rank[rootY]) root[rootY] = rootX;
                else if (rank[rootY] > rank[rootX]) root[rootX] = rootY;
                else {
                    root[rootY] = rootX;
                    rank[rootX]++;
                }
                count--;
            }
        }

        public int getCount(){
            return count;
        }
    }


    public int findCircleNum(int[][] isConnected){
        UnionFind uf = new UnionFind(isConnected.length);
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[i].length; j++) {
                if(isConnected[i][j] == 1) uf.union(i, j);
            }
        }

        return uf.getCount();
    }
}
