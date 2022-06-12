class Solution {
    public double averageWaitingTime(int[][] customers) {
     
        // first come first serve nonpremptive
        
//         for(int i=0;i<customers.length;i++){
//           //  for(int j=0;j<customers.length[0];j++){
//                 int ar=customers[i][0];
//                 tot=ar+customers[i][1];
//                 if(tot<nextarr){
//                     chef can start
//                 }
                
//             }
        
        //   int wait = 0, cur = 0;
        // for (int[] a: A) {
        //     cur = Math.max(cur,  a[0]) + a[1];
        //     wait += cur - 1.0 * a[0];
        // }
        // return 1.0 * wait / A.length;
        
        
        
        
        
        
        
        
          double totalWaitingTime = 0d;
		int startTime = 0, arrivalTime = 0, preparationTime = 0;

		for (int[] customer : customers) {
			arrivalTime = customer[0];
			preparationTime = customer[1];
			startTime = Math.max(startTime, arrivalTime);
			totalWaitingTime += preparationTime + (startTime - arrivalTime);
			startTime += preparationTime;
		}

		return totalWaitingTime / customers.length;
        
        
        }
        
    }
