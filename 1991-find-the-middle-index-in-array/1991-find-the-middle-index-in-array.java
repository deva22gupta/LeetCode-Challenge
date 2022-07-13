class Solution {
    public int findMiddleIndex(int[] nums) {
             // prefix sum checking by removing that index and checking the condition before adding it to prefix sum
        int total=0;
        for(int a:nums) total+=a;
        int prefixSum=0;
        for(int i=0;i<nums.length;i++){
            if(prefixSum*2==total-nums[i]) return i;
            prefixSum+=nums[i];
        }
        // if nothing matches 
        return -1;
    }
}