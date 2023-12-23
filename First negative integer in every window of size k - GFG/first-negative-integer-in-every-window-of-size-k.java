//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        return firstNeg(A,K);
    }
    static long [] firstNeg(long []arr, int k){
        Queue<Long> q = new LinkedList<>();
        int n = arr.length;
        long [] ans = new long[n-k+1];
        int itr = 0;
        int si=0;
        for(int cur = 0; cur<n; cur++){
            if(arr[cur]<0){
                q.add(arr[cur]);
            }
            if(cur-si+1 == k){
                if(q.isEmpty()){
                    ans[itr++] = 0;
                }else if(arr[si]<0){
                    ans[itr++] = q.poll();
                }else{
                    ans[itr++] = q.peek();
                }
                si++;
            }
        }
        return ans;
    }
}