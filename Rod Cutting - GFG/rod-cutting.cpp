//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution{
    int helper(int index, int W, int price[], int weight[], vector<vector<int>> &dp){
        if(W==0) return 0;
        if(index == -1) return 0;
        
        if(dp[index][W] != -1) return dp[index][W];
        
        int take = 0;
        if(W >= weight[index]) take = price[index] + helper(index, W-weight[index],price, weight, dp);
        int notTake = helper(index-1, W, price, weight, dp);
        
        return dp[index][W] = max(take, notTake);
    }
  public:
    int cutRod(int price[], int n) {
        int weight[n];
        weight[0] = 1;
        for(int i=1; i<n; i++){
            weight[i] = 1 + weight[i-1];
        }
        
        vector<vector<int>> dp(n, vector<int>(n+1, -1));
        
        return helper(n-1, n, price, weight, dp);
        
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int a[n];
        for (int i = 0; i < n; i++) 
            cin >> a[i];
            
        Solution ob;

        cout << ob.cutRod(a, n) << endl;
    }
    return 0;
}
// } Driver Code Ends