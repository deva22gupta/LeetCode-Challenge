class Solution {
    public int minPartitions(String str) {
     
        // find the max digit in the string
        
        int max=0;
        int len=str.length();
        for(int i=0;i<len;i++){
         //   int a=Integer.parseInt(str.charAt(i)-'0');
            int a=str.charAt(i)-'0';
            if(max<a) max=a;
            
        }
        return max;
        
        
        
    }
}