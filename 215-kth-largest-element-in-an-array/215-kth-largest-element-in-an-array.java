class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        // sort priority queue in descending order
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);
        for(int i=0;i<nums.length;i++){
            
            pq.offer(nums[i]);
        }
        while(k>1){
            pq.poll();
            k--;
            
        }
        return pq.peek();
        
        
    }
}