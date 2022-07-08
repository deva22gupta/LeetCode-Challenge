class Solution {
    public int majorityElement(int[] arr) {
        int n=arr.length,ans=0;
      for (int i = 0; i < n; i++) {
      int cnt = 1;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] == arr[i])
          cnt++;
      }

      if (cnt > (n / 2))
      ans= arr[i];
    } 
        return ans;
    }
    
}
