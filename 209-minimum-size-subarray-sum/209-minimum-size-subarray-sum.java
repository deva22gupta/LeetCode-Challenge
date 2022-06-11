class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int cursum=nums[i];
            if(cursum>=target){
              return 1;  
            }
            for(int j=i+1;j<n;j++){
                cursum+=nums[j];
                if(cursum>=target && (j-i+1)<min){
                    min=j-i+1;
                    break;
                }
            }
            
        }
        if(min>0 && min!=Integer.MAX_VALUE){
            return min;
        }else return 0;
        
        
    }
}