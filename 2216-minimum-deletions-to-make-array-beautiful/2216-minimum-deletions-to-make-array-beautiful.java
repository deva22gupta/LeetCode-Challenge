class Solution {
    public int minDeletion(int[] nums) {
     
        
        /* The Idea is when you delete a element from array (ie.by increasing count) then the condition will change from 
  this  (nums[i] != nums[i + 1]) for all i % 2 == 0  to  nums[i] != nums[i + 1] for all i % 2 != 0
  **bcuz after deleting every postion reduced by 1. So Odd posn becomes Even and Even becomes Odd**
 
   1. Initialize a flag and when  count increases (ie.. you delete that element) reverse your flag bcuz now position will reduced 
   2. Count if it condition is true
*/
        // nums.length() is even
        //  nusm[2]!=nums[3]  nums[1] can be equal to nums[2]  positions in order of even and odd should not be equal
        // empty array is also beautiful
        
         int reversed = 0, res = 0;
        
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1] && reversed == i % 2) {
                reversed ^= 1;// trick  usage of xor to reverse the position
                res++;
            }
        }
        return (nums.length - res) % 2 + res;
        
        
        
        
    }
}