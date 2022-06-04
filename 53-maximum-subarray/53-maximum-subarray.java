class Solution {
    public int maxSubArray(int[] nums) {
        int cur=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            cur+=nums[i];
         //   if(cur<0) cur=0;
            if(maxsum<cur){
                maxsum=cur;
            }
             if(cur<0) cur=0;
            
        }
        return maxsum;
    }
}