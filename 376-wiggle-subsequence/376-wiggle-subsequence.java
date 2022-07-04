class Solution {
    public int wiggleMaxLength(int[] a) {
     
        
        // longest wiggle sequence
        //Dp solution 
          // but there is alinear solution which is better than a dp solution 
        // in which you just have rto count all the peaks
         // public static int wiggleDPSolution(int[] a) {
        if(a.length < 2) return a.length;
        int inc[] = new int[a.length], dec[] = new int[a.length];
        Arrays.fill(inc,1);
        Arrays.fill(dec,1);        
        int ans = 1;
        for(int i=1;i<a.length;i++) {
            for(int j=0;j<i;j++) {
                if(a[j] < a[i]) inc[i] = Math.max(inc[i],1+dec[j]);
                if(a[j] > a[i]) dec[i] = Math.max(dec[i],1+inc[j]);
            }
            ans = Math.max(ans,Math.max(inc[i],dec[i]));
        }
        return ans;
    }
        
        
        
        
        
        
        
        
    }