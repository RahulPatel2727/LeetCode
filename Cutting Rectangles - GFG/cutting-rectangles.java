//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            long L = Long.parseLong(input_line[0]);
            long B = Long.parseLong(input_line[1]);

            Solution ob = new Solution();
            List<Long> ans = new ArrayList<Long>();
            ans = ob.minimumSquares(L, B);
            System.out.print(ans.get(0)+" ");
            System.out.println(ans.get(1));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static List<Long> minimumSquares(long L, long B)
    {
        // code here
        List<Long> result = new ArrayList<>();

        // Find the GCD of L and B and the dimension K of the square

        long K = gcd(L, B);

        // Calculate the minimum number of identical squares

        long N = (L/K) * (B/K);

        // Add the results to the list

        result.add(N);

        result.add(K);

        return result;

    }

    public static long gcd(long a, long b) {

     if (b == 0) {

         return a;

     }

     return gcd(b, a % b);
    }
}