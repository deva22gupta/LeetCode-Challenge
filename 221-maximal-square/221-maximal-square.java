class Solution {
    public int maximalSquare(char[][] matrix) {
        
        int row = matrix.length;
        int col = matrix[0].length;
        int largest=0;
        int dp[][] = new int[row+1][col+1];
        for(int i=1;i<row+1;i++){
            for(int j=1;j<col+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                if(matrix[i-1][j-1]=='1'){
                    dp[i][j]=1+Math.min(dp[i-1][j-1], Math.min(dp[i-1][j],dp[i][j-1]));
                    
                    if(largest<dp[i][j]) largest=dp[i][j];
                }
            }
        }
        /// returning the area
        return largest*largest;
        
    }
}