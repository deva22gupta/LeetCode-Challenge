class Solution {
    public int lastStoneWeight(int[] stones) {
       // PriorityQueue<Integer> pq = new PriorityQueue<>((stones,a,b) -> b-a );
        
             //Queue<Integer> maxPq = new PriorityQueue<>(stones.length, Comparator.reverseOrder());
        	    Comparator cmp = new Comparator<Integer>(){
        public int compare(Integer first, Integer second){
            return second.compareTo(first);
        }
    };
    Queue<Integer> maxPq = new PriorityQueue<>(cmp);
		
        for (int stone : stones) {
            maxPq.add(stone);
        }
        while (maxPq.size() >= 2) {
            int y = maxPq.poll();
            int x = maxPq.poll();
            if (y > x) {
                maxPq.add(y - x);
            }
        }
        return maxPq.isEmpty() ? 0 : maxPq.peek();
    }
}