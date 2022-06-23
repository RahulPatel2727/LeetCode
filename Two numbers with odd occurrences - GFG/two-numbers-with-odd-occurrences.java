// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.twoOddNum(Arr,N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution
{
    public int[] twoOddNum(int Arr[], int N)
    {
        // code here
        int res = 0;
        for(int i=0;i<N;i++){
            res = res^Arr[i];
        }
        res=(res & ~(res-1));
        int c1=0,c2=0;
        for(int i=0;i<N;i++){
            if((Arr[i]&res)==0)
                c1^=Arr[i];
            else
                c2^=Arr[i];
        }
        return new int[]{(c1>c2)?c1:c2,(c1<c2)?c1:c2};
    }
}