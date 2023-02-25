//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            String T = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.checkCompressed(S,T));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int checkCompressed(String S, String T) {
        // code here
        int n = -1;
        int i = 0; int j = 0;
        while(i<S.length() && j<T.length()){
            char s = S.charAt(i);
            char t = T.charAt(j);
            if(t<58){
                if(n == -1){
                    n = t-'0';
                }
                else{
                    i -= n;
                    n = (10*n) + (t-'0');
                }
                i += n;
                j++;
            }
            else{
                n = -1;
                if(s != t){ return 0; }
                i++;
                j++;
            }
        }
        return (i != S.length() || j != T.length()) ?0 :1;
    }
}