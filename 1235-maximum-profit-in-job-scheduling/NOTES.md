https://leetcode.com/problems/maximum-profit-in-job-scheduling/discuss/409009/JavaC%2B%2BPython-DP-Solution
Sort the jobs by endTime.
​
dp[time] = profit means that within the first time duration,
we cam make at most profit money.
Intial dp[0] = 0, as we make profit = 0 at time = 0.
​
For each job = [s, e, p], where s,e,p are its start time, end time and profit,
Then the logic is similar to the knapsack problem.
If we don't do this job, nothing will be changed.
If we do this job, binary search in the dp to find the largest profit we can make before start time s.
So we also know the maximum cuurent profit that we can make doing this job.
​
Compare with last element in the dp,
we make more money,
it worth doing this job,
then we add the pair of [e, cur] to the back of dp.
Otherwise, we'd like not to do this job.
​
​
Complexity
Time O(NlogN) for sorting
Time O(NlogN) for binary search for each job
Space O(N)
​