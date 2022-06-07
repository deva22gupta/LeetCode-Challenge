class Solution {
    public int singleNumber(int[] nums) {
       int ele=0;
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: hs.entrySet()){
            if(entry.getValue()==1){
                ele=entry.getKey();
            }
        }
        return ele;   
    }
}