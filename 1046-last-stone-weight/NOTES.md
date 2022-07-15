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