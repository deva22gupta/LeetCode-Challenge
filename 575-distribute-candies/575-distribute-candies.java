class Solution {
    public int distributeCandies(int[] A) {
     
        // you are given different types of candies (the candies count is equal to the length // of the array)
        
        // return the maximum number of different types of candies she can eat if she only 
        // eats n / 2 of them
    
        // count the no of types of candies
        // if we use HashMap
        
            int eligible= A.length/2;
       // HashMap<Integer,Integer> hs = new HashMap<>();
        
        
        
        // for(int i=0;i<A.length;i++){
        //     hs.put(A[i],hs.getOrDefault(A[i],0)+1);
        // }
        
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<A.length;i++){
            hs.add(A[i]);
        }
        return Math.min(hs.size(),eligible);
        // no of different types of candies
        
        
    }
}