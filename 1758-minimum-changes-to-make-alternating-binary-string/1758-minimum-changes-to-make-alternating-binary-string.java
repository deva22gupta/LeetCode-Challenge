class Solution {
    public int minOperations(String s) {
        
//         Think about how the final string will look like.
// It will either start with a '0' and be like '010101010..' or with a '1' and be like '10101010..'
// Try both ways, and check for each way, the number of changes needed to reach it from the given string. The answer is the minimum of both ways
        int res=0;
        int n=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'0'!=i%2) res++;
        }
        return Math.min(res,n-res);
        
        
        
        
    }
}