class Solution {
    public int nthUglyNumber(int n) {
        int [] dp = new int[n + 1];
        dp[0] = 1;
        int tw = 0, th = 0, fi = 0;
        for(int i = 1; i<=n; i++){
            dp[i] = Math.min(2 * dp[tw], Math.min(3*dp[th], 5*dp[fi]));
            if(dp[i] == 5*dp[fi]){
                fi++;
            }
            if(dp[i] == 3*dp[th]){
                th++;
            }
            if(dp[i] == 2*dp[tw]){
                tw++;
            }
        }
        return dp[n-1];
    }
}