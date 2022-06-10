class Solution {
    // HashTable and Sliding Window
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s==null) return 0;
        HashSet<Character> hs = new HashSet<>();
        int i=0,j=0,max=0;
      for(i=0;i<s.length();i++){
          char c = s.charAt(i);
          while(hs.contains(c)){
              hs.remove(s.charAt(j));
              j++;
          }
          // adding in hs
          hs.add(c);
          max=Math.max(max,i-j+1);
      }
        return max;
        
    }
}