//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			String [] str = br.readLine().trim().split(" ");
			int N = Integer.parseInt(str[0]);
			int Q = Integer.parseInt(str[1]);
			int [][] U = new int[Q][3];
			int i = 0;
			while(i < Q) {
				str = br.readLine().trim().split(" ");
				U[i][0] = Integer.parseInt(str[0]);
				U[i][1] = Integer.parseInt(str[1]);
				U[i][2] = Integer.parseInt(str[2]);
				i++;
			}
			Solution obj = new Solution();
			int [] arr = obj.updateQuery(N, Q, U);
			for(int j: arr) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	 static int[] st; // Segment Tree
    static int[] lazy; // Lazy arra
    public int[] updateQuery(int N, int Q, int[][] U) {
        int[] a = new int[N];
        st = new int[4 * N];
        lazy = new int[4 * N];
        build(1, 0, N - 1);
        for (int i = 0; i < Q; i++) {
            int l = U[i][0] - 1;
            int r = U[i][1] - 1;
            int x = U[i][2];
            
            update(1, 0, N - 1, l, r, x);
        }
        query(1, 0, N - 1, a);
        
        return a;
    }
    
    static void build(int si, int ss, int se) {
        if (ss == se) {
            st[si] = 0;
            return;
        }
        
        int mid = (ss + se) / 2;
        build(2 * si, ss, mid);
        build(2 * si + 1, mid + 1, se);
        
        st[si] = 0;
    }
    
    static void propagate(int si, int ss, int se) {
        if (lazy[si] != 0) {
            st[si] |= lazy[si];
            
            if (ss != se) {
                lazy[2 * si] |= lazy[si];
                lazy[2 * si + 1] |= lazy[si];
            }
            
            lazy[si] = 0;
        }
    }
    
    static void update(int si, int ss, int se, int qs, int qe, int val) {
        propagate(si, ss, se);
        
        if (qs > se || qe < ss) {
            return;
        }
        
        if (qs <= ss && qe >= se) {
            st[si] |= val;
            
            if (ss != se) {
                lazy[2 * si] |= val;
                lazy[2 * si + 1] |= val;
            }
            return;
        }
        int mid = (ss + se) / 2;
        update(2 * si, ss, mid, qs, qe, val);
        update(2 * si + 1, mid + 1, se, qs, qe, val);
        
        st[si] = st[2 * si] | st[2 * si + 1];
    }
    
    static void query(int si, int ss, int se, int[] a) {
        propagate(si, ss, se);
        
        if (ss == se) {
            a[ss] = st[si];
            return;
        }
        
        int mid = (ss + se) / 2;
        query(2 * si, ss, mid, a);
        query(2 * si + 1, mid + 1, se, a);
    }
}