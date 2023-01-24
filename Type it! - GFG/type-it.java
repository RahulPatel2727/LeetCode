//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String s = read.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.minOperation(s);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int minOperation(String s) {
        // code here
        if(s.length() == 1){
            return 1;
        }
        int ans = 0;
        String str = "";
        for(int i = 0; i < s.length(); i++){
            str += s.charAt(i);
            String S = s.substring(i + 1);
            if(S.indexOf(str) != -1){
                ans = i + 1;
            } 
            else{
                ans += (s.length() - (2 * ans) + 1);
                break;
            }
        }
        return ans;
    }
}