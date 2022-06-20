class Solution {
    public int minimumLengthEncoding(String[] words) {
        
        // sorting on the basis of the length
        // as the string with more length is likely to include in the encoded string
        Arrays.sort(words,(a,b)-> b.length()-a.length());
        StringBuilder encoding = new StringBuilder();
        for(String s:words){
            if(encoding.indexOf(s+"#")==-1){
                encoding.append(s+'#');
                
            }
        }
        
        return encoding.length();
        // here the TC:  O(NlogN)         SC:  O(length of array)
        
        
        
        
        
        
        
        
    }
}