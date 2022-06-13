class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //dp
        // my first attempt

  // assume nums is not null
  if (nums.length == 0 || k == 0) {
    return new int[0];
  }
  int n = nums.length;
  int[] result = new int[n - k + 1]; // number of windows
  
  // left & right
  int[] left = new int[n];
  int[] right = new int[n];

  for (int i = 0; i < n; ++i) {
    // left
    if (i % k == 0) { // beginning of the group
      left[i] = nums[i];
    } else {
      left[i] = Math.max(left[i - 1], nums[i]);
    }
    
    // right (* to be improved)
    int temp = (i / k + 1) * k - 1; // last of the group
    if (temp > n - 1) temp = n - 1;
    
    int j = temp - i % k;
    if (j % k == (k - 1) || j == n - 1) {
      right[j] = nums[j];
    } else {
      right[j] = Math.max(right[j + 1], nums[j]);
    }
  }
  
  // dp
  for (int i = 0, j = i + k - 1; j < n; ++i, ++j) {
    result[i] = Math.max(right[i], left[j]);
  }
  
  return result;
}
    }
