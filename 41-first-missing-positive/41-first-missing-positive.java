class Solution {
    public int firstMissingPositive(int[] nums) {
     if(nums.length==1 && nums[0]==1) return 2; 
        int n=nums.length;
        int arr[]= new int[n];
        int ans=0;int ind=0;
        // storing general natural numbers
    HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
        // if(arr[i]!=i){
            ind=i;
         arr[i]=ind+1;
             
         }
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        for(int i=0;i<n;i++){
            if(hs.contains(arr[i])) continue;
             ans=arr[i];
            break;
        }
        return ans==0?n+1:ans;
        
    }
    
}