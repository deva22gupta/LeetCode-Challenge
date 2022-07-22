class Solution {
    public int jump(int[] A) {
        int jumps = 0, curEnd = 0, curFarthest = 0;
	for (int i = 0; i < A.length; i++) {
        if (i > curFarthest) return -1;
		curFarthest = Math.max(curFarthest, i + A[i]);
		if (i < A.length-1 && i == curEnd) {
			jumps++;
			curEnd = curFarthest;
		}
	}
	return jumps;
    }
}