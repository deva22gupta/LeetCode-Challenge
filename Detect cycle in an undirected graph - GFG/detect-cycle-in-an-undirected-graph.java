// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends

class Node{
    int first;int second;
    Node(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[] = new boolean[V];
        
        for(int i=0;i<V;i++){
            if(vis[i]==false ) {
               if( bfs(i,vis,adj)) {
                   return true;
               }
            }
        }
        return false;
    }
    boolean bfs(int i,boolean vis[],ArrayList<ArrayList<Integer>> adj){
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(i,-1));
        vis[i]=true;
        while(!q.isEmpty()){
        Node n=q.poll();
        int a=n.first;
        int p=n.second;
        
        // a is the parent
        for(int nei:adj.get(a)){
            if(!vis[nei]){
                q.add(new Node(nei,a));
                vis[nei]=true;
            }
            else if(nei!=p) return true;
        }
        
            }
            return false;
    }
    
}