class Solution {
    public int minimumLengthEncoding(String[] words) {
        
//         // sorting on the basis of the length
//         // as the string with more length is likely to include in the encoded string
//         Arrays.sort(words,(a,b)-> b.length()-a.length());
//         StringBuilder encoding = new StringBuilder();
//         for(String s:words){
//             if(encoding.indexOf(s+"#")==-1){
//                 encoding.append(s+'#');
                
//             }
//         }
        
//         return encoding.length();
//         // here the TC:  O(NlogN)         SC:  O(length of array)
        
        
        
        
        
        //using hashset if present will remove from the set
        HashSet<String> hs = new HashSet<>(Arrays.asList(words));
        // already words are there in set
        for(String str:words){
            for(int i=1;i<str.length();i++){
                hs.remove(str.substring(i));
            }
        }
        
        
        int len=0;
        for(String s:hs){
            len+=s.length()+1;  // 1 is added for the length of hash
        }
        
        return len;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}