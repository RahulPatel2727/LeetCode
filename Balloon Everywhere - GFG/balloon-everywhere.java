//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.maxInstance(s);
            out.println(ans);
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int maxInstance(String s) {
        // Code here
        return maxxInstance(s);
    }
    public static int maxxInstance(String s) {
        // Code here
        int [] freq  = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int min = Integer.MAX_VALUE;
        String b = "balloon";
        freq['l'-'a'] /= 2;
        freq['o'-'a'] /= 2;
        for(int i=0;i<7;i++){
            min = Math.min(min,freq[b.charAt(i)-'a']);
        }
        return min;
    }
}