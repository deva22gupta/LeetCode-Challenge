
   
    class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] adj = new List[numCourses];
        
        for (int i = 0; i < numCourses; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        int[] indegree = new int[numCourses];
        Queue<Integer> queue = new LinkedList();
        
        int finishCount = 0;
        for (int i = 0; i < prerequisites.length; i++) {
            int req = prerequisites[i][0];
            int prereq = prerequisites[i][1];
            adj[prereq].add(req);
            indegree[req]++;
        }
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }
        while (!queue.isEmpty()) {
            int course = queue.poll();
            finishCount++;
            for (int nextCourse : adj[course]) {
                indegree[nextCourse]--;
                if (indegree[nextCourse] == 0) {
                    queue.offer(nextCourse);
                }
            }
        }
        return finishCount == numCourses;
    }
}
    
