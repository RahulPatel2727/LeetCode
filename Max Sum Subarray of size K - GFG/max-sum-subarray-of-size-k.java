//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        return maxWind(Arr,K);
    }
    static long maxWind(ArrayList<Integer> arr, int k){
        int n = arr.size();
        int si = 0;
        long curSum = 0, maxSum = 0;
        for(int i=0;i<n;i++){
            curSum += arr.get(i);
            if(i-si == k-1){
                maxSum = Math.max(maxSum, curSum);
                si ++;
                curSum -= arr.get(i-k+1);
            }
        }
        return maxSum;
    }
}