class Solution {
    public double averageWaitingTime(int[][] A) {
     
        // first come first serve nonpremptive
        
//         for(int i=0;i<customers.length;i++){
//           //  for(int j=0;j<customers.length[0];j++){
//                 int ar=customers[i][0];
//                 tot=ar+customers[i][1];
//                 if(tot<nextarr){
//                     chef can start
//                 }
                
//             }
        
          double wait = 0, cur = 0;
        for (int[] a: A) {
            cur = Math.max(cur,  a[0]) + a[1];
            wait += cur - 1.0 * a[0];
        }
        return 1.0 * wait / A.length;
        
        
        }
        
    }
