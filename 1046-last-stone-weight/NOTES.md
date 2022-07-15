Put all elements into a priority queue.
Pop out the two biggest, push back the difference,
until there are no more two elements left.
​
Complexity
Time O(NlogN)
Space O(N)
​
public int lastStoneWeight(int[] A) {
PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> b - a);
for (int a : A)
pq.offer(a);
while (pq.size() > 1)
pq.offer(pq.poll() - pq.poll());
return pq.poll();
}
public int lastStoneWeight(int[] stones) {
Queue<Integer> maxPq = new PriorityQueue<>(stones.length, Comparator.reverseOrder());
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
Comparator cmp = new Comparator<Integer>(){
public int compare(Integer first, Integer second){
return second.compareTo(first);
}
};
Queue<Integer> heap = new PriorityQueue<>(cmp);
https://youtu.be/JcxHbLyjELY?t=1
​
​
​
​
​