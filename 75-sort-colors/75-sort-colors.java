class Solution {
    public void sortColors(int[] arr) {
       // Arrays.sort(arr);
        // two pointer's approach 
        int l=0,h=arr.length-1,mid=0,temp=0;
        for(int i=0;i<arr.length;i++){
            switch(arr[mid]){
                case 0:{
                    // swap with the first
                    temp=arr[l];
                    arr[l]=arr[mid];
                    arr[mid]=temp;
                    l++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    
                    temp=arr[h];
                    arr[h]=arr[mid];
                    arr[mid]=temp;
                    h--;
                  //  mid++;
                    break;
                }
                        
                        
                        
                        
                        
                    
            }
            
        }
        
        
        
    }
}