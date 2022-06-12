class UnionFind {
    int[] parents;
    public UnionFind(int size) {
        parents = new int[size];
        for (int i = 0; i < size; i++) {
            parents[i] = i;
        }
    }
    
    public int find(int node) {
        List<Integer> path = new ArrayList<>();
        while (node != parents[node]) {
            path.add(node);
            node = parents[node];
        }
        for (int p : path) {
            parents[p] = node;
        }
        return node;
    }
    
    public void union(int node1, int node2) {
        int root1 = find(node1);
        int root2 = find(node2);
        if (root1 != root2) {
            parents[root1] = root2;
        }
    }
}
class Solution {
    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
        List<int[]> reorderedQueries = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            reorderedQueries.add(new int[]{queries[i][0], 
                                           queries[i][1], 
                                           queries[i][2],
                                           i});
        }
        Collections.sort(reorderedQueries, (a, b) -> Integer.compare(a[2], b[2]));        
        Arrays.sort(edgeList, (a, b) -> Integer.compare(a[2], b[2]));
        
        UnionFind uf = new UnionFind(n);
        boolean[] res = new boolean[queries.length];
        for (int i = 0, j = 0; j < reorderedQueries.size(); j++) {
            while (i < edgeList.length && edgeList[i][2] < reorderedQueries.get(j)[2]) {                
                uf.union(edgeList[i][0], edgeList[i][1]);
                i++;
            }
            if (uf.find(reorderedQueries.get(j)[0]) == uf.find(reorderedQueries.get(j)[1])) {
                res[reorderedQueries.get(j)[3]] = true;
            }
        }
        return res;
    }
}