class Solution {
    public int candy(int[] A) {
        
        // go from left
        /// go from right
        // take the max no ofit
       // given are the ratings of the candidates in the input array
      // forming left and right array and taking the max out of it 

      int n =A.length;
      int left[]= new int [n];
     // int right[]= new int [n];
     int right=1;
     // int result[]= new int[n];
      Arrays.fill(left,1);
    //  Arrays.fill(right,1);
      for(int i=1;i<n;i++){
          if(A[i-1]<A[i]){
              left[i]=left[i-1]+1;
          }
      }
      for(int i=n-1;i>0;i--){
          if(A[i]<A[i-1]){
              right++;
              left[i-1]=Math.max(left[i-1],right);
          }
          else right=1;
      }

      // take the max
    //   for(int i=0;i<n;i++){
    //       result[i] = Math.max(left[i],right[i]);
    //   }
      int sum=0;
      for(int i=0;i<n;i++){
          sum+=left[i];
      }
      return sum;



    }
}