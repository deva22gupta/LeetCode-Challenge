class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int res[] = new int[2];
//         for(int i=0,j=numbers.length-1;i<j;i++,j--){
           
//             // already sorted
//             if(numbers[i]+numbers[j]==target){
//                 res[0]=i+1;
//                 res[1]=j+1;
//             }
//         }
        
        //here using two loops
//         for(int i=0;i<numbers.length;i++){
//             for(int j=0;j<i;j++){
//                 if(numbers[i]+numbers[j]==target){
//                     res[0]=j+1;
//                     res[1]=i+1;
//                 }
//             }
//         }
        int n=numbers.length;
       //   if (numbers == null || numbers.length < 2) return res;
        
         for(int i=0,j=n-1;i<j;){
             
             int sum=numbers[i]+numbers[j];
             if(sum==target){
                 res[0]=i+1;
                 res[1]=j+1;
                 break;
             }
              if(sum<target){
                 i++;
             }
             if(sum>target)
             {
                 j--;
             }
             
             
             
             
         }
        
        
        return res;
    }
}