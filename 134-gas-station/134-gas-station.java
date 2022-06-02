class Solution {
    public int canCompleteCircuit(int[] A, int[] B) {
        
             int sumA=0;int start=0;
                 int sumB=0;int diff=0;
// sum of the gases given in ist array should be greater than equal to the array of the cost B
                     int n1=A.length; int n2=B.length;

         for(int a:A) sumA+=a;
         for(int b:B)  sumB+=b;
         if (sumA<sumB) return -1;
       
       for(int i=0;i<A.length;i++){
             diff += (A[i]-B[i]);
             if(diff<0)
             {
                  start = i+1;
                  diff=0;
             }
         }
         return start;

    }
}