//{ Driver Code Starts
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
            int V = sc.nextInt();
            int E = sc.nextInt();

            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                adj.get(u).add(v);
            }

            Solution obj = new Solution();
            List<Integer> safeNodes = obj.eventualSafeNodes(V, adj);
            for (int i : safeNodes) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {

        // Your code here
        // Eventual safe states
        
        int vis[] = new int[V];
        int visPath[] = new int[V];
        int check[] = new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
               
               // if the cycle exists then return true and the nodes included in the cycle are also not safe
               
              dfs(adj,vis,visPath,check,i) ;
            }
            
        }
        List<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<V;i++){
            if(check[i]==1) {
                al.add(i);
            }
        }
        return al;
        
    }
    
    boolean dfs(List<List<Integer>> adj,int []vis,int []visPath,int []check,int i){
        
        vis[i]=1;
        visPath[i]=1;
      //  check[i]=0;
        for(int a:adj.get(i)){
            if(vis[a]==0){
                if(dfs(adj,vis,visPath,check,a)) return true;
            }   // here in the abpve you also have to return zero
            else if(vis[a]==1 && visPath[a]==1) return true;
        }
        visPath[i]=0;
        check[i]=1;
        return false;
        
    }
}
