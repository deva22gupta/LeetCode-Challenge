class Solution {
    public int countHomogenous(String s) {
        
       // int m=1e9+7;
//         int m=1000000007;
//         if(s.length()==0) return 0;
//         int sum=1;   // as 1 character itself will always be homogeneous
        
//         // else count the no of substrings from left side
        
//         int arr[] = new int[s.length()];
//         Arrays.fill(arr,1);
//         int n=s.length();
//         for(int i=1;i<n;i++){
//           //  arr[i]=1;
            
//             if(s.charAt(i)==s.charAt(i-1)){
//                 arr[i]=(1+arr[i-1]%m);
//             }
//             sum=(sum%m+arr[i]%m);
//         }
//         return sum%m;
        
        
        
          int res = 0, cur = 0, count = 0, mod = 1_000_000_007;
        for (int i = 0; i < s.length(); ++i) {
            count = s.charAt(i) == cur ? count + 1 : 1;
            cur = s.charAt(i);
            res = (res + count) % mod;
        }
        return res;
        
        
    }
}