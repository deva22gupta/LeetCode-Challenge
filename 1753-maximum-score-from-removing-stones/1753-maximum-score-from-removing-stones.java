class Solution {
    public int maximumScore(int a, int b, int c) {
        
       // Given three integers a​​​​​, b,​​​​​ and c​​​​​, return the maximum score you can get.
        
        //   Queue<Integer> q = new PriorityQueue<>((n1, n2) -> n2 - n1);
        // int[] arr = new int[]{a, b, c} ;
        // for(int val : arr) {
        //   q.offer(val);
        // }
        // int score = 0;
        // int m1, m2;
        // while ((m1 = q.poll()) > 0 && (m2 = q.poll()) > 0) {
        //   score++;
        //   q.offer(m1 - 1);
        //   q.offer(m2 - 1);
        // }
        // return score;
        
        
        // a>b>c simulation technique
      
    if (a < b)
        return maximumScore(b, a, c);
    if (b < c)
        return maximumScore(a, c, b);
    return b == 0 ? 0 : 1 + maximumScore(a - 1, b - 1, c); 
        
        
        
    }
}