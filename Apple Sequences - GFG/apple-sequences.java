//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            String arr = read.readLine().trim();

            Solution ob = new Solution();
            out.println(ob.appleSequence(N, M, arr));
        }
        out.close();
    }
}


// } Driver Code Ends
//User function Template for Java


class Solution{
    public static int appleSequence(int n, int m, String arr){
        //code here
        int i = 0, j = 0, k = m;
        int maxLen = 0;
        while (j < n) {
            if (arr.charAt(j) == 'A') {
                j++;
            } else if (k > 0) {
                j++;
                k--;
            } else if (arr.charAt(i) == 'O') {
                i++;
                k++;
            } else {
                i++;
            }
            maxLen = Math.max(maxLen, j - i);
        }
        return maxLen;
    }
}


//{ Driver Code Starts.

// } Driver Code Ends