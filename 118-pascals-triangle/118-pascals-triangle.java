class Solution {
    public List<List<Integer>> generate(int numRows) {
        // numRows=5
        // int []arr = new int[numRows];
        // for(int i=0;i<numRows;i++){
        //     arr[i]=i+1;
        // }
        
        // matrix[i][j] = matrix[i-1][j-1]+matrix[i-1][j]
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row ,prev=null;
        for(int i=0;i<numRows;i++){
            row= new ArrayList<>();
            for(int j=0;j<=i;j++){
                
                // in the corner the value is always 1
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    row.add(prev.get(j-1)+prev.get(j));
                }
            }
            prev=row;
            res.add(row);
        }
        return res;
        
    }
}