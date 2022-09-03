class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        
        List<Integer> li = new ArrayList<>();
        for(int i=1;i<10;i++){
            dfs(i,i,n-1,k,li);
        }
        int [] res= new int[li.size()];
        for(int i=0;i<li.size();i++){
            res[i]=li.get(i);
        }
        return res;
    }
    
    void dfs(int i,int digit,int n,int k,List<Integer> li){
        
        // if the remaining left becomes zero then u have to add it to the last
        if(n==0){
            li.add(i);
            return;
        }
        
        if(digit+k<=9){
            dfs(i*10+(digit+k),digit+k,n-1,k,li);
        }
        
        if(k!=0 && digit-k>=0){
              dfs(i*10+(digit-k),digit-k,n-1,k,li);
        }
    }
}