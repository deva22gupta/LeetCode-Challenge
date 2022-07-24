class Solution {
   
         Pair getLine(int[] a, int[] b){//creates the <slope,y-intercept> pair for valid lines and creates <null, x-intercept> for vertical lines
        if(a[0]==b[0]) 
            return new Pair<>(null,(double)a[0]);
        return new Pair<>((double)(a[1]-b[1])/(double)(a[0]-b[0]), a[1]-((double)(a[1]-b[1])/(double)(a[0]-b[0]))*a[0]);
    }
    
    public int maxPoints(int[][] points) {
        int len=points.length,i,j,maxSize=1;
        HashMap<Pair,HashSet<Integer>> map = new HashMap<Pair,HashSet<Integer>>();
        Pair<Double,Double> line;        
        for(i=0;i<len;i++){
            for(j=i+1;j<len;j++){
                line=getLine(points[i],points[j]);
                HashSet<Integer> set;
                set=map.containsKey(line)? map.get(line) : new HashSet<Integer>();
                set.add(i);
                set.add(j);
                map.put(line,set);//adding points to the line 
                maxSize=Math.max(maxSize,set.size());//finding the maximum points in the same line
            }
        }        
        return maxSize;
    }
    }
