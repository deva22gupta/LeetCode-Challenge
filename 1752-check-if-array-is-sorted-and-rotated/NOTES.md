Compare all neignbour elements (a,b) in A,
the case of a > b can happen at most once.
​
Note that the first element and the last element are also connected.
​
If all a <= b, A is already sorted.
If all a <= b but only one a > b,
we can rotate and make b the first element.
Other case, return false.
​
​
Complexity
Time O(n)
Space O(1)
​
https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/discuss/1053508/JavaC%2B%2BPython-Easy-and-Concise