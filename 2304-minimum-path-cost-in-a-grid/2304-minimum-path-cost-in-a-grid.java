class Solution {
   
        public int minPathCost(int[][] grid, int[][] moveCost) {
        int m = grid.length, n = grid[0].length;
        int[][] cost = new int[2][n];
        cost[0] = grid[0].clone();
        for (int r = 1; r < m; ++r) {
            for (int c = 0; c < n; ++c) {
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < n; ++j) {
                    min = Math.min(min, cost[1 - r % 2][j] + moveCost[grid[r - 1][j]][c]);
                }
                cost[r % 2][c] = min + grid[r][c];
            }
        }
        return IntStream.of(cost[1 - m % 2]).min().getAsInt();
    }
}
    