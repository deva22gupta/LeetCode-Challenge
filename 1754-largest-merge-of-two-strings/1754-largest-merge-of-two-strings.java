class Solution {
    public String largestMerge(String word1, String word2) {
        
        
//         Build the result character by character. At each step, you choose a character from one of the two strings.
// If the next character of the first string is larger than that of the second string, or vice versa, it's optimal to use the larger one.
// If both are equal, think of a criteria that lets you decide which string to consume the next character from.
// You should choose the next character from the larger string.
        
//         int n1=word1.length();
//         int n2=word2.length();
//         int i=0,j=0;
//         StringBuilder strr = new StringBuilder();
//      //   String str="";
//         while(i<n1 && j<n2){
//             if(word1.charAt(i)>word2.charAt(j)){
//                 strr.append(word1.charAt(i++));
//             }
//             else if (word1.charAt(i)<word2.charAt(j)){
//                 strr.append(word2.charAt(j++));
//             }
            
//             else {
//                  strr.append(word1.charAt(i++)).append(word2.charAt(j++));
//                 // i++;
//                 // j++;
//             }
//         }
//         return strr.toString();
        
        
        
            int p1 = 0;
            int p2 = 0;
            StringBuilder sb = new StringBuilder();
            
            while(p1 < word1.length() || p2 < word2.length()) {
                char c1 = p1 < word1.length() ? word1.charAt(p1) : 0;
                char c2 = p2 < word2.length() ? word2.charAt(p2) : 0; 
                if(c1 == c2) {
                    // Use the remainder of the word as tie breaker
                    // to help decide which pointer to increment
                    if(word1.substring(p1).compareTo(word2.substring(p2)) > 0) {
                        c2 = 0;
                    } else {
                        c1 = 0;
                    }
                }
                if(c1 > c2) {
                    sb.append(c1);
                    p1++;
                } else {
                    sb.append(c2);
                    p2++;
                }
            }
            
            return sb.toString();
        
        
    }
}