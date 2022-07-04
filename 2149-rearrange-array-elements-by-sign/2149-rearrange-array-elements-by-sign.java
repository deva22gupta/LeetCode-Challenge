class Solution {
 //   public int[] rearrangeArray(int[] nums) {
        
            public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int j = 0, k = 0;
        
        for (int i = 0; i < nums.length; i++) {
            while (j < nums.length && nums[j] < 0) j++;
            while (k < nums.length && nums[k] > 0) k++;
            
            result[i] = (i % 2 == 0) ? nums[j++] : nums[k++];
        }
        
        return result;
    }
}
    