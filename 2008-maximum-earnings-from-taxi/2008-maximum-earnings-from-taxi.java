class Solution {
    public long maxTaxiEarnings(int n, int[][] rides) {
          // we don't care about the @param n, we care about the length of the @param rides array
        n = rides.length;
        // Sort by the ending position of route
        Arrays.sort(rides, Comparator.comparingInt(e -> e[1]));
        // dp[i] -> the maximum gain for stopping at rides[i][1]
        long[] dp = new long[n];
        for (int i = 0; i < n; i++) {
            long[] ride = transform(rides[i]);
            long gain = calc(ride);
            if (i == 0) {
                dp[i] = calc(ride);
                continue;
            }
            // either you opt in for this ride, or you don't
            dp[i] = Math.max(gain, dp[i - 1]);
            // binary search for the largest j where j < i and rides[j][1] <= ride[0]
            int j = search(rides, 0, i - 1, ride[0]);
            if (j >= 0) {
                dp[i] = Math.max(dp[i], dp[j] + gain);
            }
        }
        return dp[n - 1];
    }

    int search(int[][] rides, int l, int r, long target) {
        while (r - l > 1) {
            int m = l + (r - l) / 2;
            if (rides[m][1] <= target) {
                l = m;
            } else {
                r = m;
            }
        }
        if (rides[r][1] <= target) {
            return r;
        }
        if (rides[l][1] <= target) {
            return l;
        }
        return -1;
    }

    long calc(long[] arr) {
        return arr[1] - arr[0] + arr[2];
    }

    long[] transform(int[] arr) {
        long[] ret = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i] = (long) arr[i];
        }
        return ret;
    }
    }
