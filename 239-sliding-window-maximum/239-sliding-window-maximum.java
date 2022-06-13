class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
  
  // assume nums is not null
//   int n = nums.length;
//   if (n == 0 || k == 0) {
//     return new int[0];
//   }
  
//   int numOfWindow = n - k + 1;
//   int[] result = new int[numOfWindow]; // number of windows
  
//   for (int start = 0; start < numOfWindow; ++start) {
//     int end = start + k - 1;
//     int maxVal = nums[start];
//     for (int i = start + 1; i <= end; ++i) {
//       if (nums[i] > maxVal) { // update
//         maxVal = nums[i];
//       }
//     }
//     result[start] = maxVal;
//   }
  
//   return result;
       
        
        
        
        
        
        
        
        
        
        
        
        // using priorityqueue
        //public int[] maxSlidingWindow(int[] nums, int k) {
  // assume nums is not null
//   if (nums.length == 0 || k == 0) {
//     return new int[0];
//   }
//   int n = nums.length;
//   int[] result = new int[n - k + 1]; // number of windows
  
//   PriorityQueue<Integer> maxPQ = new PriorityQueue<>((o1, o2) -> (o2 - o1)); // stores values
  
//   for (int i = 0; i < n; ++i) {
//     int start = i - k;
//     if (start >= 0) {
//       maxPQ.remove(nums[start]); // remove the out-of-bound value
//     }
//     maxPQ.offer(nums[i]);
//     if (maxPQ.size() == k) {
//       result[i - k + 1] = maxPQ.peek();
//     }
//   }
//   return result;
        
        
        
        
        
        
        
        
        
        // third method
        // Use indices since they are unique

  // assume nums is not null
//   if (nums.length == 0 || k == 0) {
//     return new int[0];
//   }
//   int n = nums.length;
//   int[] result = new int[n - k + 1]; // number of windows
  
//   PriorityQueue<Integer> maxPQ = new PriorityQueue<>((i1, i2) -> (nums[i2] - nums[i1])); // stores values
  
//   for (int i = 0; i < n; ++i) {
//     int start = i - k;
//     if (start >= 0) {
//       maxPQ.remove(start); // remove the out-of-bound value by index
//     }
//     maxPQ.offer(i);
//     if (maxPQ.size() == k) {
//       result[i - k + 1] = nums[maxPQ.peek()];
//     }
//   }
//   return result;
        
        
        
        
        
        
        
        
        
        
        
        
      //  public int[] maxSlidingWindow(int[] nums, int k) {
  // assume nums is not null
//   int n = nums.length;
//   if (n == 0 || k == 0) {
//     return new int[0];
//   }
//   int[] result = new int[n - k + 1]; // number of windows
//   Deque<Integer> win = new ArrayDeque<>(); // stores indices
  
//   for (int i = 0; i < n; ++i) {
//     // remove indices that are out of bound
//     while (win.size() > 0 && win.peekFirst() <= i - k) {
//       win.pollFirst();
//     }
//     // remove indices whose corresponding values are less than nums[i]
//     while (win.size() > 0 && nums[win.peekLast()] < nums[i]) {
//       win.pollLast();
//     }
//     // add nums[i]
//     win.offerLast(i);
//     // add to result
//     if (i >= k - 1) {
//       result[i - k + 1] = nums[win.peekFirst()];
//     }
//   }
//   return result;
        
        
        
      //  public int[] maxSlidingWindow(int[] nums, int k) {
  // assume nums is not null
  int n = nums.length;
  if (n == 0 || k == 0) {
    return new int[0];
  }
  int[] result = new int[n - k + 1]; // number of windows
  Deque<Integer> win = new ArrayDeque<>(); // stores indices
  
  for (int i = 0; i < n; ++i) {
    // remove indices that are out of bound
    while (win.size() > 0 && win.peekFirst() <= i - k) {
      win.pollFirst();
    }
    // remove indices whose corresponding values are less than nums[i]
    while (win.size() > 0 && nums[win.peekLast()] < nums[i]) {
      win.pollLast();
    }
    // add nums[i]
    win.offerLast(i);
    // add to result
    if (i >= k - 1) {
      result[i - k + 1] = nums[win.peekFirst()];
    }
  }
  return result;
}

    }
