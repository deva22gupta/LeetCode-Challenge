class Solution {
    public int longestStrChain(String[] words) {
//         Instead of adding a character, try deleting a character to form a chain in reverse.
// For each word in order of length, for each word2 which is word with one character removed, length[word2] = max(length[word2], length[word] + 1).
        
        
        //   Map<String, Integer> dp = new HashMap<>();
        // Arrays.sort(words, (a, b)->a.length() - b.length());
        // int res = 0;
        // for (String word : words) {
        //     int best = 0;
        //     for (int i = 0; i < word.length(); ++i) {
        //         String prev = word.substring(0, i) + word.substring(i + 1);
        //         best = Math.max(best, dp.getOrDefault(prev, 0) + 1);
        //     }
        //     dp.put(word, best);
        //     res = Math.max(res, best);
        // }
        // return res;
        
        
        
        
        // dfs solution with memo 
          
//         int ans = 0;
//         Set<String> set = new HashSet<>();
//         Map<String, Integer> map = new HashMap<>();
//         for(String word : words) set.add(word);
//         for(String word : words) ans = Math.max(ans, helper(map, set, word));
//         return ans;
//     }
    
//     private int helper(Map<String, Integer> map, Set<String> set, String word){
//         if(map.containsKey(word)) return map.get(word);
//         int cnt = 0;
//         for(int i = 0; i < word.length(); i++){
//             String next = word.substring(0, i) + word.substring(i+1);
//             if(set.contains(next)){
//                 cnt = Math.max(cnt, helper(map, set, next));
//             }
//         }
//         map.put(word, 1 + cnt);
//         return 1 + cnt;
    
        
        
        
        
        
        
        
        
        
        
        
    //    public int longestStrChain(String[] words) {
    Arrays.sort(words, new StringByLengthComparator());
    int[] dp = new int[words.length];
    int maxLen = 0;
    for (int i = 0; i < words.length; i++) {
        dp[i] = 1;
        for (int j = i - 1; j >= 0 && words[i].length() - words[j].length() <= 1; j--) {
            if (isPredecessor(words[j], words[i])) {
                dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        maxLen = Math.max(maxLen, dp[i]);
    }
    return maxLen;
}

 private boolean isPredecessor(String s1, String s2) {
    if (s2.length() == s1.length()) return false;
    int diff = 0;
    for (int i = 0, j = 0; i < s1.length(); ) {
        if (s1.charAt(i) == s2.charAt(j)) {
            i++;
            j++;
        } else {
            diff++;
            if (diff > 1) return false;
            j++;
        }
    }
    return true;
}

private static class StringByLengthComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }
}
        
        
    }
