class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        // Return the maximum score you can get by erasing exactly one subarray.
        
        //Sliding Window
        HashSet<Integer> hs = new HashSet<>();
        int i=0,j=0,sum=0,ans=0;
        while(i<nums.length && j<nums.length){
            
            if(!hs.contains(nums[i])){
                sum+=nums[i];
                ans=Math.max(ans,sum);  // Max score to return
                
                hs.add(nums[i++]);
            }else{
                sum-=nums[j];
                hs.remove(nums[j++]);
            }
            
        }
        return ans;
        
        
        
    }
}