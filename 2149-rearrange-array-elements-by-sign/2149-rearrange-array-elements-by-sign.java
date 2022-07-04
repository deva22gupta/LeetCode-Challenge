class Solution {
    public int[] rearrangeArray(int[] nums) {
     int n= nums.length;
        int arrp [] = new int[n/2];
        int arrn[] = new int [n/2];
        int p=0,k=0,l=0;
        boolean flag=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                arrp[p]=nums[i];
                p++;
            }else{
                arrn[k]=nums[i];
                k++;
            }
            
        }
        p=0;k=0;
        while(l<nums.length){
            if(flag){
                
                nums[l]=arrp[p];
                p++;
            }
            else{
                nums[l]=arrn[k];
                k++;
            }
            l++;
            flag=!flag;
        }
        
        
        //3 1 -2 -3 2 -4
        // 3 1 2
        // -2 -3 -4
        
        
        
        return nums;
    }
}