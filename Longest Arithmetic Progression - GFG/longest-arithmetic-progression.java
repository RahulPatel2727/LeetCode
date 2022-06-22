// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().lengthOfLongestAP(a, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends
class Solution {
    int lengthOfLongestAP(int[] A, int n) {
        if(n==1)return 1;
        int tempDif=Integer.MIN_VALUE;int res=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int d=A[j]-A[i];
                int a=A[i];
                int c=0;

                if(tempDif==d)continue;
                int h=0;
                for(int m=0;m<n;m++){
                    if(A[m]-a==h*d){
                        h++;
                        c++;
                    }
                }
                if(c>res)
                    res=c;
                tempDif=d;
            }
        }
        return res;
    }
}