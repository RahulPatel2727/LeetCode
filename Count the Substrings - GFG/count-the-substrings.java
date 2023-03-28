//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.countSubstring(S);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int countSubstring(String S) 
    { 
        // code here
        int n = S.length(), cnt = 0;
        for(int i=0; i<n; i++) {
            int l = 0, u = 0;
            for(int j=i; j<n; j++) {
                if(S.charAt(j) >= 'a' && S.charAt(j) <= 'z') 
                    l++;
                else 
                    u++;
                if(l == u) 
                    cnt++;
            }
        }
        return cnt;
    }
} 
