class Solution {
    public int countHomogenous(String s) {
        
       // int m=1e9+7;
        int m=1000000007;
        if(s.length()==0) return 0;
        int sum=1;   // as 1 character itself will always be homogeneous
        
        // else count the no of substrings from left side
        
        int arr[] = new int[s.length()];
        Arrays.fill(arr,1);
        int n=s.length();
        for(int i=1;i<n;i++){
          //  arr[i]=1;
            
            if(s.charAt(i)==s.charAt(i-1)){
                arr[i]=(1+arr[i-1]%m);
            }
            sum=(sum%m+arr[i]%m);
        }
        return sum%m;
        
    }
}