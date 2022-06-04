class NumArray {
    int []arr;

    public NumArray(int[] nums) {
        int sum=0;
        int n=nums.length;
        arr = new int[n];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            arr[i]=sum;
            
        }
        // -2 -2 1 -4 -2 -3  arr
    }
    
    public int sumRange(int left, int right) {
       int res=0;
        if(left==0){
            res=arr[right];
        }else{
            res=arr[right]-arr[left-1];
        }
        return res;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */