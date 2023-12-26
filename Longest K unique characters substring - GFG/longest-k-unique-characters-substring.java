//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        return maxDifCharUsingSet(s,k);
    }
    static int maxDifCharUsingSet(String str, int k){
        int max = 0;
        int n = str.length();
        int si=0;
        Set<Character> set = new HashSet<>();
        int []frq = new int[26];
        for(int cur = 0; cur<n; cur++){
            char ch = str.charAt(cur);
            set.add(ch);
            frq[ch-'a']++;
            while(si<=cur && set.size()>k){
                char siCh = str.charAt(si);
                if(frq[siCh-'a']==1){
                    frq[siCh-'a'] = 0;
                    set.remove(siCh);
                }else{
                    frq[siCh-'a']--;
                }
                si++;
            }
            if(set.size() == k)
                max = Math.max(max, cur - si + 1);
        }
        return max>0?max:-1;
    }
}