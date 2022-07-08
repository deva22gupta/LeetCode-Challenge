class Solution {
    public List<Integer> majorityElement(int[] nums) {
     
        List<Integer> li = new ArrayList<>();
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        for(int x:hs.keySet()){
            if(hs.get(x)>nums.length/3) li.add(x);
        }
        return li;
    }
}