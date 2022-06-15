class Solution {
    public boolean check(int[] A) {
        
        //Brute force and check if it is possible for a sorted array to start from each position.
        
           // int n = nums.length, dropPoint = 0;
           //  for (int i = 1; i < n; i++) {
           //      if (nums[i] < nums[i - 1]) dropPoint++;
           //  }
           //  if (dropPoint == 0) return true;
           //  if (dropPoint == 1 && nums[0] >= nums[n - 1]) return true;
           //  return false;
        
        
          int k = 0, n = A.length;
        for (int i = 0; i < n; ++i) {
            if (A[i] > A[(i + 1) % n]) {     // {2,1,3,4}
                k++;
            }
            if (k > 1) {
                return false;
            }
        }
        return true;
    }
}