https://leetcode.com/problems/longest-string-chain/discuss/294890/JavaC%2B%2BPython-DP-Solution
Agreed. This problem is a perfect example where top-down DP with memoization outperforms bottom up in time complexity.
Sort the words by word's length. (also can apply bucket sort)
For each word, loop on all possible previous word with 1 letter missing.
If we have seen this previous word, update the longest chain for the current word.
Finally return the longest word chain.
​
​
Complexity
Time O(NlogN) for sorting,
Time O(NSS) for the for loop, where the second S refers to the string generation and S <= 16.
Space O(NS)
​
Java version based on https://leetcode.com/problems/longest-increasing-subsequence/description/
​
​