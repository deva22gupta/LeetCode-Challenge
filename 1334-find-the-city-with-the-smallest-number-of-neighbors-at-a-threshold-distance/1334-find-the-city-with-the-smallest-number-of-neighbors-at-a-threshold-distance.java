class Solution {
   
        // based onfloyd warshall
        // can try it using dikstra  as negative weight is not given so try with that
        
        //    Time O(N^3)
  //  Space O(N^2)


  // its using floyd warshall algo or try it by using dijkstra



    public static int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dis = new int[n][n];
        int res = 0, smallest = n;
        for (int[] row : dis)
            Arrays.fill(row, 10001);    // as distance is upto 10^4 (here see the dstance array)   n is upto 10^2
        for (int[] e : edges)
            dis[e[0]][e[1]] = dis[e[1]][e[0]] = e[2];             // filling out  the distance for non directional graph
        for (int i = 0; i < n; ++i)
            dis[i][i] = 0;                       //  distance from itself is zero
        for (int k = 0; k < n; ++k)
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < n; ++j)
                    dis[i][j] = Math.min(dis[i][j], dis[i][k] + dis[k][j]);
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; ++j){
                if (dis[i][j] <= distanceThreshold)
                    ++count; }
            if (count <= smallest) {
                res = i;
                smallest = count;
            }
        }
        return res;
    }
}