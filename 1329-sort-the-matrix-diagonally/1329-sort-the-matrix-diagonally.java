class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        int k=0;
        HashMap<Integer,PriorityQueue<Integer>> hs = new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                k=(i-j);
                PriorityQueue<Integer> pq = hs.getOrDefault(k,new PriorityQueue<>());
                pq.offer(mat[i][j]);
                hs.put(k,pq);
                
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                k=i-j;
                PriorityQueue<Integer> pq = hs.get(k);
                mat[i][j]=pq.poll();
            }
        }
        return mat;
        
    }
}

//  difference is 3    1
// difference is  2   1

