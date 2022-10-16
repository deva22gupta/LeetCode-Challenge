//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.numberOfEnclaves(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
    // same as surrounded regions as here we need to mark those regions for which we can go off boundary
   class Pair{
       int row,col;
       Pair(int r,int c){
           row=r;
           col=c;
       }
   }
   

    int numberOfEnclaves(int[][] grid) {
       
        int row= grid.length;
        int col= grid[0].length;
        

       int vis[][] = new int[row][col];
      Queue<Pair> q = new LinkedList<>(); 
      

        // Your code here
        // loop around the boundaries
        // first row and last row
        for(int j=0;j<col;j++){
            
            /// first row
            if(vis[0][j]==0 && grid[0][j]==1) {
                q.add(new Pair(0,j));
                vis[0][j]=1;
                //bfs(vis,grid,0,j,row,col);
            }
            if(vis[row-1][j]==0 && grid[row-1][j]==1) {
                q.add(new Pair(row-1,j));
                vis[row-1][j]=1;
               // bfs(vis,grid,row-1,row,col);
                
            }
            
        }
        
        for(int i=0;i<row;i++){
            
            // first column
            if(vis[i][0]==0 && grid[i][0]==1){
                q.add(new Pair(i,0));
                vis[i][0]=1;
            //    bfs(vis,grid,i,0,row,col);
            }
            if(vis[i][col-1]==0 && grid[i][col-1]==1){
                q.add(new Pair(i,col-1));
                vis[i][col-1]=1;
                //bfs(vis,grid,i,col-1,row,col);
            }
         
        }
         int res =  bfs(vis,grid,q,row,col);
         return res;
    }
        
        int bfs(int [][]vis,int [][] grid,  Queue<Pair> q , int row,int col){
            int[] delrow={-1,0,+1,0};
            int[] delcol={0,-1,0,+1}; int count=0;
            while(!q.isEmpty()){
                Pair pp = q.poll();
                int r=pp.row;
                int c=pp.col;
                
                for(int k=0;k<4;k++){
                    int rr = r+delrow[k];
                    int cc = c+delcol[k];
                    
                    if(rr>0 && rr<row && cc>0 && cc<col && vis[rr][cc]==0 && grid[rr][cc]==1 ){
                        q.add(new Pair(rr,cc));
                        vis[rr][cc]=1;
                    }
                    
                }
                
                // the selected land will be those who are 0 in visited and 1 in grid land
                
                
                
                
            }
            
            for(int l=0;l<row;l++){
                for(int h=0;h<col;h++){
                    if(vis[l][h]==0 && grid[l][h]==1){
                        count++;
                    }
                }
            }
            return count;
            
        }
        
    
}