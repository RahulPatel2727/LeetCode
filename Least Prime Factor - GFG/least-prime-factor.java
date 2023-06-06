//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.leastPrimeFactor(n);
            for(int i = 1; i <=n; i++)
            {
                out.print(ans[i] + " ");
            }
            out.println();
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    static int[] sieveOfEratosthenes(int N)
    {
        int b[]=new int[N+1];
        for(int i=2;i<=N;i++)
        {
            if(b[i]==0)
            {
                b[i]=i;
                for(int j=i*i;j<=N;j+=i)
                {
                    if(b[j]==0)
                    b[j]=i;
                }
            }
        }
        b[1]=1;
        return b;
        // code here
    }
    public int[] leastPrimeFactor(int n)
    {
        return sieveOfEratosthenes(n);
    }
}