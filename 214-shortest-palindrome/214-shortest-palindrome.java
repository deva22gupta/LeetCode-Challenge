class Solution {
    public String shortestPalindrome(String s) {
        
        // u have to make shortest palindrome
        // you can only add in front of it
      
    int i = 0, end = s.length() - 1, j = end; char chs[] = s.toCharArray();
    while(i < j) {
         if (chs[i] == chs[j]) {
             i++; j--;
         } else { 
             i = 0; end--; j = end;
         }
    }
    return new StringBuilder(s.substring(end+1)).reverse().toString() + s;
        
        
    }
}