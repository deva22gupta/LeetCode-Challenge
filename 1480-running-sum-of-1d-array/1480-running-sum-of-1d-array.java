class Solution {
    public int[] runningSum(int[] nums) {
     int sum=0;
        int n= nums.length;int k=0;
        int arr[] = new int[n];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<=i;j++){
                sum+=nums[j];
            }
            arr[i]=sum;
            sum=0;
        }
        return arr;
    }
    
}