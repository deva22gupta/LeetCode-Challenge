class Solution {
    public long maxTaxiEarnings(int n, int[][] rides) {
        
        int size = rides.length;
        Arrays.sort(rides, (a, b)->a[1] - b[1]);
        TreeMap<Integer, Long> dp = new TreeMap<>();
        dp.put(0, 0L);
        for (int[] ride : rides) {
            long cur = dp.floorEntry(ride[0]).getValue() + (ride[1] - ride[0] + ride[2]);
            if (cur > dp.lastEntry().getValue())
                dp.put(ride[1], cur);
        }
        return dp.lastEntry().getValue();
    }
    }
