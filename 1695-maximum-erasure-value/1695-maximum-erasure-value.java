class Solution {
   public int maximumUniqueSubarray(int[] nums) {
    boolean[] vis = new boolean[10001];
    int i = 0, j = 0, sum = 0, res = 0;

    while(j < nums.length){
        while(j < nums.length && !vis[nums[j]]){//expand the window
            vis[nums[j]] = true;
            sum += nums[j++];
        }

        res = Math.max(res, sum);

        while(j < nums.length && vis[nums[j]]){//shrink the window
            vis[nums[i]] = false;
            sum -= nums[i++];
        }
    }
    return res;
}
}