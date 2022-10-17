//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int V = Integer.parseInt(S[0]);
            int E = Integer.parseInt(S[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for(int i = 0; i < V; i++){
                adj.add(new ArrayList<Integer>());
            }
            for(int i = 0; i < E; i++){
                String[] s = br.readLine().trim().split(" ");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isBipartite(V, adj);
            if(ans)
                System.out.println("1");
            else System.out.println("0");
       }
    }
}
// } Driver Code Ends


class Solution
{
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        // for directed it has to be directed acyclic graph
        //If we are able to colour a graph with two colours such that no adjacent nodes have the same colour, 
        //it is called a bipartite graph
        
        // For undirected
        //Any linear graph with no cycle is always a bipartite graph. With cycle, any graph with an even cycle length can also be a bipartite graph. 
        //So, any graph with an odd cycle length can never be a bipartite graph.
        
        int [] vis = new int[V];
        Arrays.fill(vis,-1);
        
        
        for(int i=0;i<V;i++){
             if(vis[i]==-1){
                 if(bfs(vis,i,adj)== false) return false;
             }
        }
        return true;
        
        
    }
    
    
    boolean bfs(int [] vis,int i,ArrayList<ArrayList<Integer>>adj ){
        
        Queue<Integer> q = new LinkedList<>();
        
        q.add(i);
        vis[i]=0;
        while(!q.isEmpty()){
            int node=q.poll();
              for(int a : adj.get(node)){
            if(vis[a]==-1){
                q.add(a);
                vis[a] = 1-vis[node];
            }
            else if(vis[a]==vis[node]) return false;
        }
        }
        
      
        return true;
    }
}