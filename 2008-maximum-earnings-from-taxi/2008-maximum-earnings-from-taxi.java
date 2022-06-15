// Came up with a similar solution but instead of sorting on the start point, I did on the end point and found it a bit more intuitive. Also, eliminates the the first Math.max call since we are populating the dp array sequentially unlike what is done in OP's solution.
class Solution{
	public long maxTaxiEarnings(int n, int[][] rides) {
		Arrays.sort(rides, (a, b) -> Integer.compare(a[1], b[1]));
		long[] dp = new long[n + 1];
		int k = 0;

		for (int i = 1; i < dp.length; i++) {
			dp[i] = dp[i - 1];
			while (k < rides.length && i == rides[k][1]) {
				int[] ride = rides[k++];
				dp[i] = Math.max(dp[i], dp[ride[0]] + ride[1] - ride[0] + ride[2]);
			}
		}

		return dp[n];
	}
}