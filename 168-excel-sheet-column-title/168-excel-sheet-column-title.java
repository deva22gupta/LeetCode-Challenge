class Solution {
    public String convertToTitle(int n) {
        
        StringBuilder res = new StringBuilder();
    while(n > 0){
      res.append((char)('A' + (--n % 26)));
      n /= 26;
    }
    return res.reverse().toString();
    }
}