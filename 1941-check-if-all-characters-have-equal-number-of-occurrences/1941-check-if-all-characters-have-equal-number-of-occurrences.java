class Solution {
    public boolean areOccurrencesEqual(String s) {
        // HashMap<String,Integer> hs = new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     hs.put(s.charAt(i),hs.put(hs.getOrDefault(s.charAt(i)),0)+1);
        // }
        // for(Map.Entry<String,Integer> me : hs.entryMap()){
        //     // if me.getvalues are not matching then it will return false
        // }
        
        
        
        
        
          if (s.length() == 1)
            return true;
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int freq = map.get(s.charAt(0));
        for (char key : map.keySet()) {
            if (map.get(key) != freq)
                return false;
        }
        return true;
    }
}