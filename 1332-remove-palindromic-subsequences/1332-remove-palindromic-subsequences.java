class Solution {
    public int removePalindromeSub(String s) {
        if(s.length()==0) return 0;
        for(int i=0,j = s.length()-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)) return 2;
            
          // else return 1;
        }
        return 1;
    }
        
    
        
     // boolean   isPalin(String str,int start,int end){
     //        while(start<=end){
     //            if(str.charAt(start)!=str.charAt(end)){
     //                return false;
     //            }
     //        }
     //        return true;
     //    }
        
        
        
    }
