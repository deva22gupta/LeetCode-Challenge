// { Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        
        // subarray sumis zero
        // int sum=0,max=0;
        // for(int i=0;i<n;i++){
        //     sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=arr[j];
        //         if(sum==0){
        //             max=Math.max(max,j-i+1);
        //         }
        //     }
            
        // }
        // return max;
        // if we encountereda sum again then it would have met a zero sum
        // doing a prefix sum
        // Sum vs Index
        int sum=0,max=0;
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            
            if(sum==0) max=i+1;
            if(hs.get(sum)!=null){
                max=Math.max(max,i-hs.get(sum));
            }
            else
            hs.put(sum,i);
        }
        return max;
        
        
        
        
        
    }
}