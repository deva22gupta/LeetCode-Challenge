class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
     
        // Let's change the question if we know the maximum size of a bag what is the minimum number          // of bags you can make
        
        // note that as the maximum size increases the minimum number of bags decreases so we can             // binary search the maximum size
        int max=0;
        
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        int h=max;
        int l=1;
        int res=h;
        while(l<h){
            int penalty=(l+h)/2;
            int ops=0;
            // now iterating the array
            for(int i=0;i<nums.length;i++){
                
                // this is after removing the condition
            //    if(nums[i]>penalty) {   // if the penalty is greater than the element
                if(nums[i]%penalty==0){
                    ops+=nums[i]/penalty-1;     // 6/3  = 2  so 1 operation
                }
                else{
                      ops+=nums[i]/penalty;
                }
              //  }
                
                
            }  // end of for loop
            
            // if operations is still less then we can reduce the penalty here by decreasing it
            if(ops<=maxOperations){
                res=penalty;
                h=penalty;     // here decreaing the high index by assignuing value of penalty
                
            }else{
                l=penalty+1;   // here increasing the penalty as operations exceed the maxop given
            }
            
            
            
            
            
        }// end of while loop
        
        
        
        return res;
        
        
        
        
        
        
        
    }
}