class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count=0;
        boolean arr[] = new boolean [nums.length];
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if (arr[i]==true) continue;
            count=1;
            arr[i]=true;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) {
                    count++;
                    arr[j]=true;
            }}
            if(count>nums.length/3) al.add(nums[i]);
        }
        return al;
    }
}