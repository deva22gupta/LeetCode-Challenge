//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int l=0;
        int h=n-1;
        int mid=0;
       // int  mid=l+(h-l)/2;
        
        // wrong apprach at the start
        // while(mid<0){
            
        //     if(k>m)  binarysearch(arr, n, k)
            
       while(l<=h){
           
           mid=l+(h-l)/2;
           
           if(k==arr[mid]) return mid;
           
          else if(k<arr[mid]){
               h=mid-1;
           }
         else 
               l=mid+1;
           
           
           
           
           
       }
           return -1; 
            
            
        }
        
        
        
    }
