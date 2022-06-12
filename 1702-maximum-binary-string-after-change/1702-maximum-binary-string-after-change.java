class Solution {
    public String maximumBinaryString(String s) {
        
        // int cnt0=0,leading1=0;
        // for(char ch:binary.toCharArray()) {
        //     if(ch=='0') {
        //         cnt0++;
        //     } else if(cnt0==0) {
        //         leading1++;   
        //     }
        // }
        // if(cnt0<2) return binary;
        // var chs=new char[binary.length()];
        // Arrays.fill(chs,'1');
        // chs[cnt0+leading1-1]='0';
        // return new String(chs);
        
        
        
        
        
        
            //public String maximumBinaryString(String s) {
        int ones = 0, zeros = 0, n = s.length();
        StringBuilder res = new StringBuilder("1".repeat(n));
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == '0')
                zeros++;
            else if (zeros == 0)
                ones++;
        }
        if (ones < n)
            res.setCharAt(ones + zeros - 1, '0');
        return res.toString();
 //   }
    
    }
}