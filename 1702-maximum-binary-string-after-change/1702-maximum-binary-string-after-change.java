class Solution {
    public String maximumBinaryString(String binary) {
        
        int cnt0=0,leading1=0;
        for(char ch:binary.toCharArray()) {
            if(ch=='0') {
                cnt0++;
            } else if(cnt0==0) {
                leading1++;   
            }
        }
        if(cnt0<2) return binary;
        var chs=new char[binary.length()];
        Arrays.fill(chs,'1');
        chs[cnt0+leading1-1]='0';
        return new String(chs);
    
    }
}